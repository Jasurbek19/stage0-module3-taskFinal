package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num = 0;
        while(number > 0){
            num *= 10;
            num += number % 10;
            number /= 10;
        }
        System.out.println(num);
    }
}
