class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car mycar1 = new Car("Toyota", "gray", "Corolla", 2009, 10000.0);
    System.out.println("This car is a "+mycar1.color+" "+mycar1.year+" "+mycar1.brand+" "+mycar1.model+" that is worth $"+mycar1.value);
    Car mycar2 = new Car("Ford", "red", "F150", 2012, 23000.0);
    System.out.println("This car is a "+mycar2.color+" "+mycar2.year+" "+mycar2.brand+" "+mycar2.model+" that is worth $"+mycar2.value);
  }
  class Car{
    String brand;
    String color;
    String model;
    int year;
    double value;
    Car(String brand, String color, String model, int year, double value){
      this.brand = brand;
      this.color = color;
      this.model = model;
      this.year = year;
      this.value = value;
    }
    void honk(){
      
    }
  }

  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}