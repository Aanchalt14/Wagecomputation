public class Wagecomputation {

	public static void main(String[] args) {
    int partTime=1;
    int fullTime=2;
    int emp_per_hour=20;
    int max=2;
    int min=1;
    int emphour ;
    int a=(int)(Math.random()*(max-min+1)+min);
    
    System.out.println(a);
    if (a==partTime)
    emphour=4;
    else if ( a==fullTime)
    emphour=8;
    else
    emphour=0;
    
    System.out.println("Emp hours =" +emphour);
    System.out.println("Daily wages =" +emphour*emp_per_hour);
	}
}

