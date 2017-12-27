package tmpStorage;
//1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_002
//1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_001
public class gradeJava13{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float grade){
	if(grade >= A)
	{
		 return 'A';
	}
	else if((grade < A) && (grade >= B))
	{
                 return 'B';
        }
	else if((grade < B) && (grade >= D))
	{
                 return 'C';
        }
	else if((grade < C) && (grade >= D))
	{
                 return 'D';
        }
	else  return 'F';
}
}
