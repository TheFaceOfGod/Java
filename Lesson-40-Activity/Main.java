
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
   

    String queryResult="";
    String sql ="";
    Database   db =  new  Database("jdbc:sqlite:students.db");	
    sql = "select * from cr101 where teacher1 = 'BANU'";
    queryResult = db.runSQL(sql,"table-auto");
    //print(queryResult);

    String queryResult1="";
    String sql1 ="";
    sql1 = "select * from cr101 where teacher1 = 'PORCHETTA' and period = '10'";
    queryResult1 = db.runSQL(sql1,"table-auto");
    //print(queryResult1);

    String queryResult2="";
    String sql2 ="";
    sql2 = "select distinct studentid from cr101";
    queryResult2 = db.runSQL(sql2,"table-auto");
    //print(queryResult2);
    
    String queryResult3="";
    String sql3 ="";
    sql3 = "select studentid, course, period from cr101 where room in('322','105','106','323')";
    queryResult3 = db.runSQL(sql3,"table-auto");
    //print(queryResult3);
     
    String queryResult4="";
    String sql4 ="";
    sql4 = "select * from cr101 where course like 'm%x'";
    queryResult4 = db.runSQL(sql4,"table-auto");
    print(queryResult4);
  }    
}