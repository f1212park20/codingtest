import java.util.Scanner;

public class Main {
	public static void main(String args[])  {

		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
		
		int res = 0;
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			
			
			if(m==1) {
				res+=0;
				continue;
			}
			
			int x=0;
			for(int j=2;j<m;j++) {
				if(m % j==0) {
					x++;
				}
			}
			
			if(x==0) {
				res++;
			}
			
			
		}
		System.out.println(res);
			
	}
}