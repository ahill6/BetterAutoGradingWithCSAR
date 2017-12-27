package tmpStorage;
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_006
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_005
public class medianJava14{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
        if(((a>b)&&(a<c))||((a<b)&&(a>c)))
return a;
        else if(((b>a)&&(b<c))||((b<a)&&(b>c)))
return b;
        else if (((c>a)&&(c<b))||((c<a)&&(c>b)))
return c;

return -1;
}
}
