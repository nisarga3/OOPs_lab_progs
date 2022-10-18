public class Cylinder extends circle{
    private double height;

    public Cylinder(){}

    public Cylinder(double height,double radius)
    {
        this.height=height;
        r=radius;
    }

    public Cylinder(double height,double radius,double color)
    {
        this.height=height;
        r=radius;
        this.color=color;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*r*(r+height);
    }

    public double getVolume()
    {
        return super.getArea()*height;
    }
}
