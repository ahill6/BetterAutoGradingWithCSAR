package tmpStorage.grade;


//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_000
public class gradeJava184{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float score){
	if (score >= a){
		 return 'A';
	}
	else if ((score >= b) && (score > a)){
		 return 'A';
	}
	else if ((score >= c) && (score < b)){
		 return 'A';
	}
	else if ( (score >= d) && (score < c)){
		 return 'A';
	}
	else if (score < d){
		 return 'F';
	}
	return (char) score;
}
}
