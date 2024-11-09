public class Arrays {
    public static void main(String[] args) {

        // String Array
        System.out.println("********* String Array *********");

        String[] texts = { "Ednue", "Tech", "Pvt", "Ltd" };
        System.out.println("Length of a string array is :" + texts.length);
        int highestIndex = texts.length - 1;
        System.out.println("Highest index of a string array is :" + highestIndex);

        // Integer Array
        System.out.println("********* Integer Array *********");

        // String text = "Ednue";
        int[] numbers = { 101, 202, 303, 404, 505, 606 };
        System.out.println("Length of an integer array is :" + numbers.length);
        int highestIndex2 = numbers.length - 1;
        System.out.println("Highest index of an integer array is :" + highestIndex2);

        // To retrieve/fetch a value from an array
        String result1 = texts[3];
        System.out.println("4th value in texts string arrahy is: " + result1);

        int result2 = numbers[4];
        System.out.println("5th value in texts string arrahy is: " + result2);

        // int result3 = numbers[10]; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
    }
}
