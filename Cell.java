package gameoflife;

import org.jetbrains.annotations.NotNull;

class Cell {
    private String lifeCycle;
    //Тут должна быть переменная для обозначения положения на клеточном поле

    // Если живая - то чёрная, если мёртвая - то белая
    public String getLifeCycle(@NotNull Boolean whatIsLive) {
        if (whatIsLive) {
            return "live";
        } else {
            return "dead";
        }
    }
    // Размеры одной клетки
    int getCellWeight() {
        return 10;
    }
    int getCellHeight() {
        return 10;
    }
}