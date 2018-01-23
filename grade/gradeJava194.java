package tmpStorage.grade;


//c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_000
public class gradeJava194{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float per1,float per2,float per3,float per4, float grade){
	if (grade>=per1)
		 return 'A';
	else if(grade>=per2)
		 return 'B';
	else if(grade>=per3)
			return 'C';
	else if(grade>=per4)
		 return 'D';
	return (char) grade;
}
}
