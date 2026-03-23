import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String result="";
    String sql = "";
     
		Database db = new Database("jdbc:sqlite:chinook.db" );	

    //1
    //For the first 30 tracks, get the name of the track and the album name that it belongs to.
    //sql = "select name, title from tracks  inner join albums on albums.albumid = tracks.albumid limit 30";
    
    
    //2
    //For each Invoice from April 2012, retrieve customer first and last name, invoice id, and Invoice date
    //sql = "select firstname,lastname,invoiceid,invoicedate from invoices inner join customers on customers.customerid=invoices.customerid where invoices.invoicedate like '2012-04%'";
    
    //3
    //For the first 20 invoices get the customer id, invoice id, track name, unit price and quantity .(Hint: information is in three tables) 
    //sql = "select customers.customerid, invoices.invoiceid, tracks.name, invoice_items.unitprice, invoice_items.quantity from customers inner join invoices on invoices.customerid = customers.customerid inner join invoice_items on invoices.invoiceid = invoice_items.invoiceid inner join tracks on tracks.trackid = invoice_items.trackid limit 20";

    //4
    //What is the list of customers' names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use billingcountry and remove duplicates)
    //sql = "select distinct customers.firstname, customers.lastname from customers inner join invoices on customers.customerid = invoices.customerid where billingcountry = 'USA' or billingcountry = 'Germany' or billingcountry = 'Poland'";
    
    //5
    //List the first 20 song (track) names that are “Latin” music?
    //sql = "select tracks.name from tracks inner join genres on genres.genreid = tracks.genreid where genres.name = 'Latin' limit 20";
    //6
    //List all the  “Jazz” album titles. (REMOVE DUPLICATES)
    //sql = "select distinct albums.title from albums inner join tracks on tracks.albumid = albums.albumid inner join genres on genres.genreid = tracks.genreid where genres.name = 'Jazz'";
    
    //7
    //List all the Pop Artist names.
    sql = "select distinct artists.name from artists inner join albums on artists.artistid = albums.artistid inner join tracks on tracks.albumid = albums.albumid inner join genres on genres.genreid = tracks.genreid where genres.name = 'Pop'";
    result = db.runSQL(sql,"table-auto");
    print(result);
  }    
}