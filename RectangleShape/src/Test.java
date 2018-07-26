import java.util.*;

import org.w3c.dom.css.Rect;
public class Test {

	public static void main(String[] args) {
				Rectangle rectangle1 = new Rectangle(10,60);
				Rectangle rectangle2 = new Rectangle(20, 30);
				if(rectangle2.area() == rectangle1.area())
				{
					System.out.println("Rectangle1 = "+rectangle1.getBreadth()*rectangle1.getLength());
					System.out.println("Rectangle2 = "+rectangle2.getBreadth()*rectangle2.getLength());
					System.out.println("Area is Same");
				}
				else
				{
					System.out.println("Rectangle1 = "+rectangle1.getBreadth()*rectangle1.getLength());
					System.out.println("Rectangle2 = "+rectangle2.getBreadth()*rectangle2.getLength());
					System.out.println("Area is different....");
				}

	}

}
