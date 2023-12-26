package gameoflife;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameField {
    private final static JFrame gameField = new JFrame("Game Of Life");
    static void startGameField(int w, int h) {
        gameField.setSize(w, h);
        gameField.setVisible(true);
        gameField.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
