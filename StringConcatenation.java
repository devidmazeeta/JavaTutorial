public class StringConcatenation {
    public static void main(String[] args) {
        String text1 = "Ednue Technologies";
        String text2 = "Private Limited";

        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println(text1.concat(text2));
        System.out.println(text1.concat(" ").concat(text2));

        String space = " ";
        String text4 = text1 + space + text2;
        System.out.println(text4);
        String text5 = text1 + " " + text2; // Suggested method
        System.out.println(text5);
    }
}
