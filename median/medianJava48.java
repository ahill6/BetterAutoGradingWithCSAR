package tmpStorage;
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_000
//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_001
public class medianJava48{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int d;
  if (a<b && a>c || a>b && a<c)
    d=a;
  else if (b>a && b<c ||  b<a && b>c)
    d=b;
  else
    d=c;
return d;
}
}
