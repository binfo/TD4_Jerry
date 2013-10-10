package td_4;

public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>=0;i--){
			if(20*i==100){
				System.out.println(i+"*20c");
			}else{
				for(int j=10;j>=0;j--){
					if(20*i+10*j==100){
						System.out.println(i+"*20c+"+j+"*10c");
					}else{
						for(int k=20;k>=0;k--){
							if(20*i+10*j+5*k==100){
								System.out.println(i+"*20c+"+j+"*10c"+k+"*5c");
							}
						}
					}
				}
			}
		}
		
		
		//---------------------------------------------------------
	}

}
