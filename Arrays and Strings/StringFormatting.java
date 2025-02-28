

public class StringFormatting {
    public static void main(String[] args) {
        double value = 3.14159;
        
        String formatted = String.format("Formatted value: %.2f", value);
        System.out.println(formatted);
    }
}

//OUTPUT*************************************

//Formatted value: 3.14