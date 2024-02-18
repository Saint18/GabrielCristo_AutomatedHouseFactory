public class Resource{
  
  
	private double weight;
    private ResourceType type;
  
  
	public Resource(double weight, ResourceType type){
    	this.weight = weight;
    	this.type = type;
      
    }
  
	public double getWeight(){
    	return weight;
    }
  
	public ResourceType getType(){
    	return type;	
    }
  
  
	public void addSubWeight(double givenWeight){
    	if(this.weight + givenWeight < 0) { 
            throw new IllegalArgumentException("Subtracted too much");
        }
    	this.weight = this.weight + givenWeight;
        
        
    }
}

