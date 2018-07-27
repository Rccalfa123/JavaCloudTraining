//Shape Test Class 
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
	   Shape shapeCircle = new Circle();
	   performDraw(shapeCircle);
	   

	   Shape shapePolygon = new Polygon();
	   performDraw(shapePolygon);
	   
	   

	   Shape Rectangle = new Rectangle();
	   performDraw(Rectangle);
	   
	}

	private static void performDraw(Shape shapeCircle) {
		shapeCircle.draw();
	}

}
