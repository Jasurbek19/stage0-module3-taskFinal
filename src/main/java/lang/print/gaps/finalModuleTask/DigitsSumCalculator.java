package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num = 0;
        while(number > 0){
            num += number % 10;
            number /= 10;
        }
        System.out.println(num);
    }
}
