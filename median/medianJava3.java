package tmpStorage;
//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_002
//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_010
public class medianJava3{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median;
	a = 0;	b = 0;	c = 0;	median = 0;	if ((a<=b && a>=c) || (a>=b && a<=c))		median = a;	else if ((b<=a && b>=c) || (b>=a && b<=c))		median = b;	else		median = c;return median;
}
}
