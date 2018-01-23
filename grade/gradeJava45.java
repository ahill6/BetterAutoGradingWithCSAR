package tmpStorage.grade;


//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_007
public class gradeJava45{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float percent){
  char grade = 0;


  if (percent >= A)
    grade='A';
  else if ((percent < A) && (percent >= B))
    grade='B';
  else if ((percent < B) && (percent >= C))
    grade='C';
  else if ((percent < C) && (percent >= D))
    grade='D';
  else if (percent < D)
     return 'F';
  if (percent >= D)
    return grade;
return grade;		
  }
}
