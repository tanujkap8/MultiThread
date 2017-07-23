package Q2;


public class PrimeThread {

    public static boolean isPrime(int n) {

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;


    }


    public static void printPrime() {

        for (int i = 1; i <= 20; i++) {

            if (isPrime(i))
                System.out.println("Prime:" + i);
        }
    }

    public static void printNonPrime() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i))
                System.out.println("NonPrime:" + i);

        }
    }

    public static void main(String[] args) {
        Thread prime=new Thread(()->printPrime());
        prime.start();
        printNonPrime();
    }

}