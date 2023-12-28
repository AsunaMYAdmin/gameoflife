package gameoflife;

public class Iterator {
    private static Boolean allDead() {
        int count = 0;
        for (int i = 0; i < CellManagement.getCellList().size(); i++) {
            for (Cell cell : CellManagement.getCellList().get(i)) {
                if (cell.getLifeCycle().equals("live")) {count++;}
            }
        }
        return (count > 0);
    }

    static void generation(int x, int y) {
        while (allDead()) {
            Life.start();
            GameField.paintField(x, y);
        }
    }
}
