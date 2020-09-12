// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Lab04;

public class SavingsAccount extends BankAccount {

    float interestRate, interestCalculated;

    // Default constructor invokes super
    public SavingsAccount() {
        super(0, 0);
    }

    public SavingsAccount(float rate, int bal) {
        super(0, bal);
        interestRate = rate;
        addInterest();
    }

    public SavingsAccount(int accNum, int bal) {
        super(accNum, bal);
    }
    
    void addInterest() {
        // Convert interestRate to decimal form
        interestRate /= 100;
        interestCalculated = (interestRate * balance);
        System.out.println("Interest calculated: " + interestCalculated);
        deposit(interestCalculated);
        System.out.println("Your balance with interest is: " + getBalance());
    }

    float getInterestRate() { return interestRate; }
    void setInterestRate(float val) { interestRate = val; }

    float getInterestCalculated() { return interestCalculated; }
    void setInterestCalculated(float val) { interestCalculated = val; }
}
