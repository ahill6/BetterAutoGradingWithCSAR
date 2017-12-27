package tmpStorage;
//dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_004
//dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_000
public class gradeJava236{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static double grade(double a, double b, double c, double d, double score){
	if(score >= a)  return 'A';
	else if(score >= b)  return 'B';
	else if(score >= c)  return 'C';
	else if(score >= d)  return 'D';
	else   return 'F';
}
}
