package tmpStorage;
public class gradeJava268{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(double one, double two, double three, double four, double grade){
		
		char score = 'A';
		
		  if(grade > one)
			  score = 'A';
		  else if (grade > two)
			  score = 'B';
		  else if (grade > three)
			  score = 'C';
		  else if (grade > four)
			  score = 'D';
		  
		  return score;
		}
		/*
		double min = -1;
		if (one <= two){
			min = one;
		}
		else{
			min = two;
		}
		if (three < min){
			min = three;
		}
		if (four < min){
			min = four;
		}
		
		return (char) min;
	}*/
}
