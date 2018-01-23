package tmpStorage.grade;


//d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_001
public class gradeJava234{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double A, double B, double C, double D, double score){
	if(score<D){
	 return 'F';
	}
	else if(score>=D && score <C){
	  return 'D';
	 }
	else if(score>=C && score<B){
	   return 'C';
	  }
	else if(score>=B && score<A){
	  return 'B';
	 }
	else if(score>=A){
	  return 'A';
	 }
	return (char) score;
}
}
