public class StringBufferProgram {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  
        
        System.out.println("StringBuffer result: " + sb.toString());
    }
}


//OUTPUT**********************************

//StringBuffer result: Hello World
