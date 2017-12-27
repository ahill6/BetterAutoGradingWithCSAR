package tmpStorage;
//8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_008
//8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_007
public class smallestJava112{
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
