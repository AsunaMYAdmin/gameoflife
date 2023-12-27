package gameoflife;

import org.jetbrains.annotations.NotNull;

class Cell {
    private String lifeCycle;
    private int corX;
    private int corY;

    // Если живая - то чёрная, если мёртвая - то белая
    String getLifeCycle(@NotNull Boolean whatIsLive) {
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

    Cell(int x, int y) {
        this.setCorX(x);
        this.setCorY(y);
    }
}