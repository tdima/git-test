import java.awt.*;
import java.util.Arrays;

/**
 * A sample of a ploymorphic method.
 *
 * @author scottm
 */
public class CreateASet {

  public static void main(String[] args) {
    String[] words = {"A", "B", "B", "D", "C", "A"};
    System.out.println("original: " + Arrays.toString(words));
    System.out.println("as a set: ");
    Rectangle[] rectList = {new Rectangle(), new Rectangle(),
            new Rectangle(0, 1, 2, 3), new Rectangle(0, 1, 2, 3)};
    System.out.println("original: " + Arrays.toString(rectList));
    System.out.println("as a set: ");
    Object[] mixed = {"A", "C", "A", "B", new Rectangle(),
            new Rectangle(), "A", new Rectangle(0, 1, 2, 3), "D"};
    System.out.println("original: " + Arrays.toString(mixed));
    System.out.println("as a set: ");
  }
}