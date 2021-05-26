import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deck extends Actor
{
    /**
     * Act - do whatever the Deck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       chooseCardDeck();
    }    
    
    public void chooseCardDeck()
    {
        boolean mouseClick = Greenfoot.mouseClicked(this);
        if (((Game_Board)getWorld()).chooseCard == true && mouseClick == true)
        {
            ((Game_Board)getWorld()).displayCards = true;
            mouseClick = false;
            ((Game_Board)getWorld()).chooseCard = false;
        }
    }
}
