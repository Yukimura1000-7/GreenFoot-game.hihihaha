import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelection extends World
{

    /**
     * Constructor for objects of class LevelSelection.
     * 
     */
    public LevelSelection()
    {    
        super(600, 400, 1); 
        setBackground("background.png");
        addObject(new backtomain(), 100, 300);
        addObject(new clevel1(), 100, 60);
    }
}
