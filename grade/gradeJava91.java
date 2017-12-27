package tmpStorage;
//68ea5d3466c7a9fb4a9219015d32f37de45f50df920793d79bc6028242a1913e9fa55a6da8262f1bc1f64b15e481dcd74d30dc36a54704a8abeac07d06f0f591_000
//5b504b3547416bfd54f138b3caa529ad72d157744b787e0e6f4745a2ff0fc5cc33bc87904b2d7cda9c7858087b2e04ece46d53fe9edd208f68d30a0ae70f363f_002
public class gradeJava91{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
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
