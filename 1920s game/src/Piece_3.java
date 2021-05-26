import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Piece_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piece_3 extends Actor
{
    public boolean didIWin = false;
    private Point point1 = new Point(726, 68);
    private Point point2 = new Point(641, 76);
    private Point point3 = new Point(559, 72);
    private Point point4 = new Point(483, 67);
    private Point point5 = new Point(400, 69);
    private Point point6 = new Point(310, 79);
    private Point point7 = new Point(227, 80);
    private Point point8 = new Point(157, 62);
    private Point point9 = new Point(78, 62);
    private Point point10 = new Point(89, 142);
    private Point point11 = new Point(87, 222);
    private Point point12 = new Point(84, 300);
    private Point point13 = new Point(88, 386);
    private Point point14 = new Point(72, 458);
    private Point point15 = new Point(107, 516);
    private Point point16 = new Point(184, 534);
    private Point point17 = new Point(283, 541);
    private Point point18 = new Point(388, 523);
    private Point point19 = new Point(500, 516);
    private Point point20 = new Point(589, 531);
    private Point point21 = new Point(677, 549);
    private Point point22 = new Point(761, 550);
    private Point point23 = new Point(833, 538);
    private Point point24 = new Point(856, 473);
    private Point point25 = new Point(847, 401);
    private Point point26 = new Point(848, 328);
    private Point point27 = new Point(864, 246);
    private Point point28 = new Point(870, 166);
    private Point point29 = new Point(874, 95);
    private Point point30 = new Point(803, 64);
    private Point winPath = new Point(286, 270);
    private Point win = new Point(442, 304);
    private ArrayList<Point> coordinates = new ArrayList<Point>();
    
    public Piece_3()
    {
        GreenfootImage img = getImage();
        img.scale(30,30);
        setImage(img);
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(12.0F));
        img.drawString("P3",8,19);
        createList();
    }
    
    /**
     * Act - do whatever the Piece_3 wants to do. This method is called whenever
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
        if(((Game_Board)getWorld()).answerRight == true && ((Game_Board)getWorld()).turnNumber == 3 && didIWin == false)
        {
           ++((Game_Board)getWorld()).playerThreeScore;
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
               if(newPositionArray == 10 && ((Game_Board)getWorld()).playerOneScore >= 15)
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
