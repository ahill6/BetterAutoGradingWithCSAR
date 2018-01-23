package tmpStorage.grade;


//cd2d9b5b5cff96b07c5b22c0d139ffa2aa36b01823c9eb4db6eca19065a0ce2c4d2516bfcc2f1bc95daeae5b0bbd5e9c15b83feda776735e7bc3de6c49d25144_008
public class gradeJava211{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float num1,float num2,float num3,float num4,float score){
if (score>=num1)
 return 'A';
else if (score>=num2)
 return 'B';
else if (score>=num3)
 return 'C';
else if (score>=num4)
 return 'D';
return (char) score;
}
}
