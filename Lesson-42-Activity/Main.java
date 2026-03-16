
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
    //sql = "select * from cr101 where studentid = 'STUDENT1001'; update cr101 set room = 122 where studentid = 'STUDENT1001' and period = 3";
    //sql = "select * from cr101 where studentid = 'STUDENT1200'; delete from cr101 where course = 'ZQCTEDA' and studentid = 1200";
    //sql = "select * from cr101 where teacher1 = 'DOYLE'; update cr101 set room = 213 where teacher1 = doyle and (period = 4 or period = 5);";
    //sql = "select * from cr101 where teacher1 = 'ROFFLER' and section = 1; update cr101 set teacher1 = 'ROFFLER' where teacher1 = 'ARCHETTI' and course = 'MQF44QGF' and section = 1";
    sql = "select * from cr101 where teacher1 = 'DOYLE'; update cr101 set room = 213 where teacher1 = doyle and (period = 4 or period = 5);";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);
    
   
     
      }    
}