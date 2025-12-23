import greenfoot.*;

public class clevel1 extends Actor
{
    private GreenfootImage clevel1;
    public clevel1(){
        clevel1 = new GreenfootImage("clevel1.png");
        clevel1.scale(100, 75);
        setImage(clevel1);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1()); 
        }
    }
}
