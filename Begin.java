package gameoflife;

import java.util.ArrayList;
import java.util.List;

class Begin {
    static void start(int beginX, int beginY) {
       CellManagement.cellsSetNumber();
       List<Integer> randomNumbersList = new ArrayList<>();
       // Создаются рандомные числа, количество которых меньше до числа в 5 раз меньше общего количества клеток
       for (int k = 0; k < beginX * beginY / 5; k++) {
           int randomNumber = (int)(Math.random() * (beginX * beginY));
           randomNumbersList.add(randomNumber);
       }
       // Проверяются значения, внесённые в список случайных и по индексу присваивается жизненный цикл
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
