package tmpStorage;
//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_013
//0cdfa335eea3c612e6fa3ad261276b0c3ebbc6ff0ff13c20bdc249bad29a8037ca6dc887dd28558964e1e1a24f47c4cffc05adba525285dc8b93660cdf9b8b7c_003
public class gradeJava4{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
  if(score >= a)
     return 'A';		
  if(score >= b && score < a)
     return 'B';
  if(score >= c && score < b)
     return 'C';
  if(score >= d && score < c)
     return 'D';
  if(score < d)
     return 'F';
return 0;
}
}
