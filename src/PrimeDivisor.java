/**
 * Created by PierreM on 26/01/2015.
 */
public class PrimeDivisor {
    public static void main(String[] args) {
        PrimeDivisor pd = new PrimeDivisor();
        pd.run();
    }

    public void run() {
        PrimeDivisorList list = new PrimeDivisorList();

        try {
            list.add(7);
            list.add(6);
            // list.add(null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Not a prime number");
        } catch (NullPointerException ex) {
            System.out.println("Null value not allowed");
        }
        System.out.println(list.toString());

    }
}
