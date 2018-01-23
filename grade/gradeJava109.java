package tmpStorage.grade;


//89b1a701f92f7e190fd4caf2ad32365f2c9261790b9a33967efd0bfb4d047c721db673225a01819900d542401a0b95d29db7ff0d8548087faabd4230f896474f_001
public class gradeJava109{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float p){
	if (p>=a)
		 return 'A';
	if (p<a && p>=b)
		 return 'B';
	if (p<b && p>=c)
		 return 'C';
	if (p<c && p>=d)
		 return 'D';
	if (p<d)
		 return 'F';
	return (char)  p;
}
}
