package firstApp;

public class Pattern4 {

	public static void main(String[] args) {
		int n=14;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i>=n/2 && i-j>=n/2) ||(i>=n/2 && i+j>=n-1+(n)/2))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

}
