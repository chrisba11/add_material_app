package model;

public abstract class Material {
    private String name;
    private double width;
    private double length;
    private double thickness;
    private String comment;

    public Material(String name, double width, double length, double thickness, String comment) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
