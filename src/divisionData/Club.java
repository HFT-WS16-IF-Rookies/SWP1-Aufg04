/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:55
 */
package divisionData;

import de.hft_stuttgart.unittest.loader.Skeleton;
import java.util.Objects;

@Skeleton
public class Club {

    static {
        System.err.println("Please call injectClass(\"divisionData.Club\"), you've imported a skeleton");
    }

    private final int number;
    private final String name;

    public Club(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Club)) {
            return false;
        }
        Club c = (Club) obj;
        if (!(this.number == c.number)) {
            return false;
        } else if (!(this.name.equals(c.name))) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Club{number=" + number + ", name=" + name + "}";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.number;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
