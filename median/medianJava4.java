package tmpStorage.median;


//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_002
public class medianJava4{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int median=-1;
  if((a >= b && a <= c) || (a >= c && a <= b))
    median = a;
  if((b >= a && b <= c) || (b >= c && b <= a))
    median = b;
  else
    median = c;
return median;
}
}
