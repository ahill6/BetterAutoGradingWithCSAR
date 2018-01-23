package tmpStorage.grade;


//9c9308d4cdf5bc5dfe6efc2b1a9c9bc9a44fbff73c5367c97e3be37861bbb3ba9ac7ad3ddec74dc66e34fe8f0804e46186819b4e90e8f9a59d1b82d9cf0a6218_000
public class gradeJava147{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float studentscore){
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
