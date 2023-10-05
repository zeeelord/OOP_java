package oops_lab2;

public class ShapesMain {
	public static void main (String[]args) {
		Vector v1 = new Vector(2,4);
		Vector v2 = new Vector(3,4);
		Rectangle rec = new Rectangle(v1, v2);
		Circle cir = new Circle (2,v1);
//		Vector vec = new Vector(5,9);
//		Vector vec1 = new Vector(6,9);
		printVector(v1);
		printRectangle(rec);
		printCircle(cir);
//		System.out.print("reference "+ vec);
////		
////		alternative
//		System.out.println("reference " + vec.getY());
//		System.out.println("reference " + vec.getX());		
//		int scaleFactor = 2;
//		Vector scaledVector = vec.scale(scaleFactor);
//	    printVector(scaledVector);
//	    Vector result = vec.subtract(vec1);
//	    System.out.println(vec.getY());
//	    
//	   }
//
	
} 
	static void printCircle(Circle cir) {
		System.out.println("reference" + cir);
		System.out.println("getting diameter " + cir.getArea(2));
		System.out.println("getting area " + cir.getDiameter(2));		
	}
	static void printVector(Vector vec) {

		System.out.println("reference" + vec);
		
		System.out.println("Vector x " + vec.getX());
		System.out.println("Vector y " + vec.getY());	
		
		}
		
	  static void printRectangle(Rectangle rect) {
	        System.out.println("Rectangle Width: " + rect.getWidth());
	        System.out.println("Rectangle Height: " + rect.getHeight());
	        System.out.println("Rectangle Center: " + rect.getcenter());
	    }
	
	}