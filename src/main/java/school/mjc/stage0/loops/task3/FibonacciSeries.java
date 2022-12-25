package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci < 1){
            System.out.println(0);
            return;
        }


        int f1 = 0, f2 = 1;
        System.out.println(f1);
        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(f2);
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }

}
