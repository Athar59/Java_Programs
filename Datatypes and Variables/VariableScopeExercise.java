
public class VariableScopeExercise {
    static int classVariable = 10; 
    int instanceVariable = 20;    

    public static void main(String[] args) {
        int localVariable = 30;  
        System.out.println("Class Variable: " + classVariable);
        System.out.println("Local Variable in main: " + localVariable);

        VariableScopeExercise obj = new VariableScopeExercise();
        System.out.println("Instance Variable: " + obj.instanceVariable);
    }
}


//OUTPUT**********************************

// Class Variable: 10
// Local Variable in main: 30
// Instance Variable: 20