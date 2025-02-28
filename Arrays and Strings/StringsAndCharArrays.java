

public class StringsAndCharArrays {
    public static void main(String[] args) {
        String str = "Java";
        char[] charArray = str.toCharArray();
        
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        
        String newStr = new String(charArray);
        System.out.println("\nConverted char array to string: " + newStr);
    }
}

//OUTPUT*************************************

//J a v a 
//Converted char array to string: Java