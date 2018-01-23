package tmpStorage.smallest;


//e9c6206d3a4862876b0dead881ac55078f11e291f60215ab028651f06fcbee2a591a31a7727037774542df4fe051a89460d85f6067a0b9729ae86e4afe1e6e92_000
public class smallestJava162{
	public static void main(String[] args){
	smallest(1.0,2.0,3.0,4.0);
}

	public static double smallest(double a, double b, double c, double d){
		if (a < b && a < c && a < d)
			return a;
		else if (b < a && b < c && b < d)
			return b;
		else if (c < b && c < a && c < d)
			return c;
		else if (d < b && d < c && d < a)
			return d;
		return -1;
	}
}
