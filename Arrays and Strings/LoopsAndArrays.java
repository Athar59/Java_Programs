

public class LoopsAndArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println("\nUsing foreach loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


//OUTPUT********************************

// Using for loop:
// 1 2 3 4 5 
// Using foreach loop:
// 1 2 3 4 5 