// creating an interface
interface PaymentGateway{

    //added public static final by default in data member
    public static final int PAY = 1;

    //abstract method / partially complete method but method with implemetation is also known as concrete method / complete method
    public abstract void paymentProcess(double amount);
    boolean validatePayment(String details);

    // default method in interface (introduced after java 8)
    default void printReciept(){
        display();
        System.out.println("Payment Reciept");
    }

    // static method (introduced after java 8)
    static void showSupportedGateways(){
        // display();       // non static method cannot be called through static method
        System.out.println("Supported Payment Gateways, CreditCrad payment, Bank Transfer");
    }

    // Helper method
    private void display(){
        System.out.println("Payment Gateway");
    }
}

// package - private / default access modifier -- if we don't specify any access modifier 
// then it is package-private, we don't need to write "default keyword"
class CreditCardPayment implements PaymentGateway{

    public void paymentProcess(double amount){
        System.out.println("Credit card payment process.." + amount);
    }

    public boolean validatePayment(String details){
        System.out.println("Validating credit card payment..");
        return details.startsWith("CC") && details.length() == 10;
    }

    //classes can implement default methods if required
    public void printReciept(){
        System.out.println("Credit card payment reciept");
    }
}

class BankTransferPayment implements PaymentGateway{

    public void paymentProcess(double amount){
        System.out.println("Bank transfer payment process.." + amount);
    }

    public boolean validatePayment(String details){
        System.out.println("Validating bank transfer payment..");
        return details.startsWith("BANK") && details.length() == 20;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        // PaymentGateway paymentGateway = new PaymentGateway();   //Cannot instantiate the type PaymentGateway because it is an interface

        PaymentGateway.showSupportedGateways();

        PaymentGateway creditcardGateway = new CreditCardPayment();
        PaymentGateway bankTransferGateway = new BankTransferPayment();

        creditcardGateway.paymentProcess(12345);
        if(creditcardGateway.validatePayment("CC12345678")){
            System.out.println("Credit card payment is valid");
            creditcardGateway.printReciept();
            PaymentGateway.showSupportedGateways();
        } else{
            System.out.println("Credit card payment is invalid");
        }

        bankTransferGateway.paymentProcess(1000.067);
        if(bankTransferGateway.validatePayment("BANK1234569870987654")){
            System.out.println("Bank Transfer payment is valid");
            bankTransferGateway.printReciept();
            PaymentGateway.showSupportedGateways();
        } else{
            System.out.println("Bank Transfer payment is invalid");
        }
    }
}
