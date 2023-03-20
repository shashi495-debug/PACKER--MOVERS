public class Factorial {

    public static int factorialRec(int n) {
        if (n < 0) {
            throw new RuntimeException("Number should be greater than 0");
        }
        if (n<=1) {
            return n;
        }
        int subSolution = factorialRec(n-1);
        int solution = subSolution * n;
        return solution;
    }


    public static int factorialItr(int n) {
        if (n < 0) {
            return -1;
        }
        if ( n <= 1 ) {
            return n;
        }
        int product = 1;
        for(int i = n; i>=1; i--) {
            product = product*i;
        }
        return product;
    }

    public static void main(String[] args) {

        //System.out.println(factorialItr(5));
        System.out.println(factorialRec(-5));

    }
}
