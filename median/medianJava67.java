package tmpStorage;
//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_001
//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_000
public class medianJava67{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
if ((a<=b && b<=c) || (c <=b && b<=a))
return b;
if ((b <=a && a <=c) || (c<=a && a <=b))
return a;
return c;
}
}
