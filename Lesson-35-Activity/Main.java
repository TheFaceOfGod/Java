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
    double failing = 0;
    double passing = 0;
    int failingcastro = 0;
    int failingmusic = 0;
    int freshiesophies = 0;
    int banuporchetta = 0;
    int fsjs = 0;
    int porchettafreshmen = 0;
    int porchettasophomores = 0;
    int porchettajuniors = 0;
    int porchettaseniors = 0;
    for(int i = 0; i < students.length; i++){
      Student student = students[i];
      if(student.gpa < 65 && student.findTeacher("castro r")){
        failingcastro ++;
      }
      if(student.gpa < 65 && student.findCourseStartingWith("UL")){
        failingmusic ++;
      }
      if(student.gpa < 65){
        failing ++;
      }
      if(student.gpa >= 65){
        passing ++;
      }
      if(student.gpa >= 65 && student.gradeLevel < 11){
        freshiesophies ++;
      }
      if(student.findTeacher("banu") && student.findTeacher("porchetta")){
        banuporchetta ++;
      }
      if(student.gradeLevel > 8 && student.gradeLevel < 13){
        fsjs ++;
      }
      if(student.findTeacher("porchetta") && student.gradeLevel == 9){
        porchettafreshmen ++;
      }
      if(student.findTeacher("porchetta") && student.gradeLevel == 10){
        porchettasophomores ++;
      }
      if(student.findTeacher("porchetta") && student.gradeLevel == 11){
        porchettajuniors ++;
      }
      if(student.findTeacher("porchetta") && student.gradeLevel == 12){
        porchettaseniors ++;
      }
    }
    print(passing + " students are passing");
    print(failing + " students are failing");
    double percent = 0;
    percent = failing/students.length*100;
    print(percent + "% of students are failing");
    print(failingcastro + " students are failing Mr. Castro");
    print(failingmusic + " students are failing music");
    print(freshiesophies + " freshmen and sophomores are passing");
    print(banuporchetta + " students have both Banu and Porchetta");
    print(fsjs + " students are freshmen and sophomores and juniors and seniors");
    int studentnum = porchettafreshmen+porchettasophomores+porchettajuniors+porchettaseniors;
    print("Out of " + studentnum + " students, " + porchettafreshmen + " are freshmen, " + porchettasophomores + " are sophomores, " + porchettajuniors + " are juniors, and " + porchettaseniors + " are seniors");
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}