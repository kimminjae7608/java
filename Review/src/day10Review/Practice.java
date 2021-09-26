package day10Review;

public class Practice {

	public static void main(String[] args) {
		
		int [] num = new int[20];
		int [] select = new int[7];
		
		for(int i =0 ; i<num.length;i++) {
			double r = Math.random()*88+11;
			num[i]= (int)Math.round(r-0.5);
			
		}
		
		for(int a : num)
			System.out.print(a+" ");
		
		for(int i=0; i<num.length; i++) {
			boolean bl=true;
			int nb=0;
			
			for(int j=2; j<=num[i]/2;j++)
				if(num[i]%j==0) {
					bl=false;
					break;
				}
			if(bl) {
				select[nb]=num[i];
				nb++;
			}
		}
		
		for (int i=0;i<select.length;i++)
			System.out.println(select[i]);
		
	}

}
