class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(approxPI(5));

  }
  double approxPI(int term){
    double begin = 1;
    double pi = 0;
    double Wew = 0;
    for(int i = 1; i<=term; i++){
      pi += 4*Wew;
    }
    return pi;
  }
  
  
  
}