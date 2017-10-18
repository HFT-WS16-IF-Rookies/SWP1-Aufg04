/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:55
 */

package divisionData;

import java.util.Objects;

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
        if (!(this.home.equals(temp.home)))
        {
            return false;
        }

        if (!(this.guest.equals(temp.guest)))
        {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Game{"
                + "home="
                + this.home.toString() + ", "
                + "guest="
                + this.guest.toString()
                + "}";
    }

    @Override
    public int hashCode()
    {

        int p1 = 7;
        int p2 = 97;
        int hash = 0;

        hash = (int) Math.pow(p2, 2) * p1;
        hash += p2 * Objects.hashCode(this.home);
        hash += p2 * Objects.hashCode(this.guest);
        return hash;

        /*
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.home);
        hash = 97 * hash + Objects.hashCode(this.guest);
        return hash;
        */
    }


    public Club getGuest() {
        return this.guest;
    }

    public Club getHome() {
        return this.home;
    }
}

