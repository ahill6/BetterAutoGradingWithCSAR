package tmpStorage.smallest;


//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_000
public class smallestJava58{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		int r=-1;	
		if(a<b && a<c && a<d)
		r=a;
		else if(b<a && b<c && b<d)
		r=b;
		else if(c<a && c<b && c<d)
		r=c;
		else
		r=d;
		return r;
		}
	}
