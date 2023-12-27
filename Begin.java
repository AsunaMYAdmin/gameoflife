package gameoflife;

import java.util.LinkedHashSet;
import java.util.Set;

class Begin {
    static void start() {
       for(int i = 0; i < CellManagement.getCellList().size(); i++) {
           for (int k = 0; k < CellManagement.getCellList().get(i).size(); k++) {
               Set<Integer> random = new LinkedHashSet<>();
               for (int j = 0; j < CellManagement.getCellList().get(i).size(); j++) {
                   random.add((int)(Math.random() * CellManagement.getCellList().get(i).size()));
               }
               for (int num : random) {
                   CellManagement.getCellList().get(i).get(k).setLifeCycle(num == k);
               }
           }
       }
    }
}
