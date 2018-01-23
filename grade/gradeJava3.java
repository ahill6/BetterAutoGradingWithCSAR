package tmpStorage.grade;


//070455301c2e18c7c89b850c2e86c311ac5fd223c84e723591012e163d60f11f5fd030343a444049a44940f8607d36c463f30556bf1efa98916d7417c2b4393c_010
public class gradeJava3{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){

	if (score >= a)
		 return 'A';
	else if ((score >= b) && (score < a))
		 return 'B';
	else if ((score >= c) && (score < b))
		 return 'C';
	else if ((score >= d) && (score < c))
		 return 'D';
	else  return 'F';


}


}
