package tmpStorage.grade;


//68ea5d3466c7a9fb4a9219015d32f37de45f50df920793d79bc6028242a1913e9fa55a6da8262f1bc1f64b15e481dcd74d30dc36a54704a8abeac07d06f0f591_000
public class gradeJava92{
	public static void main(String[] args){
	grade(1.0,2.0,3.0, 4.0, 5.0);
}

	public static char grade(double a, double b, double c, double d, double in){
   char g;
   if(in >= a)
    g = 'A';
   else if (in >= b)
    g = 'B';
   else if (in >= c)
    g = 'C';
   else if (in >= d)
    g = 'D';
   else
    g ='F';

    return g;
}
}
