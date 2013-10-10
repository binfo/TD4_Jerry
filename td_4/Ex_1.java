package td_4;
import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		System.out.println("Give an integer n:");
		int n=in.nextInt();
		
		System.out.println("Use 'while' - type '1'; use 'do..while' - type '2'; use 'for' - type '3'.");
		int type=in.nextInt();
		
		int sum=0;
		if(type==1){
			int count=1;
			while(count<=n){
				sum+=count;
				count++;
			}
		}else{
			if(type==2){
				int count=0;
				do{
					sum+=count;
					count++;
				}while(count<=n);
			}else{
				for(int count=1;count<=n;count++){
					sum+=count;
				}
			}
		}
		
		System.out.println("The sum of integers from 1 to "+n+" is: "+sum);
		//------------------------------------------------------------------------
		in.close();
	}

}
