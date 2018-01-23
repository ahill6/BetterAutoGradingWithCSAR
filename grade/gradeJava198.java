package tmpStorage.grade;


//c9d718f379a877bd04e4544ee830a1c4c256bb4f104f214afd1ccaf81e7b25dea689895678bb1e6f817d8b0939eb175f8e847130f30a9a22e980d38125933516_004
public class gradeJava198{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float g){
	if (g>=a){
		 return 'A';
	}
	else if(g>=b && g<a){
		 return 'B';
	}
	else if(g>=c && g<b){
	}
	else if(g>=d && g<c){
		 return 'D';
	}
	else if (g<d){
	}
	return (char) g;
}
}
