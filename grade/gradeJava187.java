package tmpStorage;
//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_004
//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_003
public class gradeJava187{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float Grade){
if(Grade >= D){
	if(Grade >= C){
		if(Grade >= B){
			if(Grade >= A){
				 return 'A';
			}
			else{
				 return 'B';
			}
		}
		else{
			 return 'C';
		}
	}
	else{
		 return 'D';
	}
}
else{
	 return 'F';
}
}
}