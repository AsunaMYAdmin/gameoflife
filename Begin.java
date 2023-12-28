package gameoflife;

import java.util.ArrayList;
import java.util.List;

class Begin {
    static void start(int beginX, int beginY) {
       CellManagement.cellsSetNumber();
       List<Integer> randomNumbersList = new ArrayList<>();
       for (int k = 0; k < beginX * beginY / 5; k++) {
           int randomNumber = (int)(Math.random() * (beginX * beginY));
           randomNumbersList.add(randomNumber);
       }
       for (int i = 0; i < CellManagement.getCellList().size(); i++) {
           for (Cell cell : CellManagement.getCellList().get(i)) {
               for (int number : randomNumbersList) {
                   if (cell.getSelfNumber() == number) {
                       cell.setLifeCycle(true);
                   }
               }
           }
       }

    }
}
