package tmpStorage;
//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_010
//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_009
public class medianJava114{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median;
    if ((b>=a && a>=c)||(c<=a && a<=b))
return a;
    else if ((a>=b && b>=c)||(a<=b && b<=c))
return b;
    else if ((a>=c && c>=b)||(a<=c && c<=b))
return c;
    else		
return -1;
}
}
