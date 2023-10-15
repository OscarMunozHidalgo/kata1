package pckg.kata1;

public class Main {
    public static void main(String[] args) {
        Worker pedro = new Worker("Pedro", 40, 13);
        System.out.println(pedro.getName() + " cobra " + pedro.totalPayment());
    }
}
