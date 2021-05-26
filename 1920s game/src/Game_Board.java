import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Point;
/**
 * Write a description of class Game_Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Board extends World
{
    int numberPlayers = 1;
    int turnNumber = 1;
    int diceRoll = -1;
    boolean canRollDice = true;
    boolean chooseCard = true;
    boolean displayCards;
    boolean canCardsDie;
    boolean answerRight;
    Cards cards1;
    Cards cards2;
    Cards cards3;
    Cards cards4;
    Cards cards5;
    int playerOneScore = 0;
    int playerTwoScore = 0;
    int playerThreeScore = 0;
    int playerFourScore = 0;
    Point position1 = new Point(300, 310);
    Point position2 = new Point(300, 510);
    Point position3 = new Point(700, 310);
    Point position4 = new Point(700, 510);
    Point cardPosition1;
    Point cardPosition2;
    Point cardPosition3;
    Point cardPosition4;
    Piece_1 piece_1;
    Piece_2 piece_2;
    Piece_3 piece_3;
    Piece_4 piece_4;
    ArrayList<Point> positions = new ArrayList<Point>();
    MouseInfo mInfo;
    Questions questions;
    Answers answers;
    /**
     * Constructor for objects of class Game_Board.
     * 
     */
    public Game_Board()
    {    
        super(950, 600, 1);
        countPlayers();

        prepare();
        createPossiblePositions();
    }

    public void act()
    {
        updateMouseInfo();
        displayCards();
        canCardsDie();
        wrapTurn();
        recreateList();
    }
    
    private void recreateList()
    {
        if(questions.questionList.size() == 0)
        {
            questions.createQuestionsList();
        }
        if(answers.wrongListAlpha.size() == 0)
        {
            answers.createWrongListAlpha();
            answers.createWrongListBeta();
            answers.createWrongListGamma();
            answers.createRightList();
        }
    }
    
    public void wrapTurn()
    {
        if(turnNumber > numberPlayers)
        {
            turnNumber = 1;
        }
    }
    
    public void canCardsDie()
    {
        if(canCardsDie == true)
        {
            removeObject(cards1);
            removeObject(cards2);
            removeObject(cards3);
            removeObject(cards4);
            removeObject(cards5);
            if(answerRight == false)
            {
                ++turnNumber;
                canRollDice = true;
            }
            canCardsDie = false;
        }
    }
    
    public void updateMouseInfo()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        mInfo = info;
    }
    
    public void countPlayers()
    {
        String playersString;
        playersString = JOptionPane.showInputDialog("How many people are playing? (Max 4)");
        numberPlayers = Integer.parseInt(playersString);
        if(numberPlayers > 4)
        {
            numberPlayers = 4;
        }
    }
    
    public void createPossiblePositions()
    {
        positions.add(position1); //position 0
        positions.add(position2);
        positions.add(position3);
        positions.add(position4); //position 3
    }
    
    public void determinePositions()
    {
        int number = Greenfoot.getRandomNumber(4);
        cardPosition1 = positions.get(number);
        positions.remove(cardPosition1);
        
        int secondNumber = Greenfoot.getRandomNumber(3);
        cardPosition2 = positions.get(secondNumber);
        positions.remove(cardPosition2);
        
        int thirdNumber = Greenfoot.getRandomNumber(2);
        cardPosition3 = positions.get(thirdNumber);
        positions.remove(cardPosition3);
        
        int fourthNumber = Greenfoot.getRandomNumber(1);
        cardPosition4 = positions.get(fourthNumber);
        positions.remove(cardPosition4);
        
        createPossiblePositions();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        piece_1 = new Piece_1();
        piece_2 = new Piece_2();
        piece_3 = new Piece_3();
        piece_4 = new Piece_4();
        Score score1 = new Score("Player One: ", 1);
        Score score2 = new Score("Player Two: ", 2);
        Score score3 = new Score("Player Three: ", 3);
        Score score4 = new Score("Player Four: ", 4);

        if(numberPlayers == 1)
        {
            addObject(piece_1, 843, 368);
            addObject(score1, 619, 416);
        }
        if(numberPlayers == 2)
        {
            addObject(piece_1, 843, 368);
            addObject(piece_2, 418, 537);
            addObject(score1, 619, 416);
            addObject(score2, 619, 460);
        }
        if(numberPlayers == 3)
        {
            addObject(piece_1, 843, 368);
            addObject(piece_2, 418, 537);
            addObject(piece_3, 89, 142);
            addObject(score1, 619, 416);
            addObject(score2, 619, 460);
            addObject(score3, 743, 416);
        }
        if(numberPlayers == 4)
        {
            addObject(piece_1, 843, 368);
            addObject(piece_2, 418, 537);
            addObject(piece_3, 89, 142);
            addObject(piece_4, 649, 41);
            addObject(score1, 619, 416);
            addObject(score2, 619, 460);
            addObject(score3, 743, 416);
            addObject(score4, 743, 460);
        }
        Dice dice = new Dice();
        addObject(dice, 351, 414);
        Deck deck = new Deck();
        addObject(deck, 207, 421);
        deck.setLocation(207, 418);
        questions = new Questions();
        answers = new Answers();
        deck.setLocation(226, 418);
        SheenCoverUp sheencoverup = new SheenCoverUp();
        addObject(sheencoverup, 528, 309);
        sheencoverup.setLocation(507, 294);
        sheencoverup.setLocation(508, 296);
        Turn_Counter turn_counter = new Turn_Counter();
        addObject(turn_counter, 656, 198);
        turn_counter.setLocation(722, 219);
        turn_counter.setLocation(378, 190);
        Random_Stupid_Score_Text_That_Really_Shouldnt_Even_Be_Its_Own_Class random_stupid_score_text_that_really_shouldnt_even_be_its_own_class = new Random_Stupid_Score_Text_That_Really_Shouldnt_Even_Be_Its_Own_Class();
        addObject(random_stupid_score_text_that_really_shouldnt_even_be_its_own_class, 668, 375);
        random_stupid_score_text_that_really_shouldnt_even_be_its_own_class.setLocation(695, 382);
        random_stupid_score_text_that_really_shouldnt_even_be_its_own_class.setLocation(696, 383);
    }
    
    public void displayCards()
    {
        if(displayCards == true)
        {
            int arraySize = questions.questionList.size();
            int number = Greenfoot.getRandomNumber(arraySize);
            determinePositions();
            
            cards1 = new Cards(false, false, questions.questionList.get(number));
            addObject(cards1, 510, 100); //This is the top answer card
            
            cards2 = new Cards(true, false, answers.wrongListAlpha.get(number));
            addObject(cards2, (int)cardPosition1.getX(), (int)cardPosition1.getY());
            
            cards3 = new Cards(true, false, answers.wrongListBeta.get(number));
            addObject(cards3, (int)cardPosition2.getX(), (int)cardPosition2.getY());
            
            cards4 = new Cards(true, false, answers.wrongListGamma.get(number));
            addObject(cards4, (int)cardPosition3.getX(), (int)cardPosition3.getY());
            
            cards5 = new Cards(true, true, answers.rightList.get(number));
            addObject(cards5, (int)cardPosition4.getX(), (int)cardPosition4.getY());
            
            answers.removeListElements(number);
            questions.removeListElements(number);
            
            displayCards = false;
        }
    }
}
