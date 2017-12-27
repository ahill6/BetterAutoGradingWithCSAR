package tmpStorage;
//aaceaf4ad658a90db957967d2852b7dfa81b42f4ab8dbdf2f7c9847a6072e1741a6b0cbd2ea52f5669f2da1cdf925ec565d257320cf93b97bc9bc99f000e1871_000
//a0e3fdae706d528dcf146cbad986ba9fd834440a7b500e32f04fad073e955a46e481c713ee118432f3fd5dfa1a63fc1caefd648a56a389e40e6362dfd51625b0_012
public class gradeJava165{
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
  

  return 'F';
}
}
