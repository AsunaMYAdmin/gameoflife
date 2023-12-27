package gameoflife;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameField {
    //Создаётся новое поле (экран)
    private final static JFrame gameField = new JFrame("Game Of Life");
    static void startGameField(int w, int h) {
        gameField.setSize(w, h);
        gameField.setVisible(true);
        //Анонимный класс абстрактного WindowAdpater'а, который завершает программу в консоли, при изменении (закрытии) окна
        gameField.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
