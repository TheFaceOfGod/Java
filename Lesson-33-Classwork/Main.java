class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] grade1 = {99,94,90};
    double[] grade2 = {100,30,55};
    //Create a new student object 
    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student object 
    Student student1 = new Student("Dudeman",12,grade1,courses1);
    Student student2 = new Student("Dudeguy",9,grade2,courses2);

    if(student1.calculateAvg() > 70){
      print(student1.firstName);
    }
    if(student2.calculateAvg() > 70){
      print(student2.firstName);
    }
    
    if(student1.calculateAvg() >= 60 && 
       student1.calculateAvg()<= 70 &&
       student1.gradeLevel <= 10){
      print(student1.firstName);
    }
    if(student2.calculateAvg() >= 60 && 
       student2.calculateAvg()<= 70 &&
       student2.gradeLevel <= 10){
      print(student2.firstName);
    }
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}