package gameoflife;

import java.util.ArrayList;
import java.util.List;

class CellManagement {
    //Двумерная таблица клеток
    private static final List<List<Cell>> cellList = new ArrayList<>();

    static void setCellList(int countOfY, int countOfX) {
        int absoluteY = 0;
        for (int i = 0; i < countOfY; i++) {
            int absoluteX = 0;
            //Массив клеток, строка
            List<Cell> cellX = new ArrayList<>();
            for (int k = 0; k < countOfX; k++) {
                cellX.add(k, new Cell(absoluteX, absoluteY, false));
                absoluteX = absoluteX + cellX.get(k).getCellWeight();
            }
            cellList.add(i, cellX);
            absoluteY = absoluteY + cellX.get(i).getCellHeight();
        }
    }
    static List<List<Cell>> getCellList() {
        return cellList;
    }
}
