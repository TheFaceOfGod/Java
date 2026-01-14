class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Animal cow = new Animal("cow", 90, 5);
    System.out.println(cow.isHealthy());
    Animal bird = new Animal("bird", 10, 2);
    System.out.println(bird.isHealthy());
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}