public class Main {
    public static void main(String[] args) {
        String field[][] = {
                { "1", "2", "3" },
                { "4", "5", "6" },
                { "7", "8", "9" }
        };

        // todo: Реализовать отрисовку поля крестиков ноликов - Юрий Андреевич
        print(field);
        // todo: Реализовать выбор позици и его валидацию при помощи ввода с клавиатуры - Дима

        // todo: Реализовать проверку на победу данного массива - Даниил
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
