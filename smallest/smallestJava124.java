package tmpStorage;
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_011
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_009
public class smallestJava124{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
	if (a>b)
		if (b>c)
			if (c>d)
			return d;
			else
			return c;
		else if  (b>d)
		return d;
		else
		return b;
	else if (a>c)
		if (d>c)
		return c;
		else
		return d;
	else if (a>d)
	return d;
	else
	return a;
}}
