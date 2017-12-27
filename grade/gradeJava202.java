package tmpStorage;
//cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_002
//cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_001
public class gradeJava202{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float score,float A,float B,float C,float D){
	if (score >= A){
		 return 'A';
	}
	else if (score < A && score >= B){
		 return 'B';
	}
	else if (score < B && score >= C){
		 return 'C';
	}
	else if (score < C && score >= D){
		 return 'D';
	}
	else
	{
		 return 'F';
	}
}
}
