package tmpStorage;
//ee1f20ccded21df47f14019584a29968013d1e66c8df14c1564aff0d69f463c1897e93b7881fa6318cbf475b51e0cdd7523d748525fb5d64d376b88614d3fc92_006
//ea67b84145a12733c524b716da44f36a42cf815013d14cafbd2a66a5a4c8b5a99022c355960cd62ca71a640315747cd604afdfa9ec753d1739c686734b2798a7_003
public class smallestJava166{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
	if (a < b && a < c && a < d) {
		return a;}
	else if (b < a && b < c && b < d) {
		return b;}
	else if (c < a && c < b && c < d) {
		return c;}
	else if (d < a && d < b && d < c) {
		return d;}
	return -1;
	}
}
