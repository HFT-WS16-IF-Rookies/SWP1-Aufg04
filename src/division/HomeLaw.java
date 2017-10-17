/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:56
 */

package division;

import de.hft_stuttgart.unittest.loader.Skeleton;
import divisionData.Club;
import divisionData.Game;

@Skeleton
public class HomeLaw {
    static {
        System.err.println("Please call injectClass(\"division.HomeLaw\"), you've imported a skeleton");
    }

    private static final String EXCEPTION_MSG = "Team count must be even and greater or equal to 2.";
    public static final String IDENTIC_TEAMS = "Teams cannot play against themselves";
    private final int teamCount;
    private final boolean firstRound;

    public HomeLaw(int firstRound, boolean arg03) {
        // Roughly 4 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Game arrangeClubs(Club team1, Club team2) {
        // Roughly 7 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private Game jokerGame(Club team1, Club team2) {
        // Roughly 1 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private Game regularGame(Club team1, Club team2) {
        // Roughly 1 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

