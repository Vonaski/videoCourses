package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    double popolneniye(double plus){
        balance += plus;
        return balance;
    }

    double snyatie(double minus){
        balance -= minus;
        return balance;
    }

    void info(){
        System.out.println("ID: " + id + " Name: " + name + " Balance: " + balance);
    }

}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Vonaski";
        myAccount.balance = 12.35;

        yourAccount.id = 2;
        yourAccount.name = "Mike";
        yourAccount.balance = 2.00;

        hisAccount.id = 3;
        hisAccount.name = "Ivan";
        hisAccount.balance = 124.12;

        myAccount.info();
        myAccount.popolneniye(12);
        myAccount.info();
        myAccount.snyatie(24.35);
        myAccount.info();

    }
}