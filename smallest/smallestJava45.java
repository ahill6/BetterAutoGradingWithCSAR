package tmpStorage;
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_000
//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_005
public class smallestJava45{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int n1,int n2,int n3,int n4){	
		if (n1 < n2 && n1 < n3 && n1 < n4)
			return n1;
		else if (n2 < n1 && n2 < n3 && n2 < n4)
	                return n2;
		else if (n3 < n1 && n3 < n2 && n3 < n4)
	                return n3;
		else
			return n4;
	}
}
