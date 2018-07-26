
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape[] = new Shape[3];
		
	    shape[0] = new Circle();
	    shape[0].draw();
	    
	    shape[1] = new Polygon();
	    shape[1].draw();
	    
	    shape[2] = new Rectangle();
	    shape[2].draw();

	}

	private static void performDraw(Shape shapeCircle) {
		shapeCircle.draw();
	}

}
