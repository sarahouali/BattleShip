package battleship;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GameBoard extends JPanel {
  private ImageIcon shipIcon = new ImageIcon("ship.png");
  private ImageIcon missedShotIcon = new ImageIcon("missed.png");
  private ImageIcon hitShotIcon = new ImageIcon("hit.png");

  public GameBoard() {
    setPreferredSize(new Dimension(600, 600));
    setLayout(new GridLayout(10, 10));

    // créer des boutons pour le plateau de jeu
    for (int i = 0; i < 100; i++) {
      JButton button = new JButton();
      button.setPreferredSize(new Dimension(50, 50));
      add(button);
    }
  }

  public void placeShip(int x, int y) {
    JButton button = (JButton) getComponent(x + y * 10);
    button.setIcon(shipIcon);
  }

  public void markMissedShot(int x, int y) {
    JButton button = (JButton) getComponent(x + y * 10);
    button.setIcon(missedShotIcon);
  }

  public void markHitShot(int x, int y) {
    JButton button = (JButton) getComponent(x + y * 10);
    button.setIcon(hitShotIcon);
  }
}
