
import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JFrame {
   public SmileyFace(){
       setTitle("Smiley Face");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(250,220);
       getContentPane().setBackground(Color.yellow);
       setVisible(true);
   } 
   public void paint(Graphics g){
      super.paint(g); 
      g.setColor(Color.red);
      g.drawOval(85, 75, 75, 75);
      g.setColor(Color.BLUE);
      g.drawOval(100, 95, 10, 10);
      g.drawOval(135, 95, 10, 10);
      g.drawArc(102, 115, 40, 25, 0, -180);
      g.drawString("smiley Face", 90, 75);
   }
    public static void main(String[] args) {
        new SmileyFace();
        
    }
}
