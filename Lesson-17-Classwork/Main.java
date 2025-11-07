class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(swapLetter("dumb", "u", "%"));
    System.out.println(encryption2("purples"));
    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }
  String swapLetter(String words, String letter, String condition){
    String bld = "";
    for(int x=0; x<=words.length()-1; x++){
      String ne = words.substring(x,x+1);
      if(ne.equals(letter)){
        bld += condition;
      }
      else{
        bld += ne;
      }
    }
    return bld;
  }
  String encryption2(String t){
    String bld = "";
      if(t.length()%2 !=0){
          String t1 = t.substring(0,t.length()/2);
          String t2 = t.substring(t.length()/2);
        for(int x = 0; x<=t.length(); x+=2){}
          String t3 = t1.substring(x,x+1);
          String t4 = t2.substring(x,x+1);
          bld = t3 + t4;
        if(t.length()%2 ==0){
          t1 = t.substring(0,t.length()/2);
          t2 = t.substring(t.length()/2);
        for(int x = 0; x<=t.length(); x+=2){}
          t3 = t1.substring(x,x+1);
          t4 = t2.substring(x,x+1);
          bld = t3 + t4;
        }
      }
      return bld;
  }
}