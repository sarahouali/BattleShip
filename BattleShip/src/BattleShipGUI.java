import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleShipGUI extends JFrame {

   private JButton[][] grid;
   private JLabel shotsRemainingLabel;
   private JLabel shipsRemainingLabel;
   private JButton placeShipsButton;
   private JButton endTurnButton;
   private ImageIcon shipIcon;
   private ImageIcon missIcon;
   private ImageIcon hitIcon;
   private int shotsRemaining;
   private int shipsRemaining;
   private int gridSize;

   public BattleShipGUI(int gridSize) {
      this.gridSize = gridSize;
      this.shotsRemaining = gridSize * gridSize / 2;
      this.shipsRemaining = 5;
      this.grid = new JButton[gridSize][gridSize];
      this.shipIcon = new ImageIcon(getClass().getResource("ship.png"));
      this.missIcon = new ImageIcon(getClass().getResource("miss.png"));
      this.hitIcon = new ImageIcon(getClass().getResource("hit.png"));

      setTitle("BattleShip");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(new BorderLayout());

      JPanel gridPanel = new JPanel(new GridLayout(gridSize, gridSize));
      for (int i = 0; i < gridSize; i++) {
         for (int j = 0; j < gridSize; j++) {
            grid[i][j] = new JButton();
            grid[i][j].addActionListener(new GridButtonListener());
            gridPanel.add(grid[i][j]);
         }
      }
      add(gridPanel, BorderLayout.CENTER);

      JPanel controlPanel = new JPanel();
      controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));

      shotsRemainingLabel = new JLabel("Shots Remaining: " + shotsRemaining);
      controlPanel.add(shotsRemainingLabel);

      shipsRemainingLabel = new JLabel("Ships Remaining: " + shipsRemaining);
      controlPanel.add(shipsRemainingLabel);

      placeShipsButton = new JButton("Place Ships");
      placeShipsButton.addActionListener(new PlaceShipsListener());
      controlPanel.add(placeShipsButton);

      endTurnButton = new JButton("End Turn");
      endTurnButton.addActionListener(new EndTurnListener());
      controlPanel.add(endTurnButton);

      add(controlPanel, BorderLayout.EAST);

      setSize(600, 600);
      setVisible(true);
   }

   private class GridButtonListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         JButton button = (JButton) e.getSource();
         if (button.getIcon() == null) {
            button.setIcon(missIcon);
            shotsRemaining--;
            shotsRemainingLabel.setText("Sh");
            shotsRemainingLabel.setText("Shots Remaining: " + shotsRemaining);
                if (shipsRemaining == 0) {
                   JOptionPane.showMessageDialog(null, "You win!");
                   System.exit(0);
                }
             } else if (button.getIcon() == shipIcon) {
                button.setIcon(hitIcon);
                shipsRemaining--;
                shipsRemainingLabel.setText("Ships Remaining: " + shipsRemaining);
                if (shipsRemaining == 0) {
                   JOptionPane.showMessageDialog(null, "You win!");
                   System.exit(0);
                }
             }
          }
       }

       private class PlaceShipsListener implements ActionListener {
          @Override
          public void actionPerformed(ActionEvent e) {
             // Place ships on the grid
          }
       }

       private class EndTurnListener implements ActionListener {
          @Override
          public void actionPerformed(ActionEvent e) {
             if (shotsRemaining == 0) {
                JOptionPane.showMessageDialog(null, "You lose!");
                System.exit(0);
             }
          }
       }

       public static void main(String[] args) {
          new BattleShipGUI(10);
       }
    }

