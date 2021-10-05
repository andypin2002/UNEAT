package numbers.prime;

public class PrimeNumberCollection {

    public PrimeNumberCollection(){
        setPrimeNumbers(new int[0]);
    }

    int[] primeNumbers;
    int max;
    int min;

    public int[] getPrimeNumbers(){
        return this.primeNumbers;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setPrimeNumbers(int[] primeNumbers){
        this.primeNumbers = primeNumbers;
    }

}
