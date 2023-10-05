package oops_lab2;

public class Rectangle {
	Vector v1;
	Vector v2; 
	Rectangle (Vector v1, Vector v2){
		this.v1=  v1;
		this.v2 = v2;
		
	}
	double getWidth() {
		 return v2.getX() -v1.getX();
		 }
	double getHeight () {
		return v2.getY() - v2.gety(); 	}
	double area (double width , double height) {
		return getWidth() * getHeight();
	}
	 Vector getcenter() {
		 double centerX= (v1.getX() + v2.getX())/2;
		 double centerY= (v1.getY()+ v2.getY())/2;
		 return new Vector (centerX, centerY);
	 }
	boolean getcontain(Vector point) {
		boolean isXWithinRange = (point.x >= this.v1.x) && (point.x <= this.v2.x);
	    boolean isYWithinRange = (point.y >= this.v1.y) && (point.y <= this.v2.y);
	    return isXWithinRange && isYWithinRange;
	    
	}
	
}