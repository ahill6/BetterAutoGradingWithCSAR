package tmpStorage.smallest;


//769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_011
public class smallestJava80{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		int x=-1;
		if (a>=b)
		x = b;
		else
		x = a;
		if (x>=c)
		x = c;
		if (x>=d)
		x = d;
		return x;
		}
	}
