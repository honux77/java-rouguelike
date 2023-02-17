package kr.seoul42;

public class GameObject {

    private final char initial;
    private Location location;

    public GameObject(char initial) {
        this.initial = initial;
    }

    public void setLocation(int x, int y) {
        this.location = new Location(x, y);
    }

    public char getDisplayLetter() {
       return initial;
    }

    public Location getLocation() {
        return location;
    }
}
