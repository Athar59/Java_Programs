public class BreakAndContinue {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }
}

//OUTPUT*****************

// 1