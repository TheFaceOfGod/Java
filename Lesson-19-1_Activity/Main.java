class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    System.out.println(rollDice());
    System.out.println(lotto());
    System.out.println(additionTutor());
  }
  String rollDice(){
    int firstroll = (int)(Math.random()*6)+1;
    int secondroll = (int)(Math.random()*6)+1;
    String ans= firstroll + " " + secondroll;
    return ans;
  }
  String lotto(){
    int first = (int)(Math.random()*48)+1;
    int second = (int)(Math.random()*48)+1;
    int third = (int)(Math.random()*48)+1;
    int fourth = (int)(Math.random()*48)+1;
    int fifth = (int)(Math.random()*48)+1;
    String winner = first + " " + second + " " + third + " " + fourth + " " + fifth;
    return winner;
  }
  String additionTutor(){
    int one = (int)(Math.random()*1000000000);
    int two = (int)(Math.random()*1000000000);
    int ans = one + two;
    System.out.println("What is the answer?:" + one + "+" + two);
    int humanans = Input.readInt();
    if(humanans == ans){
      return "Correct!!!!!!";
    }
    else{
      return "Incorrect broski";
    }
  }

}
