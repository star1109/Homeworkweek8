package homeworkweek8.Program20;

public class Cuboid extends Rectangle
{
        double height;

    Cuboid(double width, double length,double height) {
        super(width, length);
        this.height = height;
        if(height < 0)
        {
            this.height = 0;
        }

    }

    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        double volume = 0;
        volume = getArea() * this.height;
        return volume;
    }

}
