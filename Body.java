import greenfoot.*;
public class Body extends Actor
{
    private int length;
    private Body nextNode;
    public void act() 
    {
        if(0==length--&&Head.getAlive())getWorld().removeObject(this);
    }
    public Body(int pLength, int rotation, Body next)
    {
        length = pLength;
        setRotation(rotation);
        nextNode = next;
    }
    public void increase()
    {
        length += Head.getScale();
        if(nextNode!=null)nextNode.increase();
    }
}