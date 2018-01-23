package tmpStorage.smallest;


//769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_002
public class smallestJava73{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int x,int y,int z,int t){
	int a=-1;
		if (x >= y)
		a = y;
		else
		a = x;
		if (y >= z)
		a = z;
		if (z >= t)
		a = t;
		return a;
	}
}
