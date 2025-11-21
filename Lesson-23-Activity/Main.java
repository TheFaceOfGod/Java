class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] costs = {10.99,30.99,40.99,50.99};
    print(total(costs));
    int[] nums = {45,31,65,2,5,54};
    print(isin(nums, 10));
    int[] lottochance = {45,2,34,32,7,9};
    print(checkLotto(nums, lottochance));
    int[] morenums = {1,2};
    print(biggest(morenums));
  }
  double total(double[] thearray){
    double sum = 0;
    for(int i = 0; i < thearray.length; i++){
      sum += thearray[i];
    }
    sum = sum*1.08525;
    return sum;
  }
  boolean isin(int[] thearray, int thenum){
    boolean in = false;
    for(int i = 0; i < thearray.length; i++){
      if(thearray[i] == thenum){
        in = true;
      }
    }
    return in;
  }
  int checkLotto(int[] thearray, int[] thearray2){
    int count = 0;
    for(int i = 0; i < thearray.length; i++){
      if(isin(thearray,thearray2[i])){
        count++;
      }
    }
    return count;
  }
  int biggest(int[] num){
    int fakenum = 0;
    for(int i = 0; i < num.length; i++){
      if(num[i]>fakenum){
        fakenum++;
      }
    }
    return fakenum;
  }
  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}