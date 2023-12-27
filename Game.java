package gameoflife;

import java.util.Scanner;

class Game {

    static void start() {
        Scanner game = new Scanner(System.in);
        System.out.println("Количество по вертикали? (До 100)");
        int y = game.nextInt();
        if (y > 100) {
            System.out.println("Количество клеток должно быть не больше 100!");
            game.close();
            return;
        }

        System.out.println("Количество клеток по горизонтали? (До 100)");
        int x = game.nextInt();
        if (x > 100) {
            System.out.println("Количество клеток должно быть не больше 100!");
            game.close();
            return;
        }

        game.close();
        GameField.paintField(x, y);

        
    }
}
