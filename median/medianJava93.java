package tmpStorage.median;


//89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_010
public class medianJava93{
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
		if ((a>=b && a<=c) || (a>=c && a<=b))
			m = b;
		else if ((b>=a && b<=c) || (b>=c && b<=a))
			m = b;
		else if ((c>=a && c<=b) || (c>=b && c<=a))
			m = c;
	}
return m;
}
}
