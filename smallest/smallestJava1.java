package tmpStorage;
//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_001
//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_000
public class smallestJava1{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
int smallest=-1;

	if (a < b && a < c && a < d)
			smallest = a;
	if (b < a && b < c && b < d)
			smallest = b;
	if (c < b && c < a && c < d)
			smallest = c;
	if (d < b && d < c && d < a)
			smallest = d;
	return smallest;
}}
