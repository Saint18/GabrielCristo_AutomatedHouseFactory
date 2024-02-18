public class HouseBlock extends Block{

  
  	public HouseBlock(Resource wood, Resource stone){
        super(wood, stone);
    	int reqWoodWeight = Constant.NUM_STONEBLOCK * Constant.WEIGHT_WOODBLOCK;
        int reqStoneWeight = Constant.NUM_STONEBLOCK * Constant.NUM_STONEBLOCK;
    	if(wood.getType() != ResourceType.WOOD || stone.getType() != ResourceType.WOOD 
           || wood.getWeight() != reqWoodWeight || stone.getWeight() != reqStoneWeight){
        throw new IllegalArgumentException("Incorrect resources.");
        }
  	}
      
	public Resource breakBlock(){
    	return new Resource(Constant.NUM_STONEBLOCK * Constant.WEIGHT_STONEBLOCK, ResourceType.STONE);
    }
      
      
      
    }
  
  
  
  
  


