package tmpStorage;
//d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000
//d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_006
public class medianJava209{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
        if ((a==b)||(a==c)){
return a;}
	if (b==c){
return b;}
	if((a<c)&&(a>b))
return a;
        else if((a<b)&&(a>c))
return a;
        if((b<a)&&(b>c))
return b;
        else if((b>a)&&(b<c))
return b;
        if((c>a)&&(c<b))
return c;
        else if((c<a)&&(c>b))
return c;
return -1;
}
}
