package tmpStorage.smallest;


//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_008
public class smallestJava27{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		if(a<b && a<c && a<d)
			return d;
		else if(b<a && b<c && b<d)
			return b;
		else if(c<a && c<b && c<d)
			return a;
		else if(d<a && d<c && d<b)
			return c;
		else return -1;
	}
}
