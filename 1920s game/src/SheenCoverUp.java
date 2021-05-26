import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SheenCoverUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SheenCoverUp extends Actor
{
    public SheenCoverUp()
    {
        GreenfootImage img = getImage();
        img.scale(115,130);
        setImage(img);
    }
    
    /**
     * Act - do whatever the SheenCoverUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkWin();
    }  
    
    public void checkWin()
    {
        if(((Game_Board)getWorld()).piece_1.didIWin == true || ((Game_Board)getWorld()).piece_2.didIWin == true || ((Game_Board)getWorld()).piece_3.didIWin == true || ((Game_Board)getWorld()).piece_4.didIWin == true)
        {
            getWorld().removeObject(this);
        }
    }
}
