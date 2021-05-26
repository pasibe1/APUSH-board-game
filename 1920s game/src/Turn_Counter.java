import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Turn_Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turn_Counter extends Actor
{
    public Turn_Counter()
    {
        drawImage();
    }
    
    private void drawImage()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.scale(170,75);
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(18.0F));
        img.drawString("Player 1's Turn", 0,15);
    }
    
    public void updateTurn()
    {
        if(((Game_Board)getWorld()).turnNumber == 1)
        {
            GreenfootImage img = getImage();
            img.clear();
            img.scale(170,75);
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(18.0F));
            img.drawString("Player 1's Turn", 0,15);
        }
        if(((Game_Board)getWorld()).turnNumber == 2)
        {
            GreenfootImage img = getImage();
            img.clear();
            img.scale(170,75);
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(18.0F));
            img.drawString("Player 2's Turn", 0,15);
        }
        if(((Game_Board)getWorld()).turnNumber == 3)
        {
            GreenfootImage img = getImage();
            img.clear();
            img.scale(170,75);
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(18.0F));
            img.drawString("Player 3's Turn", 0,15);
        }
        if(((Game_Board)getWorld()).turnNumber == 4)
        {
            GreenfootImage img = getImage();
            img.clear();
            img.scale(170,75);
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(18.0F));
            img.drawString("Player 4's Turn", 0,15);
        }
    }
    
    /**
     * Act - do whatever the Turn_Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateTurn();
    }    
}
