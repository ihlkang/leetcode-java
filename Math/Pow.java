package Math;

/*
 * 50.Ã‚ 
 * Pow(x, n)
 */
public class Pow {
	
	public double myPow(double x, int n) {
		if(n==0)
			return 1;
		long N=Math.abs((long)n);
		if(N<0){
			N=-n;
			x=1/x;
		}
		return (N%2==0)?Math.pow(x*x,N/2):x*Math.pow(x*x,N/2);
	}

	public static void main(String[] args) {
		
	}

}
