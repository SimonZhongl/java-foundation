import java.util.Scanner;

/**
 * Created by Simon Zhong on 2016/6/13.
 * Topic 1
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Topic1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int month = sr.nextInt();
        int rabbits, n_1 = 0, n_2 = 1;
        if (month == 1 || month == 0) {
            rabbits = 1;
            System.out.print(rabbits);
        } else {
            for (int i = 1; i <= month; i++) {
                rabbits = n_1 + n_2;
                n_2 = n_1;
                n_1 = rabbits;
                System.out.println(rabbits);
            }
        }
    }
}
