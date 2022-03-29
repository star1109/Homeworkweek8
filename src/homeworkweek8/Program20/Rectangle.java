package homeworkweek8.Program20;

public class Rectangle
{
    double width,length;

    Rectangle(double width , double length)
    {
        this.width = width;
        this.length = length;

        if(width < 0 )
        {
            this.width = 0;
        }

        if(length <0)
        {
            this.length = 0;
        }
    }

    public double getWidth()
    {
        return width;
    }

    public double getLength()
    {
        return length;
    }

    public double getArea()
    {
        double area = this.length * this.width;
        return area;
    }




}
