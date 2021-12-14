package lang;

public class SystemArrayCopy {
    static byte a[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    static byte b[] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};
    public static void main(String[] args) {

        printArray();

        System.arraycopy(a,0,b,0,a.length);
        printArray();

        System.arraycopy(a, 0, a, 2,a.length-2);
        System.arraycopy(b, 2, b, 0,a.length-2);
        printArray();
    }

    private static void printArray() {
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));
    }
}
