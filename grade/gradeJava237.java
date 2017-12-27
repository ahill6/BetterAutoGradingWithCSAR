package tmpStorage;
//dccb1242e60245b164eba39e7c2ae4d7140c2c8964675ee78c7d8bea4aae494217dcac52415ab45fd89391060d17b101d87530b8e5a0b9a5781d06fe7db614eb_001
//dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_004
public class gradeJava237{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float score){
	if (score >= A) {  return 'A';		}
	else if (score < A && score >= B) {  return 'B';		}
	else if (score < C && score >= D) {  return 'D';		}
	else {  return 'F';		}
}
}
