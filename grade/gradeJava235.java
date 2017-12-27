package tmpStorage;
//dc11fbc9421c547961bfefcdc4044715a7131ceb484b10c8391745399298fcce81022dbb780a9efcac004486b7d989ef4bf0dfb5a4db7c599a8f9aa3393570ae_000
//d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_006
public class gradeJava235{
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
