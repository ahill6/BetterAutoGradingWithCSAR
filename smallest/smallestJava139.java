package tmpStorage;
//af81ffd4bc47e4f84cbf87051d82d15af14833eaba6c57ae82fc503a67eb939f3e6552182124605c38a77a6774f41fac2cc95082320ba5e29d303277c098c4ae_000
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_006
public class smallestJava139{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static double smallest(int a, int b, int c, int d){
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