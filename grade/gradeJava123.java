package tmpStorage;
//92b7dd1241c2688476a763b691eadd80a1aa750e7c26955f8c3a3d2b11233c05cd51469a029d22c1ba0b6b4203484f2d056d1bdf5cef075f583fbca4292f1a40_002
//9083480332b4a5e4274f3bf5ef8bd5d1bd75048c0c066e574c27a2de6d919d658efc519e8b6a230a074eb5f2957d5768f4dc981a8e926c3a72993bc448a017f7_018
public class gradeJava123{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float A,float B,float C,float D,float score){
if(score >= A){  return 'A';	}
else if(score >= B){ return 'B';		}
else if(score >= C){ return 'C';		}
else if(score >= D){ return 'D';		}
else{ return 'F';}
}
}
