import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Piece_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piece_2 extends Actor
{
    public boolean didIWin = false;
    private Point point1 = new Point(700, 36);
    private Point point2 = new Point(611, 42);
    private Point point3 = new Point(533, 37);
    private Point point4 = new Point(457, 33);
    private Point point5 = new Point(372, 35);
    private Point point6 = new Point(281, 51);
    private Point point7 = new Point(202, 39);
    private Point point8 = new Point(106, 34);
    private Point point9 = new Point(40, 89);
    private Point point10 = new Point(59,171);
    private Point point11 = new Point(54, 245);
    private Point point12 = new Point(59, 329);
    private Point point13 = new Point(47, 410);
    private Point point14 = new Point(55, 497);
    private Point point15 = new Point(113, 566);
    private Point point16 = new Point(206, 559);
    private Point point17 = new Point(303, 566);
    private Point point18 = new Point(418, 537);
    private Point point19 = new Point(517, 545);
    private Point point20 = new Point(603, 560);
    private Point point21 = new Point(696, 576);
    private Point point22 = new Point(783, 573);
    private Point point23 = new Point(903, 527);
    private Point point24 = new Point(886, 452);
    private Point point25 = new Point(876, 380);
    private Point point26 = new Point(892, 304);
    private Point point27 = new Point(908, 222);
    private Point point28 = new Point(905, 138);
    private Point point29 = new Point(863, 51);
    private Point point30 = new Point(781, 29);
    private Point winPath = new Point(488, 441);
    private Point win = new Point(516, 373);
    private ArrayList<Point> coordinates = new ArrayList<Point>();
    public Piece_2()
    {
        GreenfootImage img = getImage();
        img.scale(30,30);
        setImage(img);
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(12.0F));
        img.drawString("P2",8,19);
        createList();
    }
    
    /**
     * Act - do whatever the Piece_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveTarget();
    }
    
    public void createList()
    {
        coordinates.add(point1); //Array position 0
        coordinates.add(point2);
        coordinates.add(point3);
        coordinates.add(point4);
        coordinates.add(point5);
        coordinates.add(point6);
        coordinates.add(point7);
        coordinates.add(point8);
        coordinates.add(point9);
        coordinates.add(point10);
        coordinates.add(point11);
        coordinates.add(point12);
        coordinates.add(point13);
        coordinates.add(point14);
        coordinates.add(point15);
        coordinates.add(point16);
        coordinates.add(point17);
        coordinates.add(point18);
        coordinates.add(point19);
        coordinates.add(point20);
        coordinates.add(point21);
        coordinates.add(point22);
        coordinates.add(point23);
        coordinates.add(point24);
        coordinates.add(point25);
        coordinates.add(point26);
        coordinates.add(point27);
        coordinates.add(point28);
        coordinates.add(point29);
        coordinates.add(point30);
        coordinates.add(winPath); //Array position 30 
        coordinates.add(win); //Array position 31
    }
    
    public void moveTarget()
    {
        if(((Game_Board)getWorld()).answerRight == true && ((Game_Board)getWorld()).turnNumber == 2 && didIWin == false)
        {
           ++((Game_Board)getWorld()).playerTwoScore;
           for(int move=((Game_Board)getWorld()).diceRoll; move>0; --move)
           {
               Greenfoot.delay(25);
               Point tempPoint = new Point(getX(), getY());
  	           int currentPositionArray = coordinates.lastIndexOf(tempPoint);
               int newPositionArray = (currentPositionArray+1);
               if(newPositionArray == 30)
               {
                   newPositionArray = 0;
               }
               if(newPositionArray == 18 && ((Game_Board)getWorld()).playerOneScore >= 15)
               {
                   newPositionArray = 30;
               }
               if(newPositionArray == 32 || newPositionArray == 31)
               {
                   newPositionArray = 31;
                   didIWin = true;
               }
               Point moveTarget = coordinates.get(newPositionArray);
               setLocation((int)moveTarget.getX(), (int)moveTarget.getY());
               if(move == 1)
               {
                   ((Game_Board)getWorld()).canRollDice = true;
                   ++(((Game_Board)getWorld()).turnNumber);
                   ((Game_Board)getWorld()).answerRight = false;
               }
           }
       }
    }
}
