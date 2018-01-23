package tmpStorage.median;


//98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_001
public class medianJava154{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int z=-1;
  if((b < a && a < c) || (c < a && a< b))
    z = a;
  else if((a < b && b< c) || (c < b && b < a))
    z = b;
  else if((a < c && c < b) || (b < c && c < a))
    z = c;
return z;
}
}
