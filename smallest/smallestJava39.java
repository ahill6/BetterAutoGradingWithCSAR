package tmpStorage;
//36d8008b13f6475ca8fa4553fea10042b0a6c623665065672051445c3464d61b29b47cb66321844a0264505a0f5ccf5aa6de072aa266b5a8b0cf13198380a389_000
//346b1d3c1cdc3032d07222a8a5e0027a2abf95bb1697b9d367d7cca7db1af769d8298e232c56471a122f05e87e79f4bd965855c9c0f8b173ebc0ef5d0abebc7b_015
public class smallestJava39{
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
