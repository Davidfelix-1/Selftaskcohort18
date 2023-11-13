package NewBegining;

public class Account {



    private String name ;
    private int balance;



    public Account ( String name, int Balance){

    }


    public Account() {

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getBalance(){
        return balance ;
    }

    public void setBalance(int balance){
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public void setIncreaseBalance(int deposit){
        this.balance=deposit+balance;
    }

    public void deposit(int amount){
        if(amount > 0.0){
            this.balance = balance + amount;
        }
    }

    public void withdraw(int amount){
        this.balance= balance-amount;
    }

}

