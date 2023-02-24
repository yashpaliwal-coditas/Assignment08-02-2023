package exceptionassignment.exceptionone;
class InvalidAmountException extends Exception  {
    public InvalidAmountException(String s){
        System.out.println("Enter valid amount"+s);
    }
}
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String s) {
        System.out.println("Insufficient balance"+s);
    }
}
class Conditions {
    public void checkAmount(int amount, int balance) {
        try {
            if (amount <= 0) {
                try {
                    throw new InvalidAmountException("You have entered wrong amount");
                } catch (InvalidAmountException e) {
                    //e.printStackTrace();
                    System.out.println();
                }
            } else if (amount > balance) {
                try {
                    throw new InsufficientBalanceException("insufficient balance");
                } catch (InsufficientBalanceException e) {
                    // e.printStackTrace();
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println();
            //e.printStackTrace();
        }
        System.out.println("");
    }
}
public class BankExceptionsHandeling {
    public static void main(String[] args) {
        Conditions conditions=new Conditions();
        conditions.checkAmount(0,666);
    }
}
