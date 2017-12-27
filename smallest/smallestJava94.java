package tmpStorage;
//846021256d8ee8e5398346b8c049a0489ee71209518b971ce1d11e81406bfea1bb78c99c339660ac2790d61d438ecae0ff7a35bfab07864f8e6f69ca2450013c_011
//846021256d8ee8e5398346b8c049a0489ee71209518b971ce1d11e81406bfea1bb78c99c339660ac2790d61d438ecae0ff7a35bfab07864f8e6f69ca2450013c_010
public class smallestJava94{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		if((a < b) && (a < c) && (a < d))
			return a;
		else if((b < a) && (b < c) && (b < d))
			return b;
		else if((c < b) && (c < a) && (c < d))
			return c;
		else if((d < b) && (d < c) && (d < a))
			return d;
		return -1;
		}
	}
