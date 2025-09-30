class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("hello");
	FtoC(100.0);
	sphereVolume(20.0);
	coneVolume(2.0, 2.0);
	distance(1.0, 2.0, 3.0, 4.0);
  }
  String print(String word){
	System.out.println(word);
	return word;
  }
  double FtoC(double F){
	double C=(F-32)*(5/9.0);
	System.out.println(C);
	return C;
  }
  double sphereVolume(double r){
	double sV=(4/3.0)*Math.PI*Math.pow(r,3);
	System.out.println(sV);
	return sV;
  }
  double coneVolume(double r2, double h){
	double cV=Math.PI*Math.pow(r2,2)*(h/3.0);
	System.out.println(cV);
	return cV;
  }
  double distance(double x1, double x2, double y1, double y2){
	double slope=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	System.out.println(slope);
	return slope;
  }
}