public class Customer {

    private String name;
    private int wallet;

    public Customer(int wallet, String customerName){
        this.wallet = wallet;
        this.name = customerName;
    }

    public int getWallet(){
        return wallet;
    }

    public void setWallet(){
        this.wallet = wallet;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }





}
