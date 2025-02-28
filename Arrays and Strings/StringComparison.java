

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = new String("Hello");
        
        System.out.println("Using == operator: " + (str1 == str3));
        System.out.println("Using equals(): " + str1.equals(str3));
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
    }
}

//OUTPUT*************************************

// Using == operator: false
// Using equals(): true
// Using equalsIgnoreCase(): true