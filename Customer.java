class Customer{
    private String Name;
    private int Accno;
    private int Balance;
    
    public void setName(String name){
        this.Name=name;
    }
    public void setAccno(int accno){
        this.Accno=accno;
    }
    public void setBalance(int bal){
        this.Balance=bal;
    }
    
    public String getName(){
        return Name;
    }
    public int getAccno(){
        return Accno;
    }
    public int getBalance(){
        return Balance;
    }
    
    
}