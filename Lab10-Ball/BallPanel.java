// 2018113732 김동욱
// 본인은 이 소스파일을 다른 사람의 소스를 복사하지 않고 직접 작성하였습니다.

// JPanel that creates a ball when the mouse is pressed.  Ball bounces
// around the JPanel.
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random;
import java.util.ArrayList;

public class BallPanel extends JPanel
{
   private ArrayList<Ball> BallArray = new ArrayList<>();
   private Ball blueBall; // bouncing ball
   private ExecutorService threadExecutor; // for running Ball runnable
   private JFrame parentWindow; // parent window of JPanel
   private final int MAX_X = 200; // horizontal edge of JPanel
   private final int MAX_Y = 200; // vertical edge of JPanel
   private Random rand = new Random();
   
   private ArrayList<Color> r_color = new ArrayList<>();
   private int route = 0;
   public BallPanel( JFrame window )
   {
      parentWindow = window; // set parent window of JPanel

      // create ExecutorService for running ball runnable
      threadExecutor = Executors.newCachedThreadPool();

      // anonymous inner class handles mouse events
      this.addMouseListener( 
         new MouseAdapter() 
         {
            public void mousePressed( MouseEvent event ) 
            {
               createBall( event ); // delegate call to ball starter
               RepaintTimer timer = new RepaintTimer( parentWindow );
               threadExecutor.execute( timer );
            } // end method mousePressed
         } // end anonymous inner class
      ); // end call to addMouseListener
   } // end BallPanel constructor

   // create a ball if no ball exists and set it in motion
   private void createBall( MouseEvent event )
   {
      //if ( blueBall == null ) // if no ball exists
      {
         int x = event.getX(); // get x position of mouse press
         int y = event.getY(); // get y position of mouse press
         blueBall = new Ball( x, y ); // create new ball
         float R = rand.nextFloat();
         float G = rand.nextFloat();
         float B = rand.nextFloat();
         Color randColor = new Color(R, G, B);
         r_color.add(randColor);
         BallArray.add(blueBall);
         threadExecutor.execute( BallArray.get(BallArray.size()-1) ); // set ball in motion
      } // end if
   } // end method createBall

   // return minimum size of animation
   public Dimension getMinimumSize()
   { 
      return getPreferredSize(); 
   } // end method getMinimumSize

   // return preferred size of animation
   public Dimension getPreferredSize()
   {
      return new Dimension( MAX_X, MAX_Y );
   } // end method getPreferredSize

   // draw ball at current position
   public synchronized void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      {
         for(Ball k : BallArray){
         g.setColor( r_color.get(route++) ); // set color to blue
         //g.setColor(Color.BLUE);
         //g.fillOval( BallArray.get(route).getX(), BallArray.get(route).getY(), 10, 10 ); // draws
         g.fillOval( k.getX(), k.getY(), 10, 10 ); // draws
         }
         route = 0;
      } // end if
   } // end method paintComponent
} // end class BallPanel