class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(spaces(100));
    System.out.println(harmonic(100));
    System.out.println(fib(6));
  }
  String spaces(int N){
    String withspace = "";
    for(int i=0; i<=N; i++){
      withspace += " ";
    }
    return withspace+="DONE";
  }
  double harmonic(int N){
    double ans = 0.0;
    for(int i=1; i<=N; i++){
      ans += Math.pow(i,-1);
    }
    return ans;
  }
  double sine(int terms, String degrees){
    return 0.0;
  }
  int fib(int term){
    int firstone=0, secondone=1;
    int sum = 0;
    System.out.println(firstone);
    System.out.println(secondone);
    for(int i=0; i<term; i++){
      sum += firstone + secondone*i;

      System.out.println(sum);
    }
    return 0;
  }
  
}