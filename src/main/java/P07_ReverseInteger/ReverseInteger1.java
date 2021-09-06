package P07_ReverseInteger;

public class ReverseInteger1 {

    public static void main(String[] args) {

    }

    public static int reverse(int x) {

        try {
            if ((x < Integer.MIN_VALUE) || (x > Integer.MAX_VALUE) || x == 0) {
                return 0;
            } else {
                StringBuilder stringBuilder = new StringBuilder().append(x).reverse();

                if (x < 0) {
                    int length = stringBuilder.length();
                    stringBuilder.deleteCharAt(length - 1);
                    Integer integer = Integer.valueOf(stringBuilder.toString());
                    return -1 * integer;
                }else {
                    Integer integer = Integer.valueOf(stringBuilder.toString());
                    return integer;
                }
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
