package tmpStorage;
//15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_001
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_008
public class medianJava17{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
        if(((a>b)&&(a<c))||((a<b)&&(a>c)))
return a;
        else if(((b>a)&&(b<c))||((b<a)&&(b>c)))
return b;
        else if(((c>a)&&(c<b))||((c<a)&&(c>b)))
return c;

return -1;
}
}
