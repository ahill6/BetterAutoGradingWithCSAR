package tmpStorage.grade;


//93f87bf20be12abd3b52e14015efb6d78b6038d2022e0ab5889979f9c6b6c8c757d6b5a59feae9f8415158057992ae837da76609dc156ea76b5cca7a43a4678b_014
public class gradeJava127{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D, float score){
	if ((score >= (A)))
	 return 'A';
	else if ((score >= (B)) && (score < (A)))
	 return 'B';
	else if ((score >= (C)) && (score < (B)))
         return 'C';
	else if ((score >= (D)) && (score < (C)))
         return 'D';
	else if((score < (D)))
         return 'F';
	return (char) score;
}
}
