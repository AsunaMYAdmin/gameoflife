package gameoflife;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WindowManagement {
    //Создаётся новое поле (экран)
    private final static JFrame window = new JFrame("Game Of Life");
    static void startGameField(int w, int h) {
        window.setSize(w, h);
        window.setVisible(true);
        //Анонимный класс абстрактного WindowAdpater'а, который завершает программу в консоли, при изменении (закрытии) окна
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
