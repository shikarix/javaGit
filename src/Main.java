import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String field[][] = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        // todo: Реализовать отрисовку поля крестиков ноликов - Юрий Андреевич
        print(field);
        // todo: Реализовать выбор позици и его валидацию при помощи ввода с клавиатуры - Дима
        motion(field, ChangePlayer(counter(1)));
        // todo: Реализовать проверку на победу данного массива - Даниил
    }

    public static int counter(int arg) { // if arg == 1 - добавляет 1 к ходу
        int move = 0;
        if (arg == 1) {
            move++;
        }
        return move;
    }

    public static String ChangePlayer(int move) {
        String player;
        if (move % 2 == 0) {
            player = "0";
            return player;
        } else {
            player = "X";
            return player;
        }
    }

    public static String[][] motion(String[][] field, String player) {
        int moveX;
        int moveY;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Клетка по горизонтали");
            moveX = sc.nextInt();
            System.out.println("Клетка по вертикали");
            moveY = sc.nextInt();
            if(!field[moveX - 1][moveY - 1].equals("X") && !field[moveX - 1][moveY - 1].equals("0")) {
                field[moveX - 1][moveY - 1] = player;
                return field;
            }else{
                System.out.println("Клетка занята, бери другую");
            }
        }
    }
    public static void print(String mass[][])
    {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(" "+ mass[i][j] + " ");
                if(j!=2)
                {
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i!=2)
            {
                System.out.println("-----------");
            }
        }
    }
}
