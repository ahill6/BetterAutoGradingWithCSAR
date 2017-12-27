package tmpStorage;
//8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_000
//88394fc00b7053b386e97564e28ef68421ae09c0baeaf887bba7e254f452419783ed8f774bff3c0c7d23bdc8f6c1443fb47c7af97323d4d3d63cc088d3b6841a_009
public class smallestJava104{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
	int e=-1;
		if (a<b && a<c && a<d)
			e=a;
		if (b<a && b<c && b<d)
			e=b;
		if (c<a && c<b && c<d)
			e=c;
		if (d<a && d<b && d<c)
			e=d;
		return e;
	}
}
