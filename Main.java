/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Customer details=new Customer();
		details.setName("Ragul");
        details.setAccno(12345);
        details.setBalance(1000);
        
        System.out.println(details.getName());
        System.out.println(details.getAccno());
        System.out.println(details.getBalance());
		int Total=0;
		
		System.out.println("click 1 for debit");
		System.out.println("click 2 for credit");
		System.out.println("click 3 for View Balance");
		int a=sc.nextInt();
		System.out.println("Enter amount:");
		int amt=sc.nextInt();
		if(a==1){
		    Total=details.getBalance()-amt;
            System.out.println("The Total Amount After debit: "+ Total);
		}
		else if(a==2){
		    Total=amt+details.getBalance();
		    System.out.println("The Total Amount after credit: "+ Total);
		}
		else {
		    System.out.println(details.getBalance());
		}
	}
}
// 		do{
// 		    if(a==1){
// 		        if(amt>details.getBalance()){
// 		            System.out.println("insufficient Balance");
// 		        }
// 		        else{
// 		            Total=amt-details.getBalance();
// 		        }
// 		    }
// 		    else {
// 		        Total=amt+details.getBalance();
// 		    }
// 		}while(a<3 && a!=0);