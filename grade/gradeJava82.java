package tmpStorage;
//489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_011
//489253253c866aa61b6b0d95c6072d3912f6b78dfbc01bdb2fbb663aefe33d6d353b1a61bb5fc567c9d6c334994111816edd3d43db47e4ea4a84953198736ff7_010
public class gradeJava82{
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
