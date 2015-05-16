import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;


public class Score extends ScreenObject
{
   private int score;
   /**
    * Create the score at a particular location and size.
    * The score starts at zero.
    * @param location The starting location.
    * @param size The size.
    */
   public Score(Point location, Rectangle size)
   {
      super(location, size);
      score = 0;
   
   }
   /**
    * To draw the score, convert the integer to a string.
    */
   @Override
   public void draw(Graphics g)
   {

	   //draw the score display
         g.setColor(Color.white);
         g.setFont(new Font("Times New Roman",Font.BOLD, 24));
         g.drawString("SCORE:"+ score, location.x, location.y);
             
   }
   /**
    * Retrieve the score.
    * @return the score
    */
   public int getScore() {
       return score;
   }

   /**
    * Change the score.
    * @param score the score to set
    */
   public void setScore(int score) {
       this.score = score;
   }

}
