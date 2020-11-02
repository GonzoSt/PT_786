public class Tg_Task_5 {
    public static void main(String[] args) {
        int[] s = {1, 2, -3, 4, -5, 6, -7};

        for (int i = 0; i < s.length; i++) {
            if (s[i] == 4) {
                System.out.println(i);
                break;
            }
        }
    }
}
