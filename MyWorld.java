import greenfoot.*;
import java.util.Random;
public class MyWorld extends World
{
    private static final int width = 40;
    private static final int height = 25;
    public MyWorld()
    {    
        super(40, 25, 20, false);
        Greenfoot.setSpeed(38);
        prepare();
        setPaintOrder(Counter.class, Head.class, Body.class, Food.class);
    }
    public static int getMyWidth()
    {
        return width;
    }
    public static int getMyHeight()
    {
        return height;
    }

    Random r = new Random();
    private void prepare()
    {
        Head head = new Head();
        addObject(head,getMyHeight()/2,getMyHeight()/2);
        addObject(new Food(), r.nextInt(getMyHeight()), r.nextInt(getMyHeight()));
    }
}