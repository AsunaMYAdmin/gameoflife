package gameoflife;

import javax.swing.*;
import java.awt.*;

class Paint extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        for (int i = 0; i < CellManagement.getCellList().size(); i++) {
            for (int k = 0; k < CellManagement.getCellList().get(i).size(); k++) {
                // Вычисление позиции каждого квадрата и рисование в зависимости от жизненного цикла
                int superX = CellManagement.getCellList().get(i).get(k).getCorX();
                int superY = CellManagement.getCellList().get(i).get(k).getCorY();
                int size = CellManagement.getCellList().get(i).get(k).getCellHeight();
                if (CellManagement.getCellList().get(i).get(k).getLifeCycle().equals("live")) {
                    g.fillRect(superX, superY, size, size);
                } else {
                    g.drawRect(superX, superY, size, size);
                }
            }
        }
    }
}
