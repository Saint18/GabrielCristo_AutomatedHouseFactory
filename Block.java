abstract class Block {
	private double weight;
    private ResourceType type;
  
  	
  
  
	public abstract Resource breakBlock();
  
  
	public Block(double weight, ResourceType type){
    	this.weight = weight;
    	this.type = type;
    }
    	
    public Block(Resource wood, Resource stone){
    	this.type = ResourceType.HOUSE;
    	this.weight = Constant.WEIGHT_WOODBLOCK * Constant.NUM_WOODBLOCK 
    			     + Constant.WEIGHT_STONEBLOCK * Constant.NUM_STONEBLOCK;
    }
	
	public ResourceType getType(){
  		return this.type;
    }
  
	public double getWeight(){
    	return this.weight; 
    }
  
	public String toString(){
    	return "Weight: " + this.weight + "\nResourceType: " + this.type;
      
    }
}