import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class backtomain extends Actor
{
    private GreenfootImage backimg;
    
    public backtomain(){
        backimg = new GreenfootImage("backtomain.png");
        backimg.scale(100, 75);
        setImage(backimg);
    }
    public void act(){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new main_menu()); 
        }
    }
}
