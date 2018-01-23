package tmpStorage.grade;


//ee1f20ccded21df47f14019584a29968013d1e66c8df14c1564aff0d69f463c1897e93b7881fa6318cbf475b51e0cdd7523d748525fb5d64d376b88614d3fc92_008
public class gradeJava248{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float A){
	if (A >= a){
		 return 'A';
	}
	else if (A < a && A >= b){
		 return 'B';
	}
	else if (A < b && A >= c) {
		 return 'C';
	}
	else if (A < c && A >= d) {
		 return 'D';
	}
	else
		 return 'F';
}
}
