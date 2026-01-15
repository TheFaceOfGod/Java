class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] grade1 = {60,70,90};
    double[] grade2 = {65,75,60};

    String[]  course1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  course2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student object 
    Student s1 = new Student("Dudeman",12,50, grade1,course1);

    Student s2 = new Student("Dudeguy",9,100, grade2,course2);

    
  }


  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}