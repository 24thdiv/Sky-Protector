import greenfoot.*;
import java.awt.Color;
public class CounterFeuer extends Actor
{
     int score = 0;
    public void act() 
    {
       addScore();
    }    
    
    public void addScore()
    {
        score ++;
    }
    public int givescore()
    {
        return score;
    }
}

