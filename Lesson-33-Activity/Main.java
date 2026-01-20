class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem phone = new CartItem("iphone pro", 2000.99, 1, false);
    CartItem rock = new CartItem("small rocks", 10.00, 4, true);
    System.out.println("The " + rock.itemName + " is " + rock.itemPrice + " dollars");
    CartItem smartboard = new CartItem("smartboard", 300000.00, 2, true);
    System.out.println("The " + smartboard.itemName + " is " + smartboard.itemPrice + " dollars");
    System.out.println("The total price of your cart is " + (phone.itemPrice+rock.itemPrice+smartboard.itemPrice) + " dollars");
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}