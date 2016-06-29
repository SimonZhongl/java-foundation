/**
 * Created by Simon Zhong on 2016/6/24.
 * Topic3
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Topic3 {
    public static void main(String[] args) {
        narcissistic();
    }

    private static void narcissistic() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if ((i * i * i) + (j * j * j) + (k * k * k) == i * 100 + j * 10 + k) {
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
    }
}
