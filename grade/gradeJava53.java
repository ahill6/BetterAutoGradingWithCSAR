package tmpStorage;
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_004
//3b2376ab97bb5d1a5dbbf2b45cf062db320757549c761936d19df05e856de894e45695014cd8063cdc22148b13fa1803b3c9e77356931d66f4fbec0efacf7829_003
public class gradeJava53{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float grade){	
	if (grade >=  A)
		 return 'A';
	else if (A > grade && grade >= B)
		 return 'B';
	else if (B > grade && grade >= C)
		 return 'C';
	else
		 return 'D';
}
}
