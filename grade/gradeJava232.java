package tmpStorage;
//d8b262849e28496f80a8acf7de9758cf3f3a4edf023343521e2e0ac50ec485212a473405570d6c58de6756ae098600d9c7138390faa1aaf6bf3609a8d4016448_000
//d6364e6e98a5c96387950d5b3e6206ba9d57628ab2ad0f2cd05ea7af3b818ed03e514157fe4c64e264a0ac9df0840028e0c5a8fd3d096f5ab93bffba61f23812_007
public class gradeJava232{
	public static void main(String[] args){
	grade(1.0,2.0,3.0,4.0,5.0);
}

	public static double grade(double A, double B, double C, double D, double score){
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
	return score;
}
}
