package varargs;

public class VarArgsExample {
    /*
            public double calculateAverage(int a, int b) {
                return (a + b) / 2;
            }

            public double calculateAverage(int a, int b, int c) {
                return (a + b) / 3;
            }
     */

    public double calculateAverage(String foo, int... numbers) {
        int lenghtOfNumbers = numbers.length;
        double result = 0;

        for (int number : numbers) {
            result += number;
        }
        /*
                int i = 0;
                for (i = 0; i < numbers.length; i++) {

                }
                i++;
         */



        return result / lenghtOfNumbers;
    }

    public static void main(String[] args) {
        double averageResult = new VarArgsExample().calculateAverage("Average", 25, 25, 45, 56, 9, 45, 67);
        System.out.println(averageResult);
    }

}
