import static java.lang.Math.sqrt;

/**
 * Created by Simon Zhong on 2016/6/14.
 * Topic2
 * 判断101-200之间有多少个素数，并输出所有素数。
 */
public class Topic2 {
    public static void main(String[] args) {
        prime();
    }

    private static void prime() {
        int tatal = 0;
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j <= (int) sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == (int) sqrt(i)) {
                    tatal++;
                    System.out.println(i);
                }
            }

        }
        System.out.println("Total:" + tatal);
    }
}
