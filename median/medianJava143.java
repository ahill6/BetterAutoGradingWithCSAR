package tmpStorage;
//95362737dcd262ddd67b0fe1381c25f1e6b885860b4e51efb6f57223dceb77b4c6c7d855e3fe891c10cd51b48c9b052cf2c74f181a28d3020d77a4a2d6e4db18_000
//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_016
public class medianJava143{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int int1,int int2,int int3){
	if (((int1 <= int2) && (int1 >= int3)) || ((int1 <= int2) && (int1 >= int3)))
return int1;
	else if ((((int2 <= int1)) && (int2 >= int3)) || ((int2 <= int3) && (int2 >= int1)))
return int2;
	else if (((int3 <= int1) && (int3 >= int2)) || ((int3 <= int2) && (int3 >= int1)))
return int3;		                                        
return -1;
}
}
