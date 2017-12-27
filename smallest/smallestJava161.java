package tmpStorage;
//e9c6206d3a4862876b0dead881ac55078f11e291f60215ab028651f06fcbee2a591a31a7727037774542df4fe051a89460d85f6067a0b9729ae86e4afe1e6e92_000
//dedc2a7c919835ade6d92729cfb18fc71addf6dcdf36ce26ca8b1e3d3aea81bad974c61b96fd71537e95a6aac4582d5b08f9fd8057ce40fb18fb5df37d86b70d_000
public class smallestJava161{
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
