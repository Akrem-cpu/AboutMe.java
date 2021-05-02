package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55, price1 = 20.88, price2 = 89.99 , price3 = 15;
        double remainingBalance = balance - (price1 + price2 + price3);
        System.out.println("Your initial balance: $" + balance);
        System.out.println("your remaining balance: $" + remainingBalance);

        /// printing the remaining balance with out decimal
        int balanceWithNoCent = (int) remainingBalance;
        System.out.println("your balance with no cent is $" + balanceWithNoCent);
    }
}
