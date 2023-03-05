import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BattleShipGame extends JFrame {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JButton[][] buttons = new JButton[10][10];
   private JPanel gameBoard = new JPanel(new GridLayout(10, 10));
   private JLabel status = new JLabel();

   public BattleShipGame() {
      setTitle("Bataille Navale");
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      for (int i = 0; i < 10; i++) {
         for (int j = 0; j < 10; j++) {
            JButton button = new JButton();
            buttons[i][j] = button;
            gameBoard.add(button);
         }
      }

      add(gameBoard, BorderLayout.CENTER);
      add(status, BorderLayout.SOUTH);

      pack();
      setVisible(true);
   }

   public static void main(String[] args) {
      new BattleShipGame();
   }
}
