class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("hello");
	FtoC(100);
	sphereVolume(20);
	coneVolume(2, 2);
	distance(1, 2, 3, 4);
  }
  void print(String word){
	System.out.println(word);
  }
  void FtoC(double F){
	double C=(F-32)*(5/9.0);
	System.out.println(C);
  }
  void sphereVolume(double r){
	double sV=(4/3.0)*Math.PI*Math.pow(r,3);
	System.out.println(sV);
  }
  void coneVolume(double r2, double h){
	double cV=Math.PI*Math.pow(r2,2)*(h/3.0);
	System.out.println(cV);
  }
  void distance(double x1, double x2, double y1, double y2){
	double slope=(x2-x1)/(y2-y1);
	System.out.println(slope);
  }
}