package tmpStorage.smallest;


//d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_001
public class smallestJava156{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
	if((a<b)&&(a<c)&&(a<d))
	  return a;
	else if((b<a)&&(b<c)&&(b<d))
		return b;
	else if((c<a)&&(c<b)&&(c<d))
		return c;
	else if((d<a)&&(d<b)&&(d<c))
		return d;
	return -1;
}
}
