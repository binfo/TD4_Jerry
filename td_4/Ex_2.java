package td_4;
import java.util.Scanner;
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		System.out.println("Give an integer n:");
	    int n=in.nextInt();
	    int a=1;int b=1;
		if(n<3){
			System.out.println("The '"+n+"'-th number of the Fibonacci sequence is: 1");
		}else{
			int fibo;int i=3;
			do{
				fibo=a+b;
				a=b;b=fibo;
				i++;
			}while(i<=n);
			System.out.println("The '"+n+"'-th number of the Fibonacci sequence is: "+fibo);
		}
		
		
		//-------------------------------------------------
		in.close();
	}

}
