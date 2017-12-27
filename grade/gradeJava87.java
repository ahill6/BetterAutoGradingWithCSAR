package tmpStorage;
//531924c0915a9fa7b02951d5de7cc2b0da19d57a6be3b667c064bec1d5db14b955c30483b24273dd8d11a609a81726c4e6ab964009eb716f8b60adcf5f6fd7e8_001
//531924c0915a9fa7b02951d5de7cc2b0da19d57a6be3b667c064bec1d5db14b955c30483b24273dd8d11a609a81726c4e6ab964009eb716f8b60adcf5f6fd7e8_000
public class gradeJava87{
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
