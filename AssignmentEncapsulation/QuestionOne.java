package AssignmentEncapsulation;
class BankSystem{
    private int accountnumber;
    private String name, address;
    private double amount;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void debit(double rupee){
        amount-=rupee;
    }
    public void credit(double rupee){
        amount+=rupee;
    }

    @Override
    public String toString() {
        return "BankSystem{" +
                "accountnumber=" + accountnumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                '}';
    }
}
public class QuestionOne {
    public static void main(String args[]){
        BankSystem bankSystem=new BankSystem();
        bankSystem.setAccountnumber(453278);
        bankSystem.setName("Yash");
        bankSystem.setAddress("Agra");
        bankSystem.setAmount(450.80);
        System.out.println(bankSystem);
        System.out.println("Account balance is "+bankSystem.getAmount());
        bankSystem.debit(67.76);
        System.out.println("Debited Account balance is "+bankSystem.getAmount());
        bankSystem.credit(148.76);
        System.out.println("Credited Account balance is "+bankSystem.getAmount());
        System.out.println(bankSystem);
    }
}
