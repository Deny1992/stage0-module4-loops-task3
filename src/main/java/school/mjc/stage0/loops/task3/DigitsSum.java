package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = Math.abs(t);
        String str = t +"";
        int sum = 0;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            sum += t / Math.pow(10, i);
            t %= Math.pow(10, i);
        }
        System.out.println(sum);
    }
}
