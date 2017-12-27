package tmpStorage;
//489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_000
//3cf6d33ab0357953aa5826c67dc74c4aa483f16ef04c973a68d58cda6f19ea712954b24f366f880b9c18b628c6605eabc4d3e80dc4aa120fac80fe680e2e708f_013
public class gradeJava71{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float percent){

	if (percent >= A)
		 return 'A';
	else if (percent >= B)
		 return 'B';
	else if (percent >= C)
		 return 'C';
	else if (percent >= D)
		 return 'D';
	else
		 return 'F';

}
}
