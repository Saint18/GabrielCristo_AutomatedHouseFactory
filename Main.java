
import java.util.Random;
import java.lang.Math;

/*
Driver file for Automated House Factory Assignment

This file will not work until assignment has been completely implmented. 

6/21/2022
-Dr. G

*/
public class Main
{
	public static void main(String[] args) throws InterruptedException {
		
		Resource resource; 
		
		Factory stoneBlockProducer = new StoneBlockFactory();
		Factory woodBlockProducer = new WoodBlockFactory();
		Factory houseBlockProducer = new HouseBlockFactory();
		
		Block h1;
		
		//Infinite simulation loop CTRL + C to terminate simulation
		while(true)
		{
		    resource = mineResource();
		
		    switch(resource.getType())
		    {
		        case STONE: stoneBlockProducer.takeResource(resource); break;
		        case WOOD: woodBlockProducer.takeResource(resource); break;
		    }
		
    		houseBlockProducer.takeResource(stoneBlockProducer.produceBlock());
    		houseBlockProducer.takeResource(woodBlockProducer.produceBlock());
    		
    		h1 = houseBlockProducer.produceBlock();
    		
    		if (h1 != null) System.out.println("House Built");
    		
    		h1 = null;
    		
    		
    		System.out.println("Stone Producer");
    		stoneBlockProducer.displayInventory();
    		System.out.println("Wood Producer");
    		woodBlockProducer.displayInventory();
    		System.out.println("House Producer");
    		houseBlockProducer.displayInventory();
    		
    		System.out.println();
    		
    		//pauses simulation for 2 seconds so it is visable
    		Thread.sleep(2000);
		}
	}
	
	//generate a random Resource with a random weight
	public static Resource mineResource()
	{
	    Random r = new Random();
	  
	    ResourceType type = ResourceType.STONE;
	    double weight = Math.round((Math.abs(r.nextDouble()))*100.0)/10.0 ;
	   // double weight = 1000000;
	    int select = r.nextInt(2);
	    
	    switch(select)
	        {
	            case 0: type = ResourceType.STONE; break;
	            case 1: type = ResourceType.WOOD; break;
	        }
	        
	   return new Resource(weight, type);
	}
}


