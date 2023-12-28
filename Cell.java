package gameoflife;

import org.jetbrains.annotations.NotNull;

class Cell {
    private String lifeCycle;
    private int corX;
    private int corY;
    private int selfNumber;

    // Если живая - то чёрная, если мёртвая - то белая
    void setLifeCycle(@NotNull Boolean whatIsLive) {
        if (whatIsLive) {
            lifeCycle = "live";
        } else {
            lifeCycle = "dead";
        }
    }
    String getLifeCycle() {
        return lifeCycle;
    }
    // Размеры одной клетки
    int getCellWeight() {
        return 10;
    }
    int getCellHeight() {
        return 10;
    }

    int getCorX() {
        return corX;
    }

    private void setCorX(int corX) {
        this.corX = corX;
    }

    int getCorY() {
        return corY;
    }

    private void setCorY(int corY) {
        this.corY = corY;
    }

    Cell(int x, int y, Boolean isLive) {
        this.setCorX(x);
        this.setCorY(y);
        this.setLifeCycle(isLive);
    }

    int getSelfNumber() {
        return selfNumber;
    }

    void setSelfNumber(int selfNumber) {
        this.selfNumber = selfNumber;
    }
}