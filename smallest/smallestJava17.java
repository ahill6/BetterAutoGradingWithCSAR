package tmpStorage;
//2694af73c71cb375afbf48eafad870d9f8d0e2962411c4d96ab2f0b6c31ffdd3a5b84f8ed59c08a809df688abffcb5ab9fb88e7b1df1970eadb6e8fa0ac34309_000
//1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_006
public class smallestJava17{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int a,int b,int c,int d){
		if (a < b && a < c && a < d)			return a;		else		if (b < a && b < c && b < d)			return b;		else		if (c < a && c < b && c < d)			return c;		else		if (d < a && d < b && d < c)			return d;
		return -1;
}
}
