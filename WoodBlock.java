public class WoodBlock extends Block {
  
  
	public WoodBlock(){
     super(Constant.WEIGHT_WOODBLOCK, ResourceType.WOOD);
     
    }
  
  public Resource breakBlock(){
    	return new Resource(this.getWeight() / 2, this.getType());
    }
  
}