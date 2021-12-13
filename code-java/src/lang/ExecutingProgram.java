package lang;

public class ExecutingProgram {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process p = null;

        try{
            p = rt.exec("postman");
            p.waitFor();
        }catch (Exception e){
            System.out.println("Error executing the program.");
        }
    }
}
