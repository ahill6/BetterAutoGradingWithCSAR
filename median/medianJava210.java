package tmpStorage.median;


//d120480a6e4bd3c4aa2ca882cf7c0aaa499d56c9c236aba6bea7aa935843da56c1ce494b71da9e2c2fd6016b05c84164bbd70867801caf480497fa51a3b78cb1_000
public class medianJava210{
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
  if (a<c)
    median = b;
  else if (b>c)
    median = a;
  else
    median = c;
return median;
}
}
