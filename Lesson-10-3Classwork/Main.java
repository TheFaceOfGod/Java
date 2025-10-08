class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println(groupSavings(7));
    System.out.println(groceryDiscount(5,3000000.0));
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickets  : each ticket cost $8.50
    */
      double groupSavings(double tickets){
      if(tickets<=1.0 && tickets>=8.0){
        double cost = tickets*11.0;
        return cost;
      }
      else if(tickets<=9.0 && tickets>=16.0){
        double cost = tickets*10.5;
        return cost;
      }
      else{
        double cost = tickets*8.5;
        return cost;
      }
    }

  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
    double groceryDiscount(int cans, double cost){
      if(cost>=100.0 && cost<=200.0 && cans>=3){
        cost = cost-10.0;
        return cost;
      }
      else if(cost>=200.0 && cans>=4){
        cost = cost-25.0;
        return cost;
      }
      else{
        cost = cost-0.0;
        return cost;
      }
    }
  }