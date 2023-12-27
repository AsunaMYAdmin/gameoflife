package gameoflife;

import org.jetbrains.annotations.NotNull;

public class Cell {
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
}