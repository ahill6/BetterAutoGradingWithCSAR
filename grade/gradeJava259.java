package tmpStorage.grade;


//f5b56c79c624eac7c37c45c1540916bb9b5f5db93e2a426a282a5d0eacde86b4b1e5d1d119eeb06f0ead94d2e4f228dca8dde4ef511af4bc59a18d272d820a0e_010
public class gradeJava259{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float score){
	if(score >= A){
		return 'A';
	}
	else if(score<A && score>=B){
	 return 'B';
	}
	else if(score<B && score>=C){
	 return 'C';
	}
	else if(score<C && score>=D){
	 return 'D';
	}
	else{
	 return 'F';
	}
}
}
