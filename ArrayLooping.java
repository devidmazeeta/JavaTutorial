public class ArrayLooping {
    public static void main(String[] args) {

        // Array Looping
        System.out.println("********* Array Looping using Foreach Loop *********");
        
        String[] texts = { "Ednue", "Tech", "Pvt", "Ltd" };

        // foreach looping
        for (String text: texts) {
            System.out.println("Text is: " + text);
        }

        System.out.println("********* Array Looping using For Loop *********");
        
        for (int num = 1; num < texts.length; num++) {
            System.out.println("Text is: " + texts[num]);
        }
    }
}
