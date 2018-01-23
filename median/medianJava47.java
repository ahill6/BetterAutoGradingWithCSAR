package tmpStorage.median;


//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_000
public class medianJava47{
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
