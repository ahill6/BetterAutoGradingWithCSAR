package tmpStorage;
//8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_005
//8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_004
public class medianJava99{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int d=-1;
	if ((a<b && b<c) || (c<b && b<a))
		d=b;
	if ((c<a && a<b) || (b<a && a<c))
		d=a;
	if ((b<c && c<a) || (a<c && c<b))
		d=c;
return d;
}
}
