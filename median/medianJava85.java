package tmpStorage;
//89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_002
//6e464f2b5ba1d5ad3d4fc366e7d7712b424aabd8b41ca36257115a16416d202feb27397a413d04944c9ac76976fa8ff8ae646144855e08791ebf9593d1caaaca_004
public class medianJava85{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
if	((a>b && a<c) || (a<b && a>c))
return a;
else if ((b>a && b<c) || (b<a && b>c))
return b;
return c;
}
}
