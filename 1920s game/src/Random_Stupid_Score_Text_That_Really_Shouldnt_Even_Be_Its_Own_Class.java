import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Random_Stupid_Score_Text_That_Really_Shouldnt_Even_Be_Its_Own_Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Random_Stupid_Score_Text_That_Really_Shouldnt_Even_Be_Its_Own_Class extends Actor
{
    public Random_Stupid_Score_Text_That_Really_Shouldnt_Even_Be_Its_Own_Class()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.scale(120,25);
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(16.0F));
        img.drawString("SCORES",0,15);
    }
    
    /**
     * Act - do whatever the Random_Stupid_Score_Text_That_Really_Shouldnt_Even_Be_Its_Own_Class wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
