import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        int maxNum=0;
        int indexNum=0;
		for(int i=0;i<9;i++) {
			int a=sc.nextInt();
			if(a> maxNum) {
				maxNum=a;
				indexNum=i;
			}
		}
		System.out.println(maxNum);
		System.out.println(indexNum+1);
    }
}