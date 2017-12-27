package tmpStorage;
//9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_000
//98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_008
public class medianJava155{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
  int z=-1;
  if((b < a && a < c) || (c < a && a< b) || a == b)
    z = a;
  else if((a < b && b< c) || (c < b && b < a) || b == c)
    z = b;
  else if((a < c && c < b) || (b < c && c < a) || a == c)
    z = c;

return z;
}
}
