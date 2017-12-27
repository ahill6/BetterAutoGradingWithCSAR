package tmpStorage;
//8c7dfbb2b3654d4ab39c56f7a0093e1013b35b5c8444f9715d08561bd4abeec2f95cdf5118b993aada0ca3c50b4f8692c4b8ddeeb2d8b2ad1cd7b4a046941b16_000
//89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_011
public class medianJava94{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int m=-1;
	if ( a==b || a==c)
		m = a;
	else if ( b==c || b==a )
		m = b;
	else if ( c==a || c==b )
		m = c;
	else {
		if ((a>b && a<c) || (a>c && a<b))
			m =a;
		else if ((b>a && b<c) || (b>c && b<a))
			m = b;
		else if ((c>a && c<b) || (c>b && c<a))
			m = c;
	}
return m;
}
}
