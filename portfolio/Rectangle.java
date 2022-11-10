package javaclass;

public class Rectangle {
	
	public int width;
	public int height;
	
	
	public int getArea() {
		return width * height;
	}
	
	
	public void draw() {
		for(int i = 0; i<height; i++) {
			for(int j=0; j<width; j++) { 
				if(i==0 || i==height-1 || j==0 || j==width-1) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
	
	
}
