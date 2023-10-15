package pckg.kata1;

public class Worker {
    private String name;
    private int hours;
    private int payment;

    public Worker(String name, int hours, int payment) {
        this.name = name;
        this.hours = hours;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getPayment() {
        return payment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int totalPayment(){
        return this.hours * this.payment;
    }
}
