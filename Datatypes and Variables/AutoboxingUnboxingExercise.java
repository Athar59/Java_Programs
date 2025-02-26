

public class AutoboxingUnboxingExercise {
    public static void main(String[] args) {
        // Autoboxing: 
        int primitiveInt = 100;
        Integer integerObject = primitiveInt;

        // Unboxing: 
        int unboxedInt = integerObject;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object (after autoboxing): " + integerObject);
        System.out.println("Int after unboxing: " + unboxedInt);
    }
}

//OUTPUT***********************************

// Primitive int: 100
// Integer object (after autoboxing): 100
// Int after unboxing: 100