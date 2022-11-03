package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class ArithmeticMeanFinder implements Subscriber {

    Integer sum = null;
    Integer counter = null;

    @Override
    public void action(int x) {
        if(sum == null){ 
            sum=x;
        }
        else{
            sum=sum+x;
        }
        if(counter == null){ 
            counter=1;
        }
        else{
            counter=counter+1;
        }
    }

    public Float getArithmeticMean() {
        return (float) sum / counter;
    }
}