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
    int port = 8300;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:catTable.db");
    Database db2 = new Database("jdbc:sqlite:enemyTable.db");
    
  
    server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect....") );

    // Add your routes here....
    String sql = "";
    String queryResult ="";

    String sql2 = "";
    String queryResult2 ="";
    sql = "select * from catTable";
    queryResult = db.runSQL(sql,"table-auto");

    sql2 = "select * from enemyTable";
    queryResult2 = db2.runSQL(sql2,"table-auto");

    server.createContext("/cats", new RouteHandler(db,sql) );
    print(queryResult);
    
    server.createContext("/enemies", new RouteHandler(db2,sql2) );
    print(queryResult2);
      
    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


