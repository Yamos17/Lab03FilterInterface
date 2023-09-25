import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class BigRectLister {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        // Create a list of rectangles with various perimeters
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(3, 9));
        rectangles.add(new Rectangle(10, 2));

        Filter filter = new BigRectangleFilter();
        List<Object> bigRectangles = FilterUtils.collectAll(rectangles.toArray(), filter);

        for (Object rect : bigRectangles) {
            System.out.println(rect);
        }
    }
}

