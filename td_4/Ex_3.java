package td_4;
import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		System.out.println("Consecutively give positive integers; to stop type '0'.");
		int n;int sum=0;int i=0;
		do{
			n=in.nextInt();
			sum+=n;
			i++;
		}while(n!=0);
		
		if(sum==0){
			System.out.println("The average of 0 is of course 0.");
		}else{
			System.out.println("The average of your numbers is: "+(double)sum/i);
		}
		
		//----------------------------------------------
		in.close();
	}

}
