package model;

public class Panel extends Material {
    private double widthTrim;
    private double lengthTrim;
    private boolean hasGrain;
    private boolean twoSided;
    private int speed;
    private double waste;

    public Panel(String name, double width, double length, double thickness, String comment,
                 double widthTrim, double lengthTrim, boolean hasGrain, boolean twoSided,
                 int speed, double waste) {
        super(name, width, length, thickness, comment);
        this.widthTrim = widthTrim;
        this.lengthTrim = lengthTrim;
        this.hasGrain = hasGrain;
        this.twoSided = twoSided;
        this.speed = speed;
        this.waste = waste;
    }

    public double getWidthTrim() {
        return widthTrim;
    }

    public void setWidthTrim(double widthTrim) {
        this.widthTrim = widthTrim;
    }

    public double getLengthTrim() {
        return lengthTrim;
    }

    public void setLengthTrim(double lengthTrim) {
        this.lengthTrim = lengthTrim;
    }

    public boolean isHasGrain() {
        return hasGrain;
    }

    public void setHasGrain(boolean hasGrain) {
        this.hasGrain = hasGrain;
    }

    public boolean isTwoSided() {
        return twoSided;
    }

    public void setTwoSided(boolean twoSided) {
        this.twoSided = twoSided;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWaste() {
        return waste;
    }

    public void setWaste(double waste) {
        this.waste = waste;
    }
}
