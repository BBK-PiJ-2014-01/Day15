import java.util.LinkedList;
import java.util.List;

/**
 * Created by PierreM on 26/01/2015.
 */

public class PrimeDivisorList implements PrimeDivisorListReq {
    List<Integer> list;

    public PrimeDivisorList() {
        list = new LinkedList<Integer>();
    }

    @Override
    public void add(Integer number) {
        int counter = number - 1;
        double computation = 0;
        while (counter > 1) {
            computation = number % counter;
            if (computation == 0) {
                throw new IllegalArgumentException("Haha");
            }
            counter -= 1;
        }
        list.add(number);
    }

    @Override
    public void remove(Integer number) {
        list.remove(number);
    }

    @Override
    public String toString() {
        String output = "";
        for (int i=0;i<list.size();i++)
            output += (list.get(i)+" ");
        return(output);
    }
}
