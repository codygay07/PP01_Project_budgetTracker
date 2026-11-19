
public class Budget {
    private double income;
    private double spendingLimit;
    private Expense[] expenses =new Expense[100];
    private int expenseCount =0;
    
    public void setIncome(double income){
        this.income =income;
    }
    
    public double getIncome(){
        return income;
    }
    
    public void setSpendingLimit(double spendingLimit){
        this.spendingLimit =spendingLimit;
    }
    
    public double getSpendingLimit(){
        return spendingLimit;
    }
    
    public boolean add(String name,double amount,String category){
        if(expenseCount ==expenses.length){
            return false;
        }else{
            expenses[expenseCount] =new Expense(name, amount,category);
            expenseCount++;
            return true;
        }
    }
    
    public int getExpenseCount(){
        return expenseCount;
    }
    
    public Expense getExpense(int i){
        return expenses[i];
    }
    
    public double total(){
        double sum =0;
        for(int i=0; i<expenseCount;i++) {
            sum+=expenses[i].getAmount();
        }
        return sum;
    }
    
    public double balance(){
        return income - total();
    }
    
    public double categoryTotal(String category){
        double sum =0;
        for(int i=0;i<expenseCount;i++){
            if(expenses[i].getCategory().equals(category)){
                sum+=expenses[i].getAmount();
            }
        }
        return sum;
    }
}
