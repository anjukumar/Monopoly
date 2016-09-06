import java.util.Random;

public class MonopolyDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Random rnd = new Random();
        int num1 = 1 + rnd.nextInt(6);
        int num2 = 1 + rnd.nextInt(6);
        int move = num1 + num2;
        
        if(num1!=num2)
        System.out.println("Your die roll was : " + num1 + "  " +num2 + "  Move:  "+move +"  spaces");
        
        
        else if (num1==num2)
        {
        	System.out.println("Double roll. Move  "+move +" spaces and roll again");
       
        	for(int i =1;i<=3;i++)
        		{
        	
        	  num1 = 1 + rnd.nextInt(6);
              num2= 1 + rnd.nextInt(6);
              move = num1 + num2;
             
              
                 System.out.println("Your die roll was : " + num1 + "  " +num2 + "  Move:  "+move +"  spaces");
                 	 
         }
	}

}
}