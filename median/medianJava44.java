package tmpStorage;
//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_003
//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_002
public class medianJava44{
	public static void main(String[] args){
	median(1,2,3);
}

	public static int median(int a, int b, int c){
  int temp1,temp2;
  temp1=a;
  temp2=b;
  if (a>c)
    {
    a=b;
    b=temp1;
    }
  if (b>c)
    {
    b=c;
    c=temp2;
    }


  if (a>b)
    {
    a=b;
    b=temp1;
    }
return b;		
}
}
