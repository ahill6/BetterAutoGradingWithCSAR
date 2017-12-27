package tmpStorage;
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_000
//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_013
public class medianJava8{
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
