/**
 * 12th March 2020
 * Source code by Juuko Isaac under my supervision
 * Abstract class example
 */

/*
 * Skeleton is an abstract class
 * The methods jump and run are also abstract methods
 * Abstract methods are not implemented
 */
public abstract class Skeleton {
    // legs is a private property of Skeleton so it cannot be
    // directly accessed directly from other classes.
    // We use setters and getters to modify and access legs.
    // The technique of hiding data properties of a
    // class is called encapsulation.
    private int legs;

    // This private variable is lacking getters and setters
    private int head;

    // These abstract functions must be implemented in the subclass
    public abstract String jump();
    public abstract String run();

    // Get the private variable legs.
    public int getLegs() {
        return legs;
    }

    // Set the private variable legs
    public void setLegs(int l) {
        // Note. You could also say: this.legs = l;
        legs = l;
    }
}

