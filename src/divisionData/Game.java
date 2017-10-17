/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:55
 */

package divisionData;

public class Game {

    private final Club home;
    private final Club guest;

    public Game(Club home, Club guest) {
        this.home   = home;
        this.guest  = guest;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }

        if (!(this.getClass() == obj.getClass()))
        {
            return false;
        }

        if (this == obj)
        {
            return true;
        }

        Game temp = (Game) obj;
        if (!(this.home == temp.home))
        {
            return false;
        }

        if (!(this.guest == temp.guest))
        {
            return false;
        }

        return true;
    }

    public String toString() {
        return "Game{"
                + "home="
                + this.home.toString() + ", "
                + "guest="
                + this.guest.toString()
                + "}";
    }

    public int hashCode() {
        // Roughly 2 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Club getGuest() {
        return this.guest;
    }

    public Club getHome() {
        return this.home;
    }
}

