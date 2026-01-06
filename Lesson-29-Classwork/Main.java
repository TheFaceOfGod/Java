class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    dog Toto = new dog();
    Toto.name = "Toto";
    dog Snoopy = new dog();
    Snoopy.name = "Snoopy";
    dog Poopy = new dog();
    Poopy.name = "Poopy";
    
  }
  class dog{
    String breed;
    int age;
    String name;
    void bark(){
      System.out.println("Woof woof my name is" + name);
    }
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}