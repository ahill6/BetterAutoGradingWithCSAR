package tmpStorage;
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_007
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_002
public class medianJava212{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int A,int B,int C){
int Small=-1;
int Large=-1;
int Median=-1;
	if (A==B && A==C)
		Median = A;
	else if (A>B) 	{
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
