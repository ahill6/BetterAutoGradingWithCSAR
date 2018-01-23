package tmpStorage.smallest;


//dedc2a7c919835ade6d92729cfb18fc71addf6dcdf36ce26ca8b1e3d3aea81bad974c61b96fd71537e95a6aac4582d5b08f9fd8057ce40fb18fb5df37d86b70d_000
public class smallestJava161{
	public static void main(String[] args){
	smallest((float)1.0,(float)2.0,(float)3.0,(float)4.0);
}

	public static float smallest(float a, float b, float c, float d){
		if((a < b) && (a < c) && (a < d))
			return a;
		else if ((b < a) && (b < c) && (b < d))
			return b;
		else if ((c < a) && (c < b) && (c < d))
			return c;
		else
			return d;
}
}
