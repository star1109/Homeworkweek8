package homeworkweek8.Program17;

public class Carpet
{
    double cost;

    Carpet(double cost)
    {
        this.cost = cost;
        if(cost<0)
        {
            this.cost = 0;
        }
        else
        {
            this.cost = cost;
        }
    }
    public double getCost()
    {
       return this.cost;
    }




}
