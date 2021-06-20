package nov.issoft.stuff;

public class Calculator{

    private static Double lastResult;

    private static double plus(double first, double second) {
        return first + second;
    }

    private static double minus(double first, double second) {
        return first - second;
    }

    private static double multiply(double first, double second) {
        return first * second;
    }

    private static double divide(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println("3+2");
        double result = plus(3, 2);
        if (result % 1 > 0) {
            System.out.println("result " + result);
        } else {
            System.out.println("result " + (int) result);
        }
        System.out.println("lastResult " + lastResult);
        lastResult = plus(3, 2);

        System.out.println("3-2");
        result = minus(3, 2);
        if (result % 1 > 0) {
            System.out.println("result " + result);
        } else {
            System.out.println("result " + (int) result);
        }
        System.out.println("lastResult " + lastResult);
        lastResult = minus(3, 2);

        System.out.println("3*2");
        result = multiply(3, 2);
        if (result % 1 > 0) {
            System.out.println("result " + result);
        } else {
            System.out.println("result " + (int) result);
        }
        System.out.println("lastResult " + lastResult);
        lastResult = multiply(3, 2);

        System.out.println("10.50/2");
        result = divide(10.50,2);
        if (result%1>0){
            System.out.println("result " + result);
        } else {
            System.out.println("result " + (int) result);
        }
        System.out.println("lastResult " + lastResult);
        lastResult = divide(10.50,2);
    }
}