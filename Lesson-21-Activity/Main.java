class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    allowance();
    addTwoNumbers();
    GCF(10, 5);
  }
  void allowance(){
    int day = 1;
    int cents = 1;
    while(!(cents>500)){
      print(cents);
      cents+=Math.pow(2,day);
      day++;
    }
    print("It took " + day + " days");
  }
  void addTwoNumbers(){
    int first = randInt(1,10);
    int second = randInt(1,10);
    print("What is the sum of " + first + " + " + second + "?");
    int ans = Input.readInt();
    while(!(ans==first+second)){
      print("What is the sum of " + first + " + " + second + "?");
    }
    print("Correct man!");
  }
  void GCF(int first, int second){
    while(!(second==0)){
      int x = second;
      second = first % second;
      first = x;
    }
    print(first);
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}