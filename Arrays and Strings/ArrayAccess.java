
public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original value at index 2: " + numbers[2]);
        
        numbers[2] = 35;
        System.out.println("Modified value at index 2: " + numbers[2]);
    }
}


//OUTPUT*********************

// Original value at index 2: 30
// Modified value at index 2: 35