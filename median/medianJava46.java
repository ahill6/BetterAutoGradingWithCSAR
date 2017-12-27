package tmpStorage;
//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_000
//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_007
public class medianJava46{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
  if ((b>=a && b<=c) || (b<=a && b>=c))
return b;

  else if ((c>=a && c<=b) || (c<=a && c>=b))
return c;

  else if ((a>=b && a<=c) || (a<=b && a>=c))
return a;

return -1;
}
}
