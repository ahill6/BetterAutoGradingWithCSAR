package tmpStorage.grade;


//387be36eafae90e7b26450a56b535f6779e881ed8916bbab08bceeb78d8ea474757d46977e2943e6b07dfe150757f53679b911e113ef68a13cd1e75b3daf18d7_000
public class gradeJava48{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float grade){

	if(grade<D){
	 return 'F';}
	else if(grade<C){
	 return 'D';}
	else if(grade<B){
	 return 'C';}
	else if(grade<A){
	 return 'B';}
	else if(grade>=A){
	 return 'A';}
	return (char) grade;
}
}
