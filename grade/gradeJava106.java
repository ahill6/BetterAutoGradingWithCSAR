package tmpStorage.grade;


//833bd42c11f7407d63f604b8ba3b7927e22e04e91884c959f01083cda7d5019610705b94a89c09cd1caa3fd1d58eee24b48b85b523db0fa3fc302e7af2dff93d_003
public class gradeJava106{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double grade_a, double grade_b, double grade_c, double grade_d, double student_score){
if (student_score >= grade_a) {
	 return 'A';		}
else if (student_score >= grade_b) {
	 return 'B';		}
else if (student_score >= grade_c) {
	 return 'C';		}
else if (student_score >= grade_d) {
	 return 'D';		}
else { return 'F';}
}
}
