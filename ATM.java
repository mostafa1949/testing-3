package ATM.src;

public class ATM {
 public float balance;
 public boolean validCard;
 public boolean validPassword;

 	public ATM(int b, boolean c, boolean p){
	 balance=b;
	 validCard=c;
	 validPassword=p;
 	}
    public boolean enterCard(){
        if(validCard){
          return true;
        }
        else{
            return false;
        }
    }

    public boolean enterPassword(){
        if(validCard){
            if(validPassword){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public boolean deposit(float amount){
            if(amount >= 50 && amount <=50000){
                balance += amount;
                return true;
            }
            else{
                return false;
            }

    }
    public boolean withdraw(float amount){
            if(amount <= balance){
                balance -= amount;
                return true;
            }
            else{
                return false;
            }

    }

}
