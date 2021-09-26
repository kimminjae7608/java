package random;

public class MySolution {
	static final int MAX_SIZE =10;
	public static void main(String[] args) {
		int[] nums=new int[MAX_SIZE];		int[] isprime=new int[MAX_SIZE];		int count =0;
		while(count!=3) {
			count=0;
			for(int i=0;i<nums.length;i++) {
				double d =Math.random()*56+5;
				int n = (int)Math.round(d-0.5);
				nums[i]=n;			}
			boolean re =true;
			for(int i=0;i<nums.length;i++) {
				for (int j=2;j<=nums[i]/2;j++) {
					if(nums[i] % j ==0) {
						re=false; break;	
					}	
				}	
				if(re) {  count++; isprime[i]=1; }
				else isprime[i]=0;
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
			if(isprime[i]==1)
				System.out.println("소수");
			else System.out.println();
		}
	}
}
