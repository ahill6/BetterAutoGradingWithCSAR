package tmpStorage;
//8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_001
//8ce6345ea4e815b04769b3920f04becec20cf8051565f087aa5e03c5fdca4752a56cbec48207b74f69db55f0e9e0c3c28809cc228c8d6637a7a9c732977640b9_000
public class gradeJava115{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float student_score,float a,float b,float c,float d){
  char grade;
  if(student_score >= a)
    grade = 'A';
  else
    if(student_score >= b)
      grade = 'B';
    else
      if (student_score >= c)
	grade = 'C';
      else
	grade = 'D';

   return grade;
}
}
