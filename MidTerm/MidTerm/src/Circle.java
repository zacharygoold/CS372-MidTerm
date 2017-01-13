
public class Circle implements Shape{
	String color;
	int length, width, area, perimeter, radius;
	
	public int getRadius(){
		int r = 0;
		//get it from reader, return that value 
		
		return r;
	}
	

	@Override
	public String getKind() {
		System.out.printf("Circle");
		return null;
	}

	@Override
	public String getDetailString() {
		System.out.printf("Color: " + color);
		System.out.printf("\nLength: " + length);
		System.out.printf("\nWidth: " + width);
		System.out.printf("\nArea: " + area);
		System.out.printf("\nPerimeter: " + perimeter);
		return null;
	}

	@Override
	public int getID() {
		System.out.printf("Circle");
		return 0;
	}

}
