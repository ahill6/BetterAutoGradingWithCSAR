package tmpStorage.smallest;


//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_004
public class smallestJava50{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int n1,int n2,int n3,int n4){
	int large=-1;
		if (n1 < n2 && n1 < n3 && n1 < n4)
			return n1;
		else
			large = n1;
		if ((large == n1) && n2 < n3 && n2 < n4)
	                return n2;
		else
			large = n2;
		if ((large == n2) && (n3 < n4))
	                return n3;
		else
			return n4;
	}
}
