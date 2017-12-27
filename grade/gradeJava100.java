package tmpStorage;
//769cd811312cbbb82c87033a78ac9584ad282550bcb9cc3ae8c4e3da44c288c1a5b3954e01998c3c0654ee6774ceab66e9fe5b135750905c917d2b0bb5fab98b_000
//75c98d3d90ca9a022bbf45421aa04a07f37da8a126811259bc4873e9458baab0a4863fa6664e5735c60172b34a16ed5acef892635f4f16e6d5737fb3685d0356_009
public class gradeJava100{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float S){
	if (S >= A)
	 return 'A';
	if (S >= B && S < A)
	 return 'B';
	if (S >= C && S < B)
	 return 'C';
	if (S >= D && S < C)
	 return 'D';
	if (S < D)
	 return 'F';
	return 0;
}
}
