import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int numberPiece;
    int scoreValue = 0;
    String display;
    public Score(String Ldisplay, int LnumberPiece)
    {
        display = Ldisplay;
        drawImage(display);
        numberPiece = LnumberPiece;
    }
    
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateScore(display);
    }   
    
    private void drawImage(String writeThis)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.scale(120,25);
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(16.0F));
        img.drawString(writeThis + scoreValue,0,15);
    }
    
    private void updateScore(String writeThis)
    {
        if(numberPiece == 1)
        {
            scoreValue = (((Game_Board)getWorld()).playerOneScore);
            GreenfootImage img = getImage();
            img.clear();
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(16.0F));
            img.drawString(writeThis + scoreValue,0,15);
        }
        if(numberPiece == 2)
        {
            scoreValue = (((Game_Board)getWorld()).playerTwoScore);
            GreenfootImage img = getImage();
            img.clear();
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(16.0F));
            img.drawString(writeThis + scoreValue,0,15);
        }
        if(numberPiece == 3)
        {
            scoreValue = (((Game_Board)getWorld()).playerThreeScore);
            GreenfootImage img = getImage();
            img.clear();
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(16.0F));
            img.drawString(writeThis + scoreValue,0,15);
        }
        if(numberPiece == 4)
        {
            scoreValue = (((Game_Board)getWorld()).playerFourScore);
            GreenfootImage img = getImage();
            img.clear();
            img.setColor(Color.BLACK);
            img.setFont(img.getFont().deriveFont(Font.BOLD));
            img.setFont(img.getFont().deriveFont(16.0F));
            img.drawString(writeThis + scoreValue,0,15);
        }
    }
}
