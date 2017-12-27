package tmpStorage;
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_001
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_000
public class smallestJava140{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static double smallest(double a, double b, double c, double d){
		//**/
		double m = -1;
		double n = -1;
		double p = -1;

		if (a > b)
		m=b;
		else if (a < b)
		m=a;
		if (m > c)
		n=c;
		else if (m < c)
		n=m;
		if (n > d)
		p=d;
		else if (n < d)
		p=n;
		return p;
		}
	}
