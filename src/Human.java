/**
 * 12th March 2020
 * Source code by Juuko Isaac under my supervision
 * Subclass example
 */

/* Human is a subclass of Skeleton.
 * Human needs to implement the methods jump and run
 * which it inherited from Skeleton
 */

public class Human extends Skeleton {


    public String jump() {
        return "10 feet high";
    }

    public String run() {
        return "as long as possible";
    }
}
