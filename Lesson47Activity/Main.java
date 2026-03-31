import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    
    

   // Add your  code here
    server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect....") );
    String sql = "";
    String sql1 = "";
    String sql2 = "";
    String sql3 = "";
    sql  = "Select * from customers";
    server.createContext("/customers", new RouteHandler(db,sql));
    sql1  = "Select * from employees";
    server.createContext("/employees", new RouteHandler(db,sql1));
    sql2  = " Select tracks.name,artist.name from tracks";
    sql2 += " Inner Join albums ON tracks.albumid=albums.albumid";
    sql2 += " Inner Join artists ON albums.artistid=artists.artistid limit 10";
    server.createContext("/songs", new RouteHandler(db,sql2));
    sql3  = "Select customers.firstname, customers.lastname, tracks.name, invoices.invoicedate from customers";
    sql3 += "inner join invoices on customers.customerid = invoices.customerid";
    sql3 += "inner join invoice_items on invoices.invoiceid = invoice_items.invoiceid";
    sql3 += "inner join tracks on invoice_items.trackid = tracks.trackid limit 10";
    server.createContext("/customersongs", new RouteHandler(db,sql3));
    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


