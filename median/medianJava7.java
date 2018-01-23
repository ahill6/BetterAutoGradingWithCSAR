package tmpStorage.median;


//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_010
public class medianJava7{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a,int b,int c){
int temp;
  if(a > b)
  {
    temp = b;
    b = a;
    a = temp;
//
  }
  if(b > c)
  {
    temp = c;
    c = b;
    b = temp;
//
  }
  if(a > b)
  {
    temp = b;
    b = a;
    a = temp;
//
  }
return b;
}
}
