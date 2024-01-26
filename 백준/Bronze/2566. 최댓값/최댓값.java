import java.util.Scanner;
 
public class Main {
    
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int[][] Barray = new int [9][9];

		for(int i=0; i<Barray.length;i++) {
			for(int j=0; j<Barray[i].length; j++) {
				Barray[i][j] = sc.nextInt(); 
			}
		}
		
		// 처리		
		int max=Barray[0][0];
		int row = 0;
	    int col = 0;
		
		for(int i=0;i<Barray.length;i++) {
			for(int j=0; j<Barray[i].length; j++) {
				if(Barray[i][j]>max) {
					max=Barray[i][j];
					row = i;
				    col = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row+1+" "+(col+1));
		
	}
}