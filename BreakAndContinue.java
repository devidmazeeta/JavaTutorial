public class BreakAndContinue {
    public static void main(String[] args) {

        // Break
        System.out.println("********* Break *********");

        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                if (number % 5 == 0) {
                    System.out.println("Number is divisible by 2 & 5 : " + number);
                    break;
                }
                
                System.out.println("Number is divisible by 2 & not divisible by 5 : " + number);
            }
        }

        // Continue
        System.out.println("********* Continue *********");

        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                if (number % 5 == 0) {
                    System.out.println("Number is divisible by 2 & 5 : " + number);
                    continue;
                }
                
                System.out.println("Number is divisible by 2 & not divisible by 5 : " + number);
            }
        }
    }
}
