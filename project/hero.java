import greenfoot.*; 

public class hero extends Actor
{
    private int cellSize = 33;
    private boolean isMoving = false;
    private int moveCooldown = 0;
    private static final int COOLDOWN_DURATION = 10;
    
    public hero(){
        GreenfootImage heroimg = new GreenfootImage("hero.png");
        heroimg.scale(28, 28);
        setImage(heroimg);
    }
    public void act()
    {
        if(moveCooldown > 0){
            moveCooldown--;
            return;
        }
        
        if(!isMoving){
            if(Greenfoot.isKeyDown("left")){
                moveLeft();
            }
            else if(Greenfoot.isKeyDown("right")){
                moveRight();
            }
            else if(Greenfoot.isKeyDown("up")){
                moveUp();
            }
            else if(Greenfoot.isKeyDown("down")){
                moveDown();
            }
        }
    }
    
    private void moveLeft(){
        isMoving = true;
        int targetX = getX() - cellSize;
        int targetY = getY();
        moveCooldown = COOLDOWN_DURATION;
        
        setLocation(targetX, targetY);
        isMoving = false;
    }
    private void moveRight(){
        isMoving = true;
        int targetX = getX() + cellSize;
        int targetY = getY();
        moveCooldown = COOLDOWN_DURATION;
        
        setLocation(targetX, targetY);
        isMoving = false;
    }
    private void moveUp(){
        isMoving = true;
        int targetX = getX();
        int targetY = getY() - cellSize;
        moveCooldown = COOLDOWN_DURATION;
        
        setLocation(targetX, targetY);
        isMoving = false;
    }
    private void moveDown(){
        isMoving = true;
        int targetX = getX();
        int targetY = getY() + cellSize;
        moveCooldown = COOLDOWN_DURATION;
        
        setLocation(targetX, targetY);
        isMoving = false;
    }
}
