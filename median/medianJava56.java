package tmpStorage;
//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_000
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_016
public class medianJava56{
	public static void main(String[] args){
	median(1,2,3);
}

public static int median(int n1,int n2,int n3){
int small=-1;
if (n1 <= n2){
	small = n1;
	if (small > n3)
		return n1;
	else if (n3 > n2)
		return n2;
	else
		return n3;
}
else{
	small = n2;
	if (small > n3)
		return n2;
	else if (n3 > n1)
		return n1;
			else
					return n3;
}
}
}
