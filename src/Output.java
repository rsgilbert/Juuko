/**
 * 12th March 2020
 * Source code by Juuko Isaac under my supervision
 * Output class. Uses the Human subclass
 */
public class Output {
    public static void main(String[] args) {
        // Create human object.
        Human h1 = new Human();
        System.out.println(h1.jump());
        System.out.println(h1.run());

        // Set the number of legs
        h1.setLegs(2);

        // Get the number of legs
        int legCount = h1.getLegs();
        System.out.println(legCount);
    }
}
