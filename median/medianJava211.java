package tmpStorage;
//d25c714b0bf59a479cfefe89ae1a98cf00937dccbe68f02fb160f1f561c967d01a00b4b0ef23c9eb1bd2a5667b48ed78e484802b21672ab946b354ff7a6027c7_002
//d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_001
public class medianJava211{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a, int b, int c){
	int median, temp;
  median = 0;
  temp = 0;
  if (a>=b) {
    temp = b;
    b = a;
    a = temp;
  }
  if (c>b)
    median = b;
  else if (c<b && c>a)
    median = c;
  else
    median = a;
return median;
}
}
