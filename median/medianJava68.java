package tmpStorage;
//593b954f9fee4dac5575c1fea4a0ff066cc0b79f3c2732f0dd9e60cacededa2145a70a481a3bfbc3d322abaf547ac4db3666b8461f7fc2e88f6d01f81b7c5f82_000
//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_001
public class medianJava68{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
if ((a<=b && b<=c) || (c <=b && b<=a))
return b;
else if ((b <=a && a <=c) || (c<=a && a <=b))
return a;
return c;
}
}
