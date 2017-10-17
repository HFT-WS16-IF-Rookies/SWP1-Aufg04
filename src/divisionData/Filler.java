/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:55
 */
package divisionData;

import de.hft_stuttgart.unittest.loader.Skeleton;

@Skeleton
public final class Filler {

    static {
        System.err.println("Please call injectClass(\"divisionData.Filler\"), you've imported a skeleton");
    }

    public Filler() {

    }

    public static State fill(Club[] clubs) {
        State s = new State();
        int j = 0;
        int k = 0;
        for (int i = 0; i < clubs.length; i++) {
            if (i == clubs.length - 1) {
                s.joker = clubs[i];
            }else if (i == clubs.length - 2) {
                s.antij = clubs[i];
            }else if (i > 0 && i <= clubs.length / 2 - 1) {
                s.lower[j] = clubs[i];
                j++;
            }else if (i >= clubs.length / 2 && i > clubs.length - 2) {
                s.upper[k] = clubs[i];
                k++;
            }
        }
        return s;
    }
}
