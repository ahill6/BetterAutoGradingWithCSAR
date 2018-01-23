package tmpStorage.smallest;


//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_002
public class smallestJava42{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		int e=-1;
	  if (a<b && a<c && a<d)
	    e=a;
	  else if (b<a && b<c && b<d)
	    e=b;
	  else if (c<a && c<b && c<d)
	    e=c;
	  else
	    e=d;
	  return e;
	}
}
