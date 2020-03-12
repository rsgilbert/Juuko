public abstract class Skeleton {
    public int legs;
    private int head;

    public abstract String jump();

    public abstract String run();

    public int getLegs() {
        return legs;
    }
    public void setLegs(int l){
        legs=l;

    }
}

