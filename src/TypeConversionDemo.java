public class TypeConversionDemo {
    public static void main(String[] args) {
        int i = 100;
        double d = i; 
        System.out.println("Implicit Conversion:");
        System.out.println("int value: " + i);
        System.out.println("Converted to double: " + d);
        double x = 99.99;
        int y = (int) x; 
        System.out.println("\nExplicit Conversion:");
        System.out.println("double value: " + x);
        System.out.println("Converted to int: " + y);
        char ch = 'A';
        int chVal = ch;
        System.out.println("\nCharacter to Integer:");
        System.out.println("char value: " + ch);
        System.out.println("ASCII value: " + chVal);
        int num = 123;
        String str = Integer.toString(num);
        System.out.println("\nInteger to String:");
        System.out.println("String value: " + str);
        String str2 = "456";
        int num2 = Integer.parseInt(str2);
        System.out.println("\nString to Integer:");
        System.out.println("Integer value: " + num2);
    }
}