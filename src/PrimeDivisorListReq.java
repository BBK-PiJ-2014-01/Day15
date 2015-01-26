/**
 * Created by PierreM on 26/01/2015.
 */
public interface PrimeDivisorListReq {
    /*
     * Adding a prime number to the list
     */
    void add(Integer number);

    /*
     * Removing a number from the list
     */
    void remove(Integer number);

    String toString();
}
