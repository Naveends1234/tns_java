package basics;


		abstract class Shape {

		  abstract void draw();

		   void display() {
		        System.out.println("This is a shape");
		    }
		}

		
		class Circle extends Shape {
		    void draw() {
		        System.out.println("Drawing Circle");
		    }
		}

		
		class Rectangle extends Shape {
		    void draw() {
		        System.out.println("Drawing Rectangle");
		    }
		}

		
		public class Abstraction {
		    public static void main(String[] args) {

		        Shape s;   
		        s = new Circle();
		        s.draw();
		        s.display();

		        s = new Rectangle();
		        s.draw();
		        s.display();
		    }
	}


