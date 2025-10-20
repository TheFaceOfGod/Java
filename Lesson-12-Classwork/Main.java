class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   collegeCredit("qadwded");
   getCounsoler("cccccc");
   imageType("people.PNG");
  }
  
  boolean collegeCredit(String code){
    boolean cred = false;
    if(code.substring(6,7).equalsIgnoreCase("E") || code.substring(5,6).equalsIgnoreCase("M")){
      cred = true;
    }
    return cred;
  }

  String getCounsoler(String ofclass){
    String person = null;
    if(ofclass.substring(0,1).equalsIgnoreCase("B") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("B")){
      person = "Berrouet";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("C") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("C")){
      person = "Chu";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("D") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("D")){
      person = "Dinn";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("E") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("E")){
      person = "Eyzengart";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("F") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("F")){
      person = "Flores";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("G") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("G")){
      person = "Gibson";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("L") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("L")){
      person = "Shim Lee";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("M") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("M")){
      person = "Meltzer";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("P") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("P")){
      person = "Paccione";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("S") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("S")){
      person = "Fiore";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("T") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("T")){
      person = "Tsai";
    }
    else if(ofclass.substring(0,1).equalsIgnoreCase("Z") || ofclass.substring(ofclass.length()/2,ofclass.length()/2+1).equalsIgnoreCase("Z")){
      person = "Zayes";
    }
    return person;
  }
  String imageType(String image){
    String type = null;
    if(image.substring(image.length()-4).equals("JPG") || image.substring(image.length()-4).equals("JPEG")){
      type = "Joint Photographic Experts Group";
    }
    else if(image.substring(image.length()-4).equals("PNG")){
      type = "Portable Network Graphics";
    }
    else if(image.substring(image.length()-4).equals("GIF")){
      type = "Graphics Interchange Format";
    }
    else{
      type = "Portable Document Format";
    }
    return type;
  }
}