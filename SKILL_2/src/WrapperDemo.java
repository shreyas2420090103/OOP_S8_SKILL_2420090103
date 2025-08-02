public class WrapperDemo {
    public static void main(String[] args) {
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num); 
        Integer autoWrappedNum = num;             
        int unwrappedNum = wrappedNum.intValue(); 
        int autoUnwrappedNum = autoWrappedNum;    
        System.out.println("Original primitive: " + num);
        System.out.println("Boxed (Integer object): " + wrappedNum);
        System.out.println("Autoboxed (Integer object): " + autoWrappedNum);
        System.out.println("Unboxed (primitive): " + unwrappedNum);
        System.out.println("Auto-unboxed (primitive): " + autoUnwrappedNum);
        String str = "123";
        int parsedValue = Integer.parseInt(str);
        System.out.println("Parsed from String to int: " + parsedValue);
    }
}

