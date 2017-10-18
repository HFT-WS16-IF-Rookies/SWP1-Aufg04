/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:55
 */
package divisionData;

public class Shifter
{

    private final State state;

    public Shifter(State state)
    {
        this.state = state;
    }

    public void update(boolean oddDay)
    {
        if (oddDay)
        {
            System.out.println("Day is odd, but don't know why^^");
        }
        else
        {
            System.out.println("normal day");
        }
    }

    Club pushBack(Club newClub, Club[] state)
    {
        Club fallout = state[0];
        for(int i=0; i < state.length -1; i++)
        {
            state[i] = state[i+1];
        }
        state[state.length -1] = newClub;

        return fallout;
    }

    Club pushFront(Club newClub, Club[] state)
    {
        Club fallout = state[state.length -1];
        for(int i=state.length -2; i >= 0; i--)
        {
            state[i+1] = state[i];
        }
        state[0] = newClub;

        return fallout;
    }

}
