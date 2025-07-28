package Day03;

import java.util.Random;

public class VertificationCode {
    public static void main(String[] args) {
        Random random = new Random();
        String string = "";
        for (int i = 0; i < 4; i++) {
            int side = random.nextInt(2);
            if (side == 0)// 选择小写字母
            {
                string +=(char)Method.xiaoxie();
            } else {
                string += (char)Method.daxie();

            } // 选择大写字母
        }
        string+=random.nextInt(5)+1;
        System.out.println(string);
    }

    public static class Method {
        public static int xiaoxie() {
            Random random = new Random();
            return random.nextInt(25) + 97;
        }

        public static int daxie() {
            Random random = new Random();
            return random.nextInt(25) + 65;
        }
    }

}
