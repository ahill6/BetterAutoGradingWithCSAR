package tmpStorage;
//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_003
//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_002
public class gradeJava60{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(double A, double B, double C, double D, double score){	
	if (score >= A) {
		 return 'A';
		}
	else if (score >= B) {
		 return 'B';
		}
	else if (score >= C) {
		 return 'C';
		}
	else if (score < D) {
		 return 'F';
		}
	return 0;
}
}