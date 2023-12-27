package gameoflife;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Life {

     static int checkLives(int intY, int intX) {
         int count = 0;
         List<List<Cell>> all = CellManagement.getCellList();
         if ((intY - 1) >= 0 && (intX - 1) >= 0) {
             if (all.get(intY - 1).get(intX - 1).getLifeCycle().equals("live")) {
                 count++;
             }
        }
        if ((intY - 1) >= 0) {
            if (all.get(intY - 1).get(intX).getLifeCycle().equals("live")) {
                count++;
            }
        }
        if ((intY - 1) >= 0 && all.get(intY).iterator().hasNext()) {
            if (all.get(intY - 1).get(intX + 1).getLifeCycle().equals("live")) {
                count++;
            }
        }
        if (all.get(intY).iterator().hasNext()) {
            if (all.get(intY).get(intX + 1).getLifeCycle().equals("live")) {
                count++;
            }
        }
        if (all.iterator().hasNext() && all.get(intY).iterator().hasNext()) {
            if (all.get(intY + 1).get(intX + 1).getLifeCycle().equals("live")) {
                count++;
            }
        }
        if (all.iterator().hasNext()) {
            if (all.get(intY + 1).get(intX).getLifeCycle().equals("live")) {
                count++;
            }
        }
        if (all.iterator().hasNext() && (intX - 1) >= 0) {
            if (all.get(intY + 1).get(intX - 1).getLifeCycle().equals("live")) {
                count++;
            }
        }
        if ((intX - 1) >= 0) {
            if (all.get(intY).get(intX - 1).getLifeCycle().equals("live")) {
                count++;
            }
        }
        return count;
    }
    static void start() {
        for (int i = 0; i < CellManagement.getCellList().size(); i++) {
            for (int k = 0; k < CellManagement.getCellList().get(i).size(); k++) {
                Cell thisCell = CellManagement.getCellList().get(i).get(k);
                int countOfLives = checkLives(i, k);
                if (thisCell.getLifeCycle().equals("dead") && countOfLives == 3) {
                    thisCell.setLifeCycle(true);
                } else thisCell.setLifeCycle((thisCell.getLifeCycle().equals("live")) && (countOfLives == 2 || countOfLives == 3));
           }
        }
    }
}
