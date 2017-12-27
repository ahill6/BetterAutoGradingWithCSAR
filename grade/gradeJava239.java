package tmpStorage;
//e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_001
//e23b96b6bab26bd14316cefafcbaa16dd8eafcfb97a7159a7772f3c8bb3e78fb353dea728f6b4df6528286af5f0b85fd134c79886c9c2a352fe80d8204c69111_000
public class gradeJava239{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float percent){
	if (percent > a)
		 return 'A';
	else if (percent <= a && percent >= b)
		 return 'B';
	else if (percent <= b && percent >= c)
		 return 'C';
	else if (percent <= c && percent >= d)
		 return 'D';
	else if (percent <d)
		 return 'F';
	return 0;
}
}
