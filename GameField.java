package gameoflife;

import javax.swing.*;

class GameField {
    static JPanel panel = new Paint();
    // Рисуется поле
    static void paintField(int sizeX, int sizeY) {
        CellManagement.setCellList(sizeY, sizeX);
        WindowManagement.startGameField(sizeX * 11, sizeY * 11);
        WindowManagement.getWindow().setContentPane(panel);
    }
}
