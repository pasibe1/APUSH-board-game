import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice extends Actor
{
    boolean mouseClick;
    private GreenfootImage dice1 = new GreenfootImage("1.png");
    private GreenfootImage dice2 = new GreenfootImage("2.png");
    private GreenfootImage dice3 = new GreenfootImage("3.png");
    private GreenfootImage dice4 = new GreenfootImage("4.png");
    private GreenfootImage dice5 = new GreenfootImage("5.png");
    private GreenfootImage dice6 = new GreenfootImage("6.png");
    private GreenfootImage dice7 = new GreenfootImage("7.png");
    private GreenfootImage dice8 = new GreenfootImage("8.png");
    private GreenfootImage dice9 = new GreenfootImage("9.png");
    private GreenfootImage dice10 = new GreenfootImage("10.png");
    private GreenfootImage dice11 = new GreenfootImage("11.png");
    private GreenfootImage dice12 = new GreenfootImage("12.png");
    private GreenfootImage dice13 = new GreenfootImage("13.png");
    private GreenfootImage dice14 = new GreenfootImage("14.png");
    private GreenfootImage dice15 = new GreenfootImage("15.png");
    private GreenfootImage dice16 = new GreenfootImage("16.png");
    private GreenfootImage dice17 = new GreenfootImage("17.png");
    private GreenfootImage dice18 = new GreenfootImage("18.png");
    private GreenfootImage dice19 = new GreenfootImage("19.png");
    private GreenfootImage dice20 = null;
    private GreenfootImage stopDice0 = null;
    private GreenfootImage stopDice1 = new GreenfootImage("Stop 1.png");
    private GreenfootImage stopDice2 = new GreenfootImage("Stop 2.png");
    private GreenfootImage stopDice3 = new GreenfootImage("Stop 3.png");
    private GreenfootImage stopDice4 = new GreenfootImage("Stop 4.png");
    private GreenfootImage stopDice5 = new GreenfootImage("Stop 5.png");
    private GreenfootImage stopDice6 = new GreenfootImage("Stop 6.png");
    
    ArrayList<GreenfootImage> diceFrames = new ArrayList<GreenfootImage>();
    ArrayList<GreenfootImage> diceStopFrames = new ArrayList<GreenfootImage>();
    public Dice()
    {
        createDiceArray();
        createStopDiceArray();
    }
    
    private void createDiceArray()
    {
        diceFrames.add(dice1); //Position 0
        diceFrames.add(dice2);
        diceFrames.add(dice3);
        diceFrames.add(dice4);
        diceFrames.add(dice5);
        diceFrames.add(dice6);
        diceFrames.add(dice7);
        diceFrames.add(dice8);
        diceFrames.add(dice9);
        diceFrames.add(dice10);
        diceFrames.add(dice11);
        diceFrames.add(dice12);
        diceFrames.add(dice13);
        diceFrames.add(dice14);
        diceFrames.add(dice15);
        diceFrames.add(dice16);
        diceFrames.add(dice17);
        diceFrames.add(dice18);
        diceFrames.add(dice19); //Position 18
        diceFrames.add(dice20); //Position 19 = null
    }
    
    public void createStopDiceArray()
    {
        diceStopFrames.add(stopDice0); //Position 0 = null
        diceStopFrames.add(stopDice1); //Position 1
        diceStopFrames.add(stopDice2);
        diceStopFrames.add(stopDice3);
        diceStopFrames.add(stopDice4);
        diceStopFrames.add(stopDice5);
        diceStopFrames.add(stopDice6); //Position 6
    }
    
    public void rollImage()
    {
        setImage(diceFrames.get(0));
        for(int roll = 30; roll>0; --roll)
        {
            int currentPositionArray = diceFrames.lastIndexOf(getImage());
            int newPositionArray = (currentPositionArray + 1);
            if(newPositionArray == 19)
            {
                newPositionArray = 0;
            }
            Greenfoot.delay(6);
            setImage(diceFrames.get(newPositionArray));
        }
        ((Game_Board)getWorld()).diceRoll = (Greenfoot.getRandomNumber(6) + 1);
        setImage(diceStopFrames.get(((Game_Board)getWorld()).diceRoll));
    }
    
    /**
     * Act - do whatever the Dice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        determineRollDice();
    }

    private void determineRollDice()
    {
        mouseClick = Greenfoot.mouseClicked(this);
        if (((Game_Board)getWorld()).canRollDice == true && mouseClick == true)
        {
            rollImage();
            ((Game_Board)getWorld()).chooseCard = true;
            ((Game_Board)getWorld()).canRollDice = false;
        }
    }
    
    /**
     * Save this for later. Shows how to use mouseinfo.
     *boolean roll = false;
    private void determineHoveringDice()
    {
        if (((Game_Board)(getWorld())).mInfo.getActor() instanceof Dice)
        {
            roll = true;
        }
        else
        {
            roll = false;
        }
    } 
     */
}
