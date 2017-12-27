package tmpStorage;
//cb243bebea400595cc274d1246f3307c507ba6a0e891f6e318cde2b80a72de40dab19eb7f76d3b6573a08e446bce6fb4435cdb016ae6489973b855a9bddd3b11_000
//ca94e3756cbf8d1490bad660c06307f5d678e3675bbea85359523809a4f06b370066767ea2d2d76d270e4712b464924f12e19dbf1a12d28b75d367ceb202dbb9_005
public class gradeJava200{
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
