package tmpStorage;
//1b31fa5c50f7725ce468ebf24282f2d080a83aed87e4ee35522ae7710c8e0136bc263cc460b8ec7bf2c3519cb59af4a138e114d36541515b2609ab56ad2b8ee9_000
//0cea42f9680f35f5a84c724c396d4d588b65c303453f9585562f2e2af8db74f5096a83a70b17c5126538222b111a0795a34e9fb6db95d62d771d01592abe3ff6_008
public class gradeJava11{
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
