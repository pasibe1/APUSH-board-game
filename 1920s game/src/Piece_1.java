import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Piece_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piece_1 extends Actor
{
    public boolean didIWin = false;
    public Point point1 = new Point(691, 68);
    public Point point2 = new Point(602, 74);
    public Point point3 = new Point(524, 68);
    public Point point4 = new Point(445, 65);
    public Point point5 = new Point(362, 67);
    public Point point6 = new Point(273, 83);
    public Point point7 = new Point(192, 68);
    public Point point8 = new Point(122, 59);
    public Point point9 = new Point(80, 95);
    public Point point10 = new Point(97, 178);
    public Point point11 = new Point(89, 255);
    public Point point12 = new Point(97, 341);
    public Point point13 = new Point(84, 422);
    public Point point14 = new Point(88, 487);
    public Point point15 = new Point(134, 535);
    public Point point16 = new Point(234, 538);
    public Point point17 = new Point(324, 540);
    public Point point18 = new Point(446, 513);
    public Point point19 = new Point(543, 525);
    public Point point20 = new Point(628, 542);
    public Point point21 = new Point(720, 552);
    public Point point22 = new Point(794, 548);
    public Point point23 = new Point(861, 513);
    public Point point24 = new Point(842, 438);
    public Point point25 = new Point(843, 368);
    public Point point26 = new Point(855, 293);
    public Point point27 = new Point(869, 208);
    public Point point28 = new Point(867, 132);
    public Point point29 = new Point(843, 82);
    public Point point30 = new Point(770, 60);
    public Point winPath = new Point(713, 310);
    public Point win = new Point(582, 291);
    public ArrayList<Point> coordinates = new ArrayList<Point>();
    public Piece_1()
    {
        GreenfootImage img = getImage();
        img.scale(30,30);
        setImage(img);
        img.setColor(Color.BLACK);
        img.setFont(img.getFont().deriveFont(Font.BOLD));
        img.setFont(img.getFont().deriveFont(12.0F));
        img.drawString("P1",8,19);
        createList();
    }
    
    /**
     * Act - do whatever the Piece_1 wants to do. This method is called whenever
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
        if(((Game_Board)getWorld()).answerRight == true && ((Game_Board)getWorld()).turnNumber == 1 && didIWin == false)
        {
           ++((Game_Board)getWorld()).playerOneScore;
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
               if(newPositionArray == 25 && ((Game_Board)getWorld()).playerOneScore >= 15)
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