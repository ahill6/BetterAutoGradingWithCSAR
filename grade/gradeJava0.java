package tmpStorage.grade;


//instructorSolution_000
public class gradeJava0{
	public static void main(String[] args){
	grade(1.0,2.0,3.0,4.0,5.0);
}

	public static char grade(double aval, double bval, double cval, double dval, double score){
  if(score >= aval)
     return 'A';
  else if (score >= bval)
     return 'B';
  else if (score >= cval)
     return 'C';
  else if (score >= dval)
     return 'D';
  else  return 'F';
}
}
