package tmpStorage;
//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_000
//2694af73c71cb375afbf48eafad870d9f8d0e2962411c4d96ab2f0b6c31ffdd3a5b84f8ed59c08a809df688abffcb5ab9fb88e7b1df1970eadb6e8fa0ac34309_000
public class smallestJava18{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		if(a<b && a<c && a<d)
			return d;
		else if(b<a && b<c && b<d)
			return c;
		else if(c<a && c<b && c<d)
			return b;
		else if(d<a && d<c && d<b)
			return a;
		else return -1;
	}
}
