package oops_lab2;


public class Vector {
	double x,y ;
	Vector(double x, double y ){
		this.x = x;
		this.y= y;
	
	}
	double getX() {
		return x;
	}     
	double gety() {
		return y;
		
		
	}
	public double getY() {
		return y;
	}
    void setY(double y) {
		this.y = y;
	}
	void setX(double x) {
		this.x = x;
	}
	Vector scale (int factor) {
		double new_x= x * factor;
		double new_y= y* factor;
		return new Vector(new_x,new_y);
	}
	Vector add (Vector other) {
		 double new_x= this.x + other.x;
		 double new_y = this.y + other.y;
		 return new Vector(new_x,new_y);
		
		
		
	}
	Vector  subtract (Vector otherVector) {
		double new_x= this.x - otherVector.x;
		double new_y = this.y - otherVector.y;
		return new Vector(new_x , new_y);
	}
	double length (Vector other) {
		double r_squared= this.x +other.y;
		return Math.sqrt(r_squared);
		
	}
	
	
  
}
