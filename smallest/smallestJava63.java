package tmpStorage;
//68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_000
//5a5683598d8e2140d344e9ac96a8d6105b8e6e55831ab874cd960dfe789c3b242d57aad028e2b28331e4d61019d6e1b1d1cad97316bcb0378df48de738147b7d_004
public class smallestJava63{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		if 	(a<b && a<c && a<d)
			return a;
		else if (b<a && b<c && b<d)
			return b;
		else if (c<a && c<b && c<d)
			return c;
		else
			return d;
		}
	}
