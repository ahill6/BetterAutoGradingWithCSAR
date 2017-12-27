package tmpStorage;
//846021256d8ee8e5398346b8c049a0489ee71209518b971ce1d11e81406bfea1bb78c99c339660ac2790d61d438ecae0ff7a35bfab07864f8e6f69ca2450013c_000
//818f8cf4e2e713753d02db9ee70a099b71f2a5a6bdc904191cf9ba68cfa5f64328464dccdd9b02fe0822e14a403dc196fe88b9964969409e60c93a776186a86a_005
public class smallestJava83{
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
