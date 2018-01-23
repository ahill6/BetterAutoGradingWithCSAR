package tmpStorage.median;


//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_003
public class medianJava45{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
  if ((b>a && b<c) || (b<a && b>c))
    {
return b;
    }
  if ((c>a && c<b) || (c<a && c>b))
    {
return c;
    }
  if ((a>b && a<c) || (a<b && a>c))
    {
return a;
    }
return -1;
}
}
