public class GCD {

    public static int gcdRec(int num1, int num2) {

        if ( num1 < 0 || num2 < 0) {
            throw new RuntimeException("Number cannot be negative");
        }
        if ( num1 == 0 || num2 == 0){
            return Math.max(num1, num2);
        }
        if ( num1 == num2 ) {
            return num1;
        }

        if (num1 > num2){
            return gcdRec(num1-num2, num2);
        }
        return gcdRec(num1, num2 - num1);
    }

    public static int gcdItr(int num1, int num2) {
        if ( num1 < 0 || num2 < 0) {
            throw new RuntimeException("Number cannot be negative");
        }
        if ( num1 == 0 || num2 == 0){
            return Math.max(num1, num2);
        }
        if ( num1 == num2 ) {
            return num1;
        }
        int gcd = 1;
        int smallerNum = Math.min(num1, num2);
        for(int i = smallerNum; i >= 1; i--){
            if ( num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
//        System.out.println(gcdItr(36, 18));
        System.out.println(gcdRec(4, 12));
    }
}
