/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:56
 */
package divisionData;

import java.util.Arrays;
import java.util.Objects;

public class State
{

    public Club upper[];
    public Club lower[];
    public Club joker;
    public Club antij;

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final State other = (State) obj;
        if (!Arrays.deepEquals(this.upper, other.upper))
        {
            return false;
        }
        if (!Arrays.deepEquals(this.lower, other.lower))
        {
            return false;
        }
        if (!Objects.equals(this.joker, other.joker))
        {
            return false;
        }
        if (!Objects.equals(this.antij, other.antij))
        {
            return false;
        }
        return true;
    }


    public String toString()
    {
        return "State{"
                + "upper=" + Arrays.toString(this.upper) + ", "
                + "lower=" + Arrays.toString(this.lower) + ", "
                + "joker=" + this.joker.toString() + ", "
                + "antij=" + this.antij.toString()
                + "}";
    }

    public String toString(boolean isOdd)
    {
        return "no time left";
    }

    private Club[] reverse(Club[] orig)
    {
        // Roughly 3 lines of implementation
        Club[] reverse = new Club[orig.length];
        for (int i=0; i < orig.length; i++)
        {
            reverse[reverse.length -1 -i] = orig[i];
        }
        return reverse;
    }

}
