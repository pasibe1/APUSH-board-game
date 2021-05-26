import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Questions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Questions extends Actor
{
    WritingController q1 = new WritingController("18th Amendment","","","","","","",65,0,0,0,0,0,0);
    WritingController q2 = new WritingController("19th Amendment","","","","","","",60,0,0,0,0,0,0);
    WritingController q3 = new WritingController("Return to Normalcy","","","","","","",50,0,0,0,0,0,0);
    WritingController q4 = new WritingController("Calvin Coolidge","","","","","","",65,0,0,0,0,0,0);
    WritingController q5 = new WritingController("Clarence Darrow","","","","","","",65,0,0,0,0,0,0);
    WritingController q6 = new WritingController("Nativism","","","","","","",92,0,0,0,0,0,0);
    WritingController q7 = new WritingController("Social Darwinism","","","","","","",60,0,0,0,0,0,0);
    WritingController q8 = new WritingController("Harlem Renaissance","","","","","","",50,0,0,0,0,0,0);
    WritingController q9 = new WritingController("Henry Ford","","","","","","",85,0,0,0,0,0,0);
    WritingController q10 = new WritingController("Herbert Hoover","","","","","","",68,0,0,0,0,0,0);
    WritingController q11 = new WritingController("Isolationism","","","","","","",80,0,0,0,0,0,0);
    WritingController q12 = new WritingController("Eugenics","","","","","","",90,0,0,0,0,0,0);
    WritingController q13 = new WritingController("Glenn Curtiss","","","","","","",75,0,0,0,0,0,0);
    WritingController q14 = new WritingController("Great Migration","","","","","","",67,0,0,0,0,0,0);
    WritingController q15 = new WritingController("Teapot Dome Scandal","","","","","","",37,0,0,0,0,0,0);
    WritingController q16 = new WritingController("Warren G. Harding","","","","","","",55,0,0,0,0,0,0);
    WritingController q17 = new WritingController("William Jennings Bryan","","","","","","",35,0,0,0,0,0,0);
    WritingController q18 = new WritingController("Charles Lindbergh","","","","","","",55,0,0,0,0,0,0);
    WritingController q19 = new WritingController("Chicano Mural Movement","","","","","","",30,0,0,0,0,0,0);
    WritingController q20 = new WritingController("Marcus Garvey","","","","","","",70,0,0,0,0,0,0);
    ArrayList<WritingController> questionList = new ArrayList<WritingController>();
    public Questions()
    {
        createQuestionsList();
    }
    
    public void removeListElements(int number)
    {
        questionList.remove(number);
    }
    
    /**
     * Act - do whatever the Questions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         // Add your action code here.
    }
    
    public void createQuestionsList()
    {
        questionList.add(q1); //Array position 0
        questionList.add(q2);
        questionList.add(q3);
        questionList.add(q4);
        questionList.add(q5);
        questionList.add(q6);
        questionList.add(q7);
        questionList.add(q8);
        questionList.add(q9);
        questionList.add(q10);
        questionList.add(q11);
        questionList.add(q12);
        questionList.add(q13);
        questionList.add(q14);
        questionList.add(q15);
        questionList.add(q16);
        questionList.add(q17);
        questionList.add(q18);
        questionList.add(q19);
        questionList.add(q20); //Array position 19
    }
}
