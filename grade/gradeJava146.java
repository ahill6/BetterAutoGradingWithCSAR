package tmpStorage.grade;


//98d873cde39437ae581e6b61ce30ca54634c9c1517b46a0f2774cb12db474b5a37759281b19283c60dbcfa44ac3e05d474a896310f64e8533603b1db73457494_008
public class gradeJava146{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float student){
  if(student >= a)
     return 'A';
  else if(student >= b)
     return 'B';
  else if(student >= c)
     return 'C';
  else if(student >= d)
     return 'D';
  else if(student < d)
     return 'F';
return (char) student;
}
}
