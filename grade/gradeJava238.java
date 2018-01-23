package tmpStorage.grade;


//dccb1242e60245b164eba39e7c2ae4d7140c2c8964675ee78c7d8bea4aae494217dcac52415ab45fd89391060d17b101d87530b8e5a0b9a5781d06fe7db614eb_001
public class gradeJava238{
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
