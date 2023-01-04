package FunInterfaceAndLambda;

public class Main {
    public static void main(String[] args) {

        Runable runable = new Runable() {
            @Override
            public void run() {
                System.out.println("I run first.");
            }
        };
        runable.run();


        Runable runable1 = () -> System.out.println("I run second.");
        runable1.run();
    }
}

@FunctionalInterface
interface Runable {

    void run();
}
