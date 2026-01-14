class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }
  boolean isHealthy(){
    if(weight >= 30 && weight <=100){
      return true;
    }
    else{
      return false;
    }
  }
  double convertPoundsToKilo(){
    weight = weight/2.205;
    return weight;
  }
 

  // other class functions
  
  
  
}