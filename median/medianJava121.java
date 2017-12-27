package tmpStorage;
//90a14c1ac8f56395389fade6f67872a9684e61f83099e634ac675eae04f391f3cc2b6f6ebe966f2488ce7e00a2cabb218f3b1372d4161b3c05d134b1b7f296d2_000
//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_018
public class medianJava121{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median;
    if ((b>=a && a>=c)||(c>=a && a>=b))
return a;
    else if ((a>=b && b>=c)||(a<=b && b<=c))
return b;
    else if ((a>=c && c>=b)||(a<=c && c<=b))
return c;
    else		
return -1;
}
}
