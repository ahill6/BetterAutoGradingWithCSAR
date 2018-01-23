package tmpStorage.median;


//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_000
public class medianJava1{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median=-1;
	if ((a<=b && a>=c) || (a>=b && a<=c))		median = a;	else if ((b<=a && b>=c) || (b>=a && b<=c))		median = b;	else if ((c<=b && a>=c) || (c>=b && a<=c))		median = c;return median;		
}
}
