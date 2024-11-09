public class Operators {
    
    public static void main(String[] args) {
        // Arithmetic operators
        System.out.println("****Arithmetic operators****");
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 + num2); //30
        System.out.println(++num2); // 21
        System.out.println(num2); // 21
        System.out.println(--num2); // 20
        System.out.println(num2); // 20

        // Assignment operators
        System.out.println("****Assignment operators****");
        int num3 = 10;
        num3 = num3 + 10;
        System.out.println(num3);
        
        num3 *= 10;
        System.out.println(num3);

        // Comparison operators
        System.out.println("****Comparison operators****");
        int num4 = 100;
        int num5 = 200;
        System.out.println(num4 == num5);
        System.out.println(num5 > num4);

        // Logical operators
        System.out.println("****Logical operators****");
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag3);

        boolean flag4 = 10 > 20; // false
        System.out.println(flag4 || flag2); // false
        
        System.out.println(!flag4); // true
        
        // Bitwise operators
        System.out.println("****Bitwise operators****");        
        System.out.println(flag1 ^ flag2); // true
        System.out.println(flag1 ^ flag3); // false
    }
}

// Logical Operator

// AND / &&
// 0   0   =>  0
// 0   1   =>  0
// 1   0   =>  0
// 1   1   =>  1

// OR / ||
// 0   0   =>  0
// 0   1   =>  1
// 1   0   =>  1
// 1   1   =>  1

// NOT / !
// 0 => 1
// 1 => 0
