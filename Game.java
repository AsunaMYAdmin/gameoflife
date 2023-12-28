package gameoflife;

import java.util.Scanner;

class Game {

    static void start() {
        Scanner game = new Scanner(System.in);
        System.out.println("Количество по вертикали? (От 30 до 100)");
        int y = game.nextInt();
        if (y > 100) {
            System.out.println("Количество клеток должно быть не больше 100!");
            game.close();
            return;
        }
        if (y < 30) {
            System.out.println("Количество клеток должно быть не меньше 30!");
            game.close();
            return;
        }

        System.out.println("Количество клеток по горизонтали? (От 30 до 100)");
        int x = game.nextInt();
        if (x > 100) {
            System.out.println("Количество клеток должно быть не больше 100!");
            game.close();
            return;
        }
        if (x < 30) {
            System.out.println("Количество клеток должно быть не меньше 30!");
            game.close();
            return;
        }

        game.close();

        GameField.paintField(x, y);
        Begin.start(x, y);
        GameField.paintField(x, y);
        Iterator.generation(x, y);
    }
}
