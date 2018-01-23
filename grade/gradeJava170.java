package tmpStorage.grade;


//aaceaf4ad658a90db957967d2852b7dfa81b42f4ab8dbdf2f7c9847a6072e1741a6b0cbd2ea52f5669f2da1cdf925ec565d257320cf93b97bc9bc99f000e1871_004
public class gradeJava170{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float n,float a,float b,float c,float d){

  if (n>=a)
     return 'A';

  if ((n<a) && (n>=b))
     return 'B';

  if ((n<b) && (n>=c))
     return 'C';

  if((n<c) && (n>=d))
     return 'D';
return (char) d;



}
}
