package patternPrinting.type_02_Square;

public class Test {

    Test test;

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

//        long total = runtime.totalMemory();
//        long free = runtime.freeMemory();
//        long max = runtime.maxMemory();
//
//        System.out.println("===== JVM Heap Info =====");
//        System.out.printf("Initial Heap (totalMemory): %d MB%n", total / (1024 * 1024));
//        System.out.printf("Free Heap: %d MB%n", free / (1024 * 1024));
//        System.out.printf("Max Heap (maxMemory): %d MB%n", max / (1024 * 1024));

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.test = t2;
        t2.test = t3;
        t3.test = t1;
        t1 = null;
        t2 = null;
        t3 = null;

        System.out.println("done");

    }
}
