package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int curentNumber = 0;
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++){
            curentNumber += Math.pow(10, i) * 9;
            sum += curentNumber;
        }
        System.out.println(sum);
    }
}
