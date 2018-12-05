package Rooms;
import Game.Runner;
import People.Person;

public class FunRoom extends Room {
    public FunRoom (int x, int y){
        super (x, y);
    }
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the fun room! Add bonus points.");

        /**
         * Removes the player from the room.
         * @param
         */

        public void leaveRoom(Person x)
        {
            occupant = null;
        }
    }
}
