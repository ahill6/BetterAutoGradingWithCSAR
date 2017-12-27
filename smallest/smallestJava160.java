package tmpStorage;
//dedc2a7c919835ade6d92729cfb18fc71addf6dcdf36ce26ca8b1e3d3aea81bad974c61b96fd71537e95a6aac4582d5b08f9fd8057ce40fb18fb5df37d86b70d_000
//d9e7eab5f82342d78fb20833701c4e9f900e8fcb737038d3a2ad18f664532af4d6332b7d14841c9ac773c52f6590b754f76df1f430a35bc8ca4799a767cdec6d_014
public class smallestJava160{
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
