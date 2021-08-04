
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	//function to check Palindrome
	
	public void checkPalindrome(){
		int numRec, numRev=0, numTemp, reminder;
		System.out.println("Enter the number to be checked for palindrome");
		numRec= sc.nextInt();
		
		numTemp=numRec;
		
		while(numRec>0){
			reminder=numRec%10;
			numRev= (numRev*10)+reminder;
			numRec= numRec/10;
		}
		
		if (numTemp==numRev)
			System.out.println("Entered no."+numTemp+" is palindrome");
		else 
			System.out.println("Entered no."+numTemp+" is not Palindrome");
	}
			
	
	
	//function to print Pattern
	
	public void printPattern(){
		
		System.out.println("Enter the number for which triangle need to be printed");
		int n = sc.nextInt();
		for (int i=n;i>0;i--)
		{
			for (int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}
	
	// function to check no. is prime or not
	
	public void checkPrimeNumber(){
		int num,i,halfNum,counter=0;
		System.out.println("Enter number to be checked");
		num=sc.nextInt();
		halfNum=num/2;
		if(num==0||num==1){
			System.out.println(num+" is not prime number");
		}
		else{
			for(i=2;i<=halfNum;i++){
				if(num%i==0){
					System.out.println(num+" is not prime number");
					counter=1;
					break;
				}
			}
			if (counter==0){
				System.out.println(num+" is prime number");
			}
		}
		
	}
	
	//function to print FibonacciSeries
	
	public void printFibonacciSeries(){
		int n1=0,n2=1,n3,i,num;
		System.out.println("Enter number for size of fibonacci series");
		num=sc.nextInt();
		System.out.print(n1+" "+n2);
		for (i=2;i<num;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
			
	}
	
	//main method which contains switch and do while loop
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Enter your chioce from below list.\n"+
					"1.Find palindrome of number.\n" + "2.Print Pattern for given no.\n"+
"3.Check whether the no is prime number.\n"+"4.Print Fibonacci series.\n"
					+"--> Enter 0 to exit.\n");
			
			System.out.println();
			
			choice = sc.nextInt();
			
			switch(choice){
			
			case 0:
				
				choice =0;
				break;
				
			case 1:{
				 obj.checkPalindrome();
				 
			}
				break;
				
			case 2:{
				
				obj.printPattern();
			}
			
			break;
			
			case 3:{
				
				obj.checkPrimeNumber();
			}
			
			break;
			
			case 4:{
				
				obj.printFibonacciSeries();
			}
			break;
			
			
			default:
				System.out.println("Invalid choice.Enter a valid no.\n");
				
			}
			
		}while(choice!=0);
		
		System.out.println("Exited Successfully!!!");
		
		sc.close();
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			}


	


