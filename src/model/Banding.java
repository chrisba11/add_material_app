package model;

public class Banding extends Material {
    private int type;

    public Banding(String name, double width, double length, double thickness,
                   String comment, int type) {
        super(name, width, length, thickness, comment);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
