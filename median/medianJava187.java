package tmpStorage.median;


//c716ee619761838749589cbd08d5fd56830bff349039f8587e988a5b0cd6310e04844d8e0ee98c5ffee3275aa227bd2c92fcde0993637fcf3bfbd41a37378833_002
public class medianJava187{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int A,int B,int C){
	if ( A > B && A < C)
return A;
	if ( A > C && A < B)
return A;
	if ( B > C && B < A)
return B;
	if ( B > A && B < C)
return B;
	if ( C > A && C < B)
return C;
	if ( C > B && C < A)
return C;
return -1;
}
}
