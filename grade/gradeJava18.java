package tmpStorage.grade;


//1c2bb3a40a82cba97b2937bc6825903a28ecfe91f993fc177a0f2ae003bcc7b1073eb49e35d3f0f69d6b612e8347e9c1b93306bf25a7e5390098c1a06845baac_002
public class gradeJava18{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double a, double b, double c, double d, double e){

if (e >= a)
	 return 'A';
else if (e >= b)
	 return 'B';
else if (e >= c)
	 return 'C';
else if (e >= d)
	 return 'D';
else
	 return 'F';
}
}
