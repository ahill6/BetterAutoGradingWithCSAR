package tmpStorage.grade;


//d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_002
public class gradeJava227{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float Std){
	if (Std >= A) {
		 return 'A';
	}
	else if (Std >= B) {
		 return 'B';
	}
	else if (Std >= C) {
		 return 'C';
	}
	else if (Std >= D) {
		 return 'D';
	}
	else if (Std < D) {
		 return 'F';
	}
	else {
		return 'F';		
	}
}
}
