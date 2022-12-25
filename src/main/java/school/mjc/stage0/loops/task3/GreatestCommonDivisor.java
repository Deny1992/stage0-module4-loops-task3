package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first == 0 || second == 0){
            System.out.println(Math.max((int) first, second));
            return;
        }
        int divisor = Math.min(first, second);
        for (int i = divisor; i > 0; i--) {
            if(first % i == 0 && second % i == 0){
                divisor = i;
                break;
            }
        }
        System.out.println(divisor);
    }
}
