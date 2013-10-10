package td_4;
import java.util.Scanner;
public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		System.out.println("Give an integer:");
		int n=in.nextInt();int x;String text="";
		while (n!=0){
			x=(n%10);n=n/10;
			switch (x){
			case 0: text="zero "+text;break;
			case 1: text="one "+text;break;
			case 2: text="two "+text;break;
			case 3: text="three "+text;break;
			case 4: text="four "+text;break;
			case 5: text="five "+text;break;
			case 6: text="six "+text;break;
			case 7: text="seven "+text;break;
			case 8: text="eight "+text;break;
			case 9: text="nine "+text;break;
			}
			
		}
		System.out.print(text);
		
		//-------------------------------------------------------
		in.close();
	}

}
