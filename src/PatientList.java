import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by PierreM on 26/01/2015.
 */
public class PatientList {
    public static void main(String[] args) {
        PatientList pl = new PatientList();
        pl.run();
    }

    public void run() {
        List<Patient> list = new LinkedList<Patient>();
        try {
            Patient p1 = new Patient("Smith", 2016);
        } catch (IllegalArgumentException ex) {
            System.out.println("Try again!");
        }
    }
}
