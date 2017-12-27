package tmpStorage;
//d2b889e1ac42bc85f9df5c45c10708f46784be93d69acd1415cfd4d028cb50b19f50c374a9498c8e8b909173053a100e20c279ddb06c6359a06a920ead3e8080_000
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_007
public class medianJava213{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int A,int B,int C){
int Small, Large;
int Median;

	if (A>B) 	{
		Large = A;
		Small = B;
	} else 		{
		Large = B;
		Small = A;
	}

	if (C>Large)
		Median = Large;
	else if (C<Small)
		Median = Small;
	else Median = C;
//**/
return Median;
}
}
