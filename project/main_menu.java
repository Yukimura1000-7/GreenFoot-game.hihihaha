import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main_menu extends World
{
    
    /**
     * Constructor for objects of class main_menu.
     * 
     */
    public main_menu()
    {    
        super(600, 400, 1); 
        setBackground("background.png");
        addObject(new MenuMentor(), 125, 325);
        addObject(new MenuHero(), 475, 325);
        addObject(new StartButton(), 100, 150);
    }
}
