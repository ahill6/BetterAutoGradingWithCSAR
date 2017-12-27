package tmpStorage;
//1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_003
//15cb07a72bc49f3f4b4a1000410c388b4d03b9f36236365ba4b611ca0617243b6de4e2e0868abf9ccb667e5ff71ccd3ce631cd59fcf13ee22addabf66c1824fa_007
public class smallestJava13{
	public static void main(String[] args){
	smallest(1,2,3,4);
}

	public static int smallest(int A,int B,int C,int D){
		if ( A < B && A < C && A < D)
			{ return A;}
		else if ( B < A && B < C && B < D)
			{ return B;}
		else if ( C < A && C < B && C < D)
			{ return C;}
		else if ( D < A && D < B && D < C )
			{ return D;}
	return -1;
	}
}