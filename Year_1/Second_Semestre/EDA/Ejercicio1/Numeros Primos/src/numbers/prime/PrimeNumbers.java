package numbers.prime;
public class PrimeNumbers {
    public static PrimeNumberCollection getPrimeCollection(int[] numbers){

        int[] primeNumbers = collectPrimeNumbersArray(numbers);

        int max = primeNumbers[0];
        int min = primeNumbers[0];
        for(int i=0;i <primeNumbers.length; i++){
            if(max < primeNumbers[i]) max = primeNumbers[i];
            min = Math.min(min, primeNumbers[i]);
        }


        var collection = new PrimeNumberCollection();
        collection.setPrimeNumbers(primeNumbers);
        collection.setMin(min);
        collection.setMax(max);


        return collection;
    }

    public static int[] collectPrimeNumbersArray(int[] numbers){
        int primeNumberCount = countPrimeNumbers(numbers);

        if(primeNumberCount == 0) return new PrimeNumberCollection();

        int[] primeNumbers = new int[primeNumberCount];

        int insertIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])){
                primeNumbers[insertIndex] = numbers[i];
                insertIndex++;
            }
        }
        return
    }


    private static int countPrimeNumbers(int[] numbers) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])) count++;
        }
        return count;
    }

    public static boolean isPrime(int number){
        if(number <= 1) return false;
        for(int i = 2; i < number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
