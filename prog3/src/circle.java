public class circle {
    public double r;
    public double color;

    public circle(){ }

    public circle(double r) {
        this.r = r;
    }

    public circle(double r, double color) {
        this.r = r;
        this.color = color;
    }

    public double getRadius()
    {
        return r;
    }

    public double getArea()
    {
        return Math.PI*r*r;
    }


}



