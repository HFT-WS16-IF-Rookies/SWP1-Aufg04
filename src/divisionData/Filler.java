/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:55
 */
package divisionData;

import java.util.Arrays;

public final class Filler
{
    public static State fill(Club[] clubs)
    {
        if (clubs.length < 4)
        {
            throw new IllegalArgumentException("Number of clubs must be even and larger or equal to 4");
        }

        State s = new State();

        s.antij = clubs[clubs.length -2];
        s.joker = clubs[clubs.length -1];

        s.upper = new Club[((clubs.length -2) / 2)];
        s.lower = new Club[s.upper.length];

        int j = clubs.length -3;
        for (int i=0; i < s.upper.length; i++)
        {
            s.upper[i] = clubs[i];
            s.lower[i] = clubs[j--];
        }

        return s;
    }

}
