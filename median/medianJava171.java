package tmpStorage.median;


//aaceaf4ad658a90db957967d2852b7dfa81b42f4ab8dbdf2f7c9847a6072e1741a6b0cbd2ea52f5669f2da1cdf925ec565d257320cf93b97bc9bc99f000e1871_004
public class medianJava171{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
  if ((a>b) && (a<c))
return a;
  if ((a>c) && (a<b))
return a;


  if ((b>a) && (b<c))
return b;
  if ((b>c) && (b<a))
return b;


  if ((c>b) && (c<a))
return c;
  if ((c>a) && (c<b))
return c;
  		
return -1;
}
}
