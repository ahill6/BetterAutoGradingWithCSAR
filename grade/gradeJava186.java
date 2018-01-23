package tmpStorage.grade;


//b1924d63a2e25b7c8d9a794093c4ae97fdceec9e0ea46b6a4b02d9a18b9ba9cecf07cb0c42c264a0947aec22b0bacff788a547a8250c2265f601581ab545bf82_002
public class gradeJava186{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double a, double b, double c, double d, double score){
	if (score >= a){
		 return 'A';
	}
	else if ((score >= b) && (score > a)){
		 return 'B';
	}
	else if ((score >= c) && (score < b)){
		 return 'C';
	}
	else if ( (score >= d) && (score < c)){
		 return 'D';
	}
	else if (score < d){
		 return 'F';
	}
	return (char) score;
}
}
