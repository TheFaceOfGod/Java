class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    String msg = Input.readFile("Original.txt");
    print(encode(msg));
    print(decode(encode(msg)));
    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.
  String encode(String message){
    String bld = "";
    for(int i = 0; i < message.length(); i++){
      char ch = message.charAt(i);
      int ascii = (int)ch;
      ascii = (char)(ascii + 3);
      bld += ascii;
    }
    return bld;
  }
  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.
  String decode(String message){
    String bld = "";
    for(int i = 0; i < message.length(); i++){
      char ch = message.charAt(i);
      int ascii = (int)ch;
      ascii = (char)(ascii - 3);
      bld += ascii;
    }
    return bld;
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}