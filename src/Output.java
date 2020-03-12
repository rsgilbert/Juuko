public class Output{
    public static void main(String[] args) {
        Human s1 = new Human();
        System.out.println(s1.jump());
        System.out.println(s1.run());
        s1.setLegs(2);
        System.out.println(s1.getLegs());
    }
}
