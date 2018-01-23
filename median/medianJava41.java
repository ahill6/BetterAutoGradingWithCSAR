package tmpStorage.median;


//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_015
public class medianJava41{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a, int b, int c){
if( (a>=b && a<=c) || (a<=b && a>=c)) //**/
return a;
else if( (b>=a && b<=c) || (b<=a && b>=c)) //**/
return b;
else //**/
return c;
}
}
