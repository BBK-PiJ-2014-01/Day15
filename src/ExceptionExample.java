import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pierre on 25/01/2015.
 */
public class ExceptionExample {
    List<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        ExceptionExample e = new ExceptionExample();
        e.launch();
    }

    public void launch() {
        try {
            // more code here
            list.add(newElement);
            // more code here
        } catch (Exception ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
