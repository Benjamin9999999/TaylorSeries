public class TaylorSeries {

    // Function to calculate the factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Function to calculate the nth term of the Taylor series
    static double nthTerm(double x, int n) {
        return Math.pow(x, n) / factorial(n);
    }

    // Function to calculate the sum of the Taylor series up to a given degree
    static double taylorSeries(double x, int degree) {
        double sum = 0;
        for (int n = 0; n <= degree; n++) {
            sum += nthTerm(x, n);
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example: Calculating e^x using Taylor series expansion
        double x = 2.0; // Value at which to evaluate the function
        int degree = 9; // Degree of the Taylor series

        double result = taylorSeries(x, degree);
        System.out.println("e^" + x + " (approximated using Taylor series of degree " + degree + "): " + result);
    }
}
