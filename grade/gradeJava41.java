package tmpStorage.grade;


//317aa7055d3b7337ab43b73863692d1288ca246c473f9fd176bc737a7c3e1e08c37a15603cfb7bfc86f7bc2dcc239967b79b605aec11f86ae3ab90dc140b540f_001
public class gradeJava41{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double A, double B, double C, double D, double percent){
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
