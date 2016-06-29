import java.io.*;

/**
 * Created by Simon Zhong on 2016/6/17.
 * Processing a txt
 */
public class Fail {
    public static void main(String[] args) {
        write();
    }

    private static void write() {
        String path1 = "E:\\Simon\\Desktop\\test.txt";
        String path2 = "E:\\Simon\\Desktop\\new test.txt";
        BufferedReader br = null;
        String line;
        StringBuilder sb = new StringBuilder();
        boolean o = true;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "GBK"));
        } catch (Exception e) {
            e.printStackTrace();
            o = false;
            System.out.println("Can't load fail");
        }

        if (o) {
            while (true) {
                try {
                    line = br.readLine();
                    sb.append(line);
                    sb.append("<br>");
                    sb.append("\r\n");
                    if (line == null) {
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            try {
                br.close();
                BufferedWriter bw = new BufferedWriter(new FileWriter(path2));
                bw.write(sb.toString());
                bw.flush();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
