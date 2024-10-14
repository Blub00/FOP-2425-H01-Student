package h01;

import h01.template.Util;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import fopbot.Robot;
import h01.template.Families;
import h01.template.Ghost;
import h01.template.TickBased;

/**
 * The {@link PinkGhost} is a {@link Robot} that looks like a pink ghost.
 * It tries to move in a random direction.
 */
public class PinkGhost extends Robot implements Ghost, TickBased {
    /**
     * Creates a new {@link PinkGhost} at the given position.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public PinkGhost(int x, int y) {
        super(x, y, Families.GHOST_PINK);
    }

    /**
     * Finds in how many directions the ghost can move and then turns a random
     * amount of times to the left.
     * The ghost then moves forward or turns to the left until it can move forward.
     */
    @Override
    @StudentImplementationRequired("H2.1")
    public void doMove() {
        int freeWays = 0;
        int firstWay = 0;
        int secondWay = 0;
        int thirdWay = 0;
        int fourthWay = 0;

        turnLeft();
        if(isFrontClear()){
            freeWays++;
            firstWay++;
        }
        turnLeft();
        if(isFrontClear()){
            freeWays++;
            secondWay = firstWay + 1;
        }
        turnLeft();
        if(isFrontClear()){
            freeWays++;
            thirdWay = secondWay + 1;
        }
        turnLeft();
        if(isFrontClear()){
            freeWays++;
            fourthWay = thirdWay +1;
        }
        int random = Util.getRandomInteger(1, freeWays);

        if(random == firstWay){
            turnLeft();
        } else if(random == secondWay){
            turnLeft();
            turnLeft();
        } else if(random == thirdWay){
            turnLeft();
            turnLeft();
            turnLeft();
        } else if(random == fourthWay){
            turnLeft();
            turnLeft();
            turnLeft();
            turnLeft();
        }
        move();
    }
}
