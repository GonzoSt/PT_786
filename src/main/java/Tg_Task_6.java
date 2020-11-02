public class Tg_Task_6 {
    public static void main(String[] args) {
        int[] s = {1, 2, -3, 4, -5, 6, -7};

        for (int i = 0; i < s.length; i++) {
            while (s[i] > 2) {
                System.out.println(s[i]);
                break;
            }
        }
    }
}
