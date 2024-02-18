public class HouseBlockFactory implements Factory
{
  
	private int woodBlockInventory;
    private int stoneBlockInventory; 
  
  
  	public HouseBlockFactory(){
    	woodBlockInventory = 0;
        stoneBlockInventory = 0;
        
        
    }
  

	public void takeResource(Object object){
      
      	// IF the given object is not a Block
      	//		throw an illegal argument exception.
    	// if((object instanceof Block) == false){
        // 	throw new IllegalArgumentException("Object must be a block.");
        // }
      
       	if(object instanceof StoneBlock){
        	stoneBlockInventory++;
        }
  
      	if(object instanceof WoodBlock){
        	woodBlockInventory++;
       	}
      
    }
  
	public Block produceBlock(){
    
      	// subtract  from woodBlockInventory
    	if(woodBlockInventory < Constant.NUM_WOODBLOCK){
        	return null;
          
        }
    	if(stoneBlockInventory < Constant.NUM_STONEBLOCK){
        	return null;
        }
        
    	
      	// subtract  from stoneBlockInventory
      	woodBlockInventory = woodBlockInventory - Constant.NUM_WOODBLOCK;
        stoneBlockInventory = stoneBlockInventory - Constant.NUM_STONEBLOCK;
      
      	// Create a Resource object, with a resouce type of Wood, whose weight 
      	// is the weight of all the wood blocks needed to make a house.
        Resource woodResource = new Resource(Constant.NUM_WOODBLOCK * Constant.WEIGHT_WOODBLOCK, ResourceType.WOOD);
        Resource stoneResource = new Resource(Constant.NUM_STONEBLOCK * Constant.WEIGHT_STONEBLOCK, ResourceType.STONE);
      	// Create a Resource object, with a resouce type of Stone, whose weight 
      	// is the weight of all the stone blocks needed to make a house.      
      
      	return new HouseBlock(woodResource, stoneResource);

    }
  
	public void displayInventory(){
      
      	System.out.println("Houseblock Inventory:" + 
      	"\nWoodblock Inventory:" + woodBlockInventory +
      	"\nStoneblock Inventory:" + stoneBlockInventory);
      
    }



 
  
}