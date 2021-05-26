package Q1;

//defining super class shape
public class Shape {
	
	//Private member variable
	private String color;
	//Constructor
	
	public Shape(String color){
		this.color = color;
	}
     
	@Override
	public String toString(){
		return "Shape of color=\"" +color+"\"";
	}
	//All shapes must has a method called getArea()
	public double getArea(){
		System.out.println("Shape unknown!Cannot Compute area!");
		//Need a return to compile the program
		return 0;
	}
		
	}
     class Rectangle extends Shape {
    	 //Private member variables
    	 private int length;
    	 private int width;
    	 //Constructor
     public Rectangle(String color, int length, int width){
    	 super(color);
    	 this.length = length;
    	 this.width = width;
     }
        @Override
        public String toString(){
        	return"rectangle of length="+length+"and width="+width+",subclass of" + super.toString();
        }
    	 @Override
    	 public double getArea(){
    		 return length*width;
    	 }
    	 }
           //Define Triangle, subclass of Shape
       class Triangle extends Shape{
    	   //Private member variables
    	   private int base;
    	   private int height;
    	   //Constructor
    	   public Triangle(String color, int base, int height){
    		   super(color);
    		   this.base = base;
    		   this.height = height;
    	   }
    	   @Override 
    	   public String toString(){
    	   return"Triangle of base="+ base + "and height=" +height+ ",subclass of" + super.toString();    
    	   }
    	   @Override
    	   public double getArea(){
    	   return 0.5*base*height;
    	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
