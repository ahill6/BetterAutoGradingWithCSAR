package tmpStorage;
//e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_000
//dccb1242e60245b164eba39e7c2ae4d7140c2c8964675ee78c7d8bea4aae494217dcac52415ab45fd89391060d17b101d87530b8e5a0b9a5781d06fe7db614eb_001
public class gradeJava238{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
	if (score > a)
		 return 'A';
	else if (score <= a && score >= b)
		 return 'B';
	else if (score <= b && score >= c)
		 return 'C';
	else if (score <= c && score >= d)
		 return 'D';
	else  return 'F';
}
}
