package tmpStorage;
//5a5683598d8e2140d344e9ac96a8d6105b8e6e55831ab874cd960dfe789c3b242d57aad028e2b28331e4d61019d6e1b1d1cad97316bcb0378df48de738147b7d_000
//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_001
public class smallestJava59{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		if ((a<b)&&(a<c)&&(a<d))
			return a;
		else if ((b<a)&&(b<c)&&(b<d))
			return b;
		else if ((c<a)&&(c<b)&&(c<d))
			return c;
		else if ((d<a)&&(d<b)&&(d<c))
			return d;
		return -1;
		}
	}
