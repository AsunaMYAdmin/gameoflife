package gameoflife;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Life {

     private static Map<Integer, Integer> checkLives() {
         Map<Integer, Integer> result = new HashMap<>();
         List<List<Cell>> all = CellManagement.getCellList();
         for (int i = 0; i < all.size(); i++) {
             for (int k = 0; k < all.get(i).size(); k++) {
                 Cell cell = all.get(i).get(k);
                 int count = 0;
                 // Проверка левой верхней клетки
                 if ((k - 1) >= 0 && (i - 1) >= 0) {
                     if (all.get(i - 1).get(k - 1).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка верхней клетки
                 if ((i - 1) >= 0) {
                     if (all.get(i - 1).get(k).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка верхней левой клетки
                 if ((i - 1) >= 0 && (k + 1) < (all.get(i).size())) {
                     if (all.get(i - 1).get(k + 1).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка правой клетки
                 if ((k + 1) < (all.get(i).size())) {
                     if (all.get(i).get(k + 1).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка нижней правой клетки
                 if ((k + 1) < (all.get(i).size()) && (i + 1) < (all.size())) {
                     if (all.get(i + 1).get(k + 1).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка нижней клетки
                 if ((i + 1) < (all.size())) {
                     if (all.get(i + 1).get(k).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка левой нижней клетки
                 if ((i + 1) < (all.size()) && (k - 1) >= 0) {
                     if (all.get(i + 1).get(k - 1).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Проверка левой клетки
                 if ((k - 1) >= 0) {
                     if (all.get(i).get(k - 1).getLifeCycle().equals("live")) {
                         count++;
                     }
                 }
                 // Добавление индекса клетки и количества живых клеток рядом
                 result.put(cell.getSelfNumber(), count);
             }
         }
       return result;
    }
    static void start() {
         // Коллекция, которая содержит ключи и индексы живых по результатам проверки
        Map<Integer, Integer> result = checkLives();
        List<List<Cell>> all = CellManagement.getCellList();
        for (List<Cell> cells : all) {
            for (Cell cell : cells) {
                // Изменяет состояние, по условию
                if (cell.getLifeCycle().equals("live")) {
                    if (result.get(cell.getSelfNumber()) > 3 || result.get(cell.getSelfNumber()) < 2) {
                        cell.setLifeCycle(false);
                    }
                }
                if (cell.getLifeCycle().equals("dead")) {
                    if (result.get(cell.getSelfNumber()) == 3) {
                        cell.setLifeCycle(true);
                    }
                }
            }
        }
    }
}