package tmpStorage;
//b6fd408d589fd1cce4003e2cf601a028e3c01042c8a274ddc384a1524cab2014154932e9cb48312af6af394ee6bee85603cab8dad3c9617a49b9d14dc482b578_000
//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_004
public class gradeJava188{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double a, double b, double c, double d, double score){
	char grade;
	if(score>=a)		
	grade='A';
	else if(score>=b)
	grade='B';
	else if(score>=c)
	grade='C';
	else if(score>=d)
	grade='D';
	else grade='F';
	 return grade;
}
}
