import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        //10 Rectangles
       Rectangle rectOne = new Rectangle(1, 1);
       rectangles.add(rectOne);
       Rectangle rectTwo = new Rectangle(2, 1);
       rectangles.add(rectTwo);
       Rectangle rectThree = new Rectangle(3, 1);
       rectangles.add(rectThree);
       Rectangle rectFour = new Rectangle(4, 1);
       rectangles.add(rectFour);
       Rectangle rectFive = new Rectangle(1, 2);
       rectangles.add(rectFive);
       Rectangle rectSix = new Rectangle(5,5);
       rectangles.add(rectSix);
       Rectangle rectSeven = new Rectangle(6,5);
       rectangles.add(rectSeven);
       Rectangle rectEight = new Rectangle(7,5);
       rectangles.add(rectEight);
       Rectangle rectNine = new Rectangle(8,5);
       rectangles.add(rectNine);
       Rectangle rectTen = new Rectangle(9,5);
       rectangles.add(rectTen);


        Filter bigRectangleFilter = new BigRectangleFilter();

        for (Rectangle r: rectangles) {
            if(bigRectangleFilter.accept(r)) {
                System.out.println(r);
            }
        }
    }
}
