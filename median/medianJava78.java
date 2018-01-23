package tmpStorage.median;


//68eb0bb00bcd06020ba4e5c5afbce504f5e7af9618c274197da7d50f668649a59f3eb961a718f5f67cc8731f9f5e2df46e511d083b2b5e785e9377c8f94e6ea5_011
public class medianJava78{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int x,int y,int z){
if ((x>=y && x<=z) || (x<=y && x>=z))
return x;
else if ((y>=x && y<=z) || (y<=x && y>=z))
return y;
else
return z;
}
}
