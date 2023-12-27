package gameoflife;

import javax.swing.*;
import java.awt.*;

class Paint extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        for (int i = 0; i < CellManagement.getCellList().size(); i++) {
            for (int k = 0; k < CellManagement.getCellList().get(i).size(); k++) {
                int superX = CellManagement.getCellList().get(i).get(k).getCorX();
                int superY = CellManagement.getCellList().get(i).get(k).getCorY();
                int size = CellManagement.getCellList().get(i).get(k).getCellHeight();
                g.drawRect(superX, superY, size, size);
            }
        }
    }
}
