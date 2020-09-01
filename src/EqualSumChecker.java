public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasequalsum(1, 1, 1));
    }

    public static boolean hasequalsum(int x, int y, int z) {
        if ((int) (x + y) != 1) {
            return false;
        } else if ((int) (x + y) == 2) {
            return true;
        }
        return false;


    }

}
