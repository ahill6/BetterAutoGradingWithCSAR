package tmpStorage;
//88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_001
//846021256d8ee8e5398346b8c049a0489ee71209518b971ce1d11e81406bfea1bb78c99c339660ac2790d61d438ecae0ff7a35bfab07864f8e6f69ca2450013c_011
public class smallestJava95{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		int smallest=-1;
		smallest = a;
		if (a > b)
			smallest = b;
		if (b > c)
			smallest = c;
		if (c > d)
			smallest = d;
		else if (a > d)
			smallest = d;
		return smallest;
	}
}
