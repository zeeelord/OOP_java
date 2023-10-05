package oops_lab2;

public class Circle {
 double radius;
 Vector Center;
 
 Circle (double radius, Vector Center){
	 this.radius = radius;
	 this.Center = Center;
 }
double getDiameter(double radius){
	return 2* this.radius;
}double getArea(double radius){
	return Math.PI*Math.pow(this.radius,2);
}
boolean Contains(double radius, Vector point) {
	Vector offSet = point.subtract(this.Center);
	return offSet.length(offSet) <= this.radius;
}
Rectangle bounding_box(Vector x, Vector y) {
    double cx = this.Center.getX();
    double cy = this.Center.gety();
    Vector p1=new Vector(cx - this.radius, cy-this.radius);
    Vector p2 =new Vector (cx + this.radius,cy + this.radius);
    return new Rectangle(p1, p2) ;
}

}
