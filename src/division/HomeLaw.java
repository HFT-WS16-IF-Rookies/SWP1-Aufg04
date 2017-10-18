/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 15.10.2017 22:12:56
 */
package division;

import divisionData.Club;
import divisionData.Game;

public class HomeLaw
{
    private static final String EXCEPTION_MSG = "Team count must be even and greater or equal to 2.";
    public static final String IDENTIC_TEAMS = "Teams cannot play against themselves";
    private final int teamCount;
    private final boolean firstRound;

    public HomeLaw(int teamCount, boolean firstRound)
    {
        if (teamCount >= 2 && teamCount % 2 == 0)
        {
            this.teamCount  = teamCount;
        }
        else
        {
            throw new IllegalStateException(EXCEPTION_MSG);
        }

        this.firstRound = firstRound;
    }

    public Game arrangeClubs(Club team1, Club team2)
    {
        if (team1.getNumber() == team2.getNumber())
        {
            throw new  IllegalArgumentException(IDENTIC_TEAMS);
        }

        Club joker = null;
        if (team1.getNumber() == teamCount -1)
        {
            joker = team1;
        }
        if (team2.getNumber() == teamCount -1)
        {
            joker = team2;
        }
        if (joker != null)
        {
            return jokerGame(joker, (team1 == joker) ? team2 : team1);
        }

        Club smallerNumber =
                (team1.getNumber() < team2.getNumber() ? team1 : team2);
        Club higherNumber = ((smallerNumber == team1) ? team2 : team1);

        switch((smallerNumber.getNumber() + higherNumber.getNumber()) % 2)
        {
            case 0:
                return regularGame(smallerNumber, higherNumber);
            case 1:
                return regularGame(higherNumber, smallerNumber);
        }

        return null;
    }

    private Game jokerGame(Club joker, Club team2)
    {
        if (team2.getNumber() >= (teamCount / 2) -2 && team2.getNumber() <= teamCount -3)
        {
            if (firstRound)
            {
                return new Game(joker, team2);
            }
            else
            {
                return new Game(team2, joker);
            }
        }
        else
        {
            if(firstRound)
            {
                return new Game(team2, joker);
            }
            else
            {
                return new Game(joker, team2);
            }
        }
    }

    private Game regularGame(Club team1, Club team2)
    {
        if(!firstRound)
        {
            return new Game(team1, team2);
        }
        else
        {
            return new Game(team2, team1);
        }
    }

}
