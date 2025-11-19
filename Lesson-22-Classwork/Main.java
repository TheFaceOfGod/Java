class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] frends = {"gordon", "dudeman", "mister"};
    print(frends[0]);
    double[] tempC = {10, 40, 58};
    double[] tempF = convert(tempC);
    for(int i = 0; i < f.length; i++){
      print(tempF[i]);
    }
  }
  double[] convert(double[] c){
    double[] f = new double[c.length];
    for(int i = 0; i < f.length; i++){
      f[i] = c[i]*9/5+32;
    }
    return f;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}