package tmpStorage.smallest;


//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_004
public class smallestJava118{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		int sm;
    if (a<b && a<c && a<d)
       return a;
    else if (b<a && b<c && b<d)
       return b;
    else if (c<a && c<b && c<d)
       return c;
    else if (d<a && d<b && d<c)
       return d;
    else
       return -1;
  }
}
