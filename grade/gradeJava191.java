package tmpStorage;
//bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_001
//bfad6d21d636def8e9e72910c3eb0815f5747669e3a60fb10c6f7f421082d18e548dcfc5d4717bb6da075c36f067b37858d11528ce796b3226ae33719c5007ce_000
public class gradeJava191{
	public static void main(String[] args){
	grade((float)1.0,(float)2.0,(float)3.0, (float)4.0, (float)5.0);
}

	public static char grade(float thresha,float threshb,float threshc,float threshd,float stuscore){
    if (stuscore > thresha)
        return 'A';
    if ((stuscore < thresha) && (stuscore >= threshb))
        return 'B';
    if ((stuscore < threshb) && (stuscore >= threshc))
        return 'C';
    if ((stuscore < threshc) && (stuscore >= threshd))
        return 'D';
    if (stuscore < threshd)
        return 'F';
	return 0;
}
}
