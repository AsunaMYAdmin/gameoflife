package gameoflife;

import java.util.ArrayList;
import java.util.List;

class CellManagement {
    private static final List<List<Cell>> cellList = new ArrayList<>();

    static void setCellList(int countOfY, int countOfX) {
        for (int i = 0; i < countOfY; i++) {
            List<Cell> cellX = new ArrayList<>();
            for (int k = 0; k < countOfX; k++) {
                cellX.add(k, new Cell(k, i));
            }
            cellList.add(i, cellX);
        }
    }
    static List<List<Cell>> getCellList() {
        return cellList;
    }
}
