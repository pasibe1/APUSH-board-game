import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Cards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cards extends Actor
{
    boolean clickable;
    boolean correct;
    public Cards(boolean Lclickable, boolean Lcorrect ,WritingController stringGroup)
    {
        if(Lclickable == true)
        {
            drawImage(stringGroup);
        }
        if(Lclickable == false)
        {
            drawTopImage(stringGroup);
        }
        clickable = Lclickable;
        correct = Lcorrect;
    }
    
    /**
     * Act - do whatever the Cards wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        testCorrectAnswer();
    } 
   
    public void testCorrectAnswer()
    {
        boolean mouseClick = Greenfoot.mouseClicked(this);
        if (clickable == true)
        {
            if (correct == false && mouseClick == true)
            {
                ((Game_Board)getWorld()).answerRight = false;
                ((Game_Board)getWorld()).canCardsDie = true;
            }
            if (correct == true && mouseClick == true)
            {
                ((Game_Board)getWorld()).answerRight = true;
                ((Game_Board)getWorld()).canCardsDie = true;
            }
        }
    }
    
    private void drawImage(WritingController writeThis)
    {
        GreenfootImage img = getImage();
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(16.0F));
        img.drawString(writeThis.line1,writeThis.offset1,30);
        img.drawString(writeThis.line2,writeThis.offset2,50);
        img.drawString(writeThis.line3,writeThis.offset3,70);
        img.drawString(writeThis.line4,writeThis.offset4,90);
        img.drawString(writeThis.line5,writeThis.offset5,110);
        img.drawString(writeThis.line6,writeThis.offset6,130);
        img.drawString(writeThis.line7,writeThis.offset7,150);
    }
    
    private void drawTopImage(WritingController writeThis)
    {
        GreenfootImage img = getImage();
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(16.0F));
        img.drawString(writeThis.line1,writeThis.offset1,75);
    }
}
