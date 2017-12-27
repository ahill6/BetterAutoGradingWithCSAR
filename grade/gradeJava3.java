package tmpStorage;
//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_003
//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_010
public class gradeJava3{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
  if(score >= a)
     return 'A';
  if(score >= b)
     return 'B';
  if(score >= c)
     return 'C';
  if(score >= d)
     return 'D';
  else
     return 'F';
}
}
