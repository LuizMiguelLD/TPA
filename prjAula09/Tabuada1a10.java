package prjListaPara;

public class Tabuada1a10 {

	public static void main(String[] args) {
		int i, n;
		
		for(i=1;i<=10;i++) {
			n=1;
			while(n<=10) {
				System.out.println(i+"x"+n+"="+n*i);
				n++;
			}
		}
	}

}
