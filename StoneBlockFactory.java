public class StoneBlockFactory implements Factory{
	
	private Resource resourceBin;

    public StoneBlockFactory(){
      
    	resourceBin = new Resource(0, ResourceType.STONE);
    }
  

	public void takeResource(Object object) {

      // Check if object is null, throw an exception
       if(object == null){
          throw new IllegalArgumentException("Object is null.");
       }      
      
      // Check if object is not a resource, throw an exception
       if((object instanceof Resource) == false){
       	 throw new IllegalArgumentException("Not a resource.");
       }
      
        Resource givenResource = (Resource) object;
      

      	// Make sure the given resource is of type STONE.
        if(givenResource.getType() != ResourceType.STONE){
          throw new IllegalArgumentException("Resource must be stone.");
        }
      
      
      	// Add the weight of the given resource to our bin.
        resourceBin.addSubWeight(givenResource.getWeight());
    }
      	// Must return a block, or fail, (or return null)
        public Block produceBlock(){

          if (resourceBin.getWeight() < Constant.WEIGHT_STONEBLOCK){
          	// throw new IllegalStateException("Not enough stone to make a block.");
            return null;
          }
          resourceBin.addSubWeight(-Constant.WEIGHT_STONEBLOCK);
          return new StoneBlock();
          
        }
        
    	public void displayInventory(){
        	System.out.println("Stoneblock Factory Inventory:" + resourceBin.getWeight());  
        
        }
  
}