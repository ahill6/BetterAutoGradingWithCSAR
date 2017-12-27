package tmpStorage;
//ea67b84145a12733c524b716da44f36a42cf815013d14cafbd2a66a5a4c8b5a99022c355960cd62ca71a640315747cd604afdfa9ec753d1739c686734b2798a7_000
//e9c6206d3a4862876b0dead881ac55078f11e291f60215ab028651f06fcbee2a591a31a7727037774542df4fe051a89460d85f6067a0b9729ae86e4afe1e6e92_000
public class smallestJava162{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		int SN;
		if ((a<b) && (a<c) && (a<d))
			SN=a;
		else if ((b<a) && (b<c) && (b<d))
			SN=b;
		else if ((c<a) && (c<b) && (c<d))
			SN=c;
		else
			SN=d;
		return SN;
	}
}
