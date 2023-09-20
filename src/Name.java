package sew3.theorie.junit.src;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple class which interprets a string as name.
 * The names are separated by whitespace. The last word is considered as last name, all other words as first names;
 */
public class Name {

    private String[] firstNames;
    private String lastName;

    /**
     * Creates a new name object.
     *
     * @param string string with the full name.
     */
    public Name(String string) {

        String[] parts = string.split(" ");
        if (parts.length < 2) {
            throw new IllegalArgumentException("Illegal name");
        }

        lastName = parts[parts.length-1];
        firstNames = Arrays.copyOfRange(parts, 0, parts.length-1);
    }

    public String[] getFirstNames() {
        return firstNames;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfFirstNames(){
        return firstNames.length;
    }

}
