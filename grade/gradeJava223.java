package tmpStorage.grade;


//d009aa71ece41454c68d8038b5462d8eea8feb291bce1d53ee149f8477b5eab62ee28c7f690bf14dc6ce1d70c8943f7f3b3e4300965cb24da4cd2d2807dab19a_005
public class gradeJava223{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float score){
	if(score>=A)
	   return 'A';
	else if(score>=B)
	   return 'B';
	else if(score>=C)
	   return 'C';
	else if(score>=D)
	   return 'D';
	else if(score<D)
	   return 'F';
	return (char) score;
}
}
