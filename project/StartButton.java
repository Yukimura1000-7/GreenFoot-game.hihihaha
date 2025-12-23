import greenfoot.*;

public class StartButton extends Actor {
    private GreenfootImage normalImage;

    public StartButton() {
        // не надо в акте потому что чота каждый кадр
        normalImage = new GreenfootImage("startbutton.png");
        normalImage.scale(200, 150);
        setImage(normalImage);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelSelection()); 
        }
    }
}