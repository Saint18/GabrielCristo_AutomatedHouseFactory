public class StoneBlock extends Block {
  
  
	public StoneBlock(){
    	super(Constant.WEIGHT_STONEBLOCK, ResourceType.STONE);
     
    }
  
  
	public Resource breakBlock(){
    	return new Resource(this.getWeight(), this.getType());
    }
}