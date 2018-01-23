package tmpStorage.grade;


//295afd8942816e14193424cec0b9802cea194a90b13253b85fd19b6caeada3830c60f1fb2fbbdc67a8f713be54b01a6ea116a7d206800df226d6285ece3a4736_006
public class gradeJava27{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a, float b, float c, float d, float perc){
   char grade;

   if (perc > a) {
	grade = 'A';
   } else if (perc > b) {
	grade = 'B';
   } else if (perc > c) {
	grade = 'C';
   } else if (perc > d) {
	grade = 'D';
   } else {
	grade = 'F';
   }
    return grade;

}
}
