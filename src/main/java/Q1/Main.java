package Q1;


public class Main{





    public static void printOdd() {

        for (int i = 1; i <= 19; i = i + 2) {

            System.out.print(i+" ");

        }

        System.out.println();
    }

    public static void printEven() {

        try {

            Thread.sleep(500);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        for (int i = 0; i <= 20; i = i + 2) {

            System.out.print(i+" ");

        }
    }

    public static void main(String[] args) {
        Thread odd=new Thread(()->printOdd());
        Thread even=new Thread(()->printEven());
        odd.start();
        even.start();
    }

}