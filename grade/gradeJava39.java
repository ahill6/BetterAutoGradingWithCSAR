package tmpStorage;
//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_000
//30074a0e036669b5681720e6481cc101877d52ee589bab434417ece22b4133ed584c6a84f80047c10ab47aa73a7807720b5375983e8b489e8e69978e5e0e8b71_015
public class gradeJava39{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float percent){
  char grade = 0;
  if (percent >= A)
    grade='A';
  if ((percent < A) && (percent >= B))
    grade='B';
  if ((percent < B) && (percent >= C))
    grade='C';
  if ((percent < C) && (percent >= D))
    grade='D';
  if (percent < D)
    grade='F';
   return grade;		
  }
}
