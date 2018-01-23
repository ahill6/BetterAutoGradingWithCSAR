package tmpStorage.grade;


//9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_003
public class gradeJava150{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double A, double B, double C, double D, double studentscore){
char lettergrade;
if(studentscore>=A)
lettergrade='A';
else if(studentscore>=B)
lettergrade='B';
else if(studentscore>=C)
lettergrade='C';
else
lettergrade='D';
 return lettergrade;
}
}
