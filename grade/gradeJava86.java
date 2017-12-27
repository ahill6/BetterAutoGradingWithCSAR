package tmpStorage;
//531924c0915a9fa7b02951d5de7cc2b0da19d57a6be3b667c064bec1d5db14b955c30483b24273dd8d11a609a81726c4e6ab964009eb716f8b60adcf5f6fd7e8_000
//48b82975576f07f162163145b334648a73321d003a0a8cd4577172e48ce4836e63953dffd4460a9a7aadc511a695ff93de0ce2baf953e4b78b747440caa736a6_001
public class gradeJava86{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float a,float b,float c,float d,float percent){
		char grade;
  if (percent < d)
		grade = 'F';
  else if ((percent > d) && (percent < c))
		grade = 'D';
  else if ((percent > c) && (percent < b))
		grade = 'C';
  else if ((percent > b) && (percent < a))
		grade = 'B';
  else
		grade = 'A';
return grade;
}
}
