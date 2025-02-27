public class ForEach_Loop {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int num : numbers) {
            if (num > 5 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}

//OUTPUT*************

// 8
// 10