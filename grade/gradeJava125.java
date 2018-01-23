package tmpStorage.grade;


//92b7dd1241c2688476a763b691eadd80a1aa750e7c26955f8c3a3d2b11233c05cd51469a029d22c1ba0b6b4203484f2d056d1bdf5cef075f583fbca4292f1a40_007
public class gradeJava125{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float score){
if(score >= A){  return 'A';		}
else if(score >= B){ return 'B';		}
else if(score >= C){ return 'C';		}
else if(score >= D){ return 'D';		}
else{ return 'F';}
}
}
