import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pierre on 25/01/2015.
 */
public class ExceptionExample {


    public static void main(String[] args) {
        ExceptionExample e = new ExceptionExample();
        e.launch();
    }

    public void launch() {
        try {
            List<Integer> list = new LinkedList<Integer>();
            list.add(10);
            list.remove(0);
            list.remove(0);
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
