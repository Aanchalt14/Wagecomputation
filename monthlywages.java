public class Wagecomputation {

	public static void main(String[] args) {
    int emp_per_hour=20;
    int max=2;
    int min=1;
    int emphour;
    while(totalemphours<max_hours_in_month && totalworkingdays< num_working_days)
    {
      totalworkingdays++;
      System.out.println("Total working days" +totalworkingdays );

    int a=(int)(Math.random()*(max-min+1)+min);
    System.out.println("Random number =" +a);
    switch (a) {
         case 1 : System.out.println(emphour=4);
                 break;
         case 2 : System.out.println(emphour=8);
                 break;
         default : System.out.println(emphour=0);
        
         System.out.println("emphour = " +emphour);
    }
    System.out.println("Part time wage =" +emphour*emp_per_hour);
    }
	}
}
    
