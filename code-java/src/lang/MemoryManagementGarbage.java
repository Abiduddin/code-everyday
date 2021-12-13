package lang;

public class MemoryManagementGarbage {

    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        long mem1, mem2;
        Integer someInts[] = new Integer[1000];

        System.out.println("total memory is: " + run.totalMemory());
        mem1 = run.freeMemory();
        System.out.println("total memory is: " + mem1);

        run.gc();
        mem1 = run.freeMemory();
        System.out.println("free memory after garbage collection: " + mem1);

        for (int i = 0; i < 1000; i++) {
            someInts[i] = Integer.valueOf(i);
        }

        mem2 = run.totalMemory();
        run.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        System.out.println("Memory used by allocation: : " + (mem2 - mem1));

        for (int i = 0; i < 1000; i++) {
            someInts[i] = null;
        }

        run.gc();
        mem2 = run.freeMemory();
        System.out.println("Free memory after discarded Integers: " + mem2);
    }
}
