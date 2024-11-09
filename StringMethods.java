public class StringMethods {
    public static void main(String[] args) {
        String companyName = "Ednue Technologies Private Limited";

        // To find string length
        System.out.println(companyName.length()); // 34
        
        // To change the text to upper case
        System.out.println(companyName.toUpperCase()); // EDNUE TECHNOLOGIES PRIVATE LIMITED
        
        // To change the text to lower case
        System.out.println(companyName.toLowerCase()); // ednue technologies private limited
        
        // To locate an element / word
        System.out.println(companyName.indexOf("Tech")); // 6
        System.out.println(companyName.indexOf("Company")); // -1 (when match doesn't exists)
        System.out.println(companyName.indexOf("e")); // 4
        System.out.println(companyName.indexOf("E")); // 0
    }
}
