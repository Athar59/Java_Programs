


//Class ReferenceTypesExercise
public class ReferenceTypesExercise {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}


//Person Class
class Person {
    String name;
    int age;

}

//OUTPUT**********************************

// Name: John
// Age: 30
