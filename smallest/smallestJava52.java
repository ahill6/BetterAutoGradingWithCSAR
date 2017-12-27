package tmpStorage;
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_008
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_007
public class smallestJava52{
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
