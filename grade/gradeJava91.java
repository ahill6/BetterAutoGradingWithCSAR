package tmpStorage.grade;


//5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002
public class gradeJava91{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float grade){
	if (grade>=a)
		 return 'A';
	else if (grade>=b)
                 return 'B';
	else if (grade>=c)
                 return 'C';
	else if (grade>=d)
                 return 'D';
	else
		 return 'F';
}
}
