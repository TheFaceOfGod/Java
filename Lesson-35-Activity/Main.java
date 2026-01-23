class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // add your code below here
    int failing = 0;
    int passing = 0;
    for(int i = 0; i < students.length; x++){
      Student student = students[i];
      if(student.gpa < 65){
        failing ++;
      }
      if(student.gpa >= 65){
        passing ++;
      }
    }
    print(passing + " students are passing");
    print(failing + " students are failing");
    
    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}