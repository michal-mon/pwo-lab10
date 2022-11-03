package pwo.lab10.observer;

public class _run {

    public static void main(String[] args) {

        NumberGetter numberGetter = new NumberGetter();

        MaxFinder maxFinder = new MaxFinder();
        SumFinder sumFinder = new SumFinder();
        ArithmeticMeanFinder meanFinder = new ArithmeticMeanFinder(); 

        numberGetter.add(maxFinder);
        numberGetter.add(sumFinder);
        numberGetter.add(meanFinder);

        numberGetter.getNumbers(3);

        System.out.println("Max: " + maxFinder.getMax());
        System.out.println("Sum: " + sumFinder.getSum());
        System.out.println("Mean: " + meanFinder.getArithmeticMean());
    }
}