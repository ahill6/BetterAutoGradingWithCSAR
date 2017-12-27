package tmpStorage;
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_003
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_002
public class medianJava146{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int n1,int n2,int n3){	
	if (n1 ==  n2 || n1 == n3 || n2<n1 && n1<n3 || n3<n1 && n1<n2)
return n1;
	else if (n2 == n3 || n1<n2 && n2<n3 || n3<n2 && n2<n1)
return n2;
	else if (n1<n3 && n3<n2)
return n3;
return -1;
}
}
