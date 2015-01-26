import java.util.Date;

/**
 * Created by PierreM on 26/01/2015.
 */
public class Patient {

    private String name;
    private int yearOfBirth;

    public String getName() {
        return(name);
    }

    public int getYearOfBirth() {
        return(yearOfBirth);
    }

    public Patient(String name, int yearOfBirth) {
        if (((yearOfBirth - 2015) > 130) || ((2015 - yearOfBirth) < 0))
            throw new IllegalArgumentException("Age problem!!!");
        else {
            this.name = name;
            this.yearOfBirth = yearOfBirth;
        }
    }
}
