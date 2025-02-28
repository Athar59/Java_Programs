

public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Length of string: " + str.length());
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Concatenation: " + str.concat(" Again"));
        System.out.println("Replacement: " + str.replace("World", "Java"));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("Trim: '" + str.trim() + "'");
    }
}


//OUTPUT***********************************

// Character at index 4: o
// Length of string: 11
// Substring: Hello
// Concatenation: Hello World Again
// Replacement: Hello Java
// Index of 'World': 6
// To lower case: hello world
// To upper case: HELLO WORLD
// Trim: 'Hello World'