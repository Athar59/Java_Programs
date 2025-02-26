

public class InstanceVsClassVariablesExercise {
    static int classVariable = 100;  // Variável de classe (estática)
    int instanceVariable = 200;     // Variável de instância

    public static void main(String[] args) {
        System.out.println("Class Variable: " + classVariable);

        InstanceVsClassVariablesExercise obj = new InstanceVsClassVariablesExercise();
        System.out.println("Instance Variable: " + obj.instanceVariable);
    }
}

//OUTPUT**********************************

// Class Variable: 100
// Instance Variable: 200