
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
	System.out.println(gpa(3.9));
    System.out.println(isGraduating(12, 47));
	System.out.println(BMI(145.0, 67));
	System.out.println(shippingCost(32.0));
	System.out.println(blueOrViolet(740));
  }
  double gpa(double GPA){
	double raw = (GPA*100)/4;
	if(raw>90){
		return raw*1.1;
	}
	else{
		return raw;
	}
  }
  String isGraduating(int grade, int credits){
	boolean graduate = false;
	if(grade>11 && credits >= 44){
		graduate = true;
	}
	if(graduate == true){
		return "Student is Graduating";
	}
	else{
		return "Student is NOT Graduating";
	}
  }
  String BMI(double weight, int height){
	double bmi = (weight*703/height)/height;
	if(bmi<=18.4){
		return "Underweight";
	}
	else if(bmi<=24.9 && bmi>=18.5){
		return "Normal";
	}
	else if(bmi<=39.9 && bmi>=25.0){
		return "Overweight";
	}
	else{
		return "Obese";
	}
  }
  double shippingCost(double weight){
	if(weight<=10.0){
		return 0.00;
	}
	else if(weight<=15.0 && weight>10.0){
		return 5.00;
	}
	else if(weight<=25.00 && weight>15.00){
		return 10.00;
	}
	else{
		return 10.00+((weight-25.0)*0.02);
	}
  }
  boolean blueOrViolet(int THz){
	if((THz>=600 && THz<=670) || (THz>=700 && THz<=750)){
		return true;
	}
	else{
		return false;
	}
  }
}