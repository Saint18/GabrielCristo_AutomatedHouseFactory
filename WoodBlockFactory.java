public class WoodBlockFactory implements Factory{
	
	private Resource resourceBin;

    public WoodBlockFactory(){
      
    	resourceBin = new Resource(0, ResourceType.WOOD);
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
      

      	        if(givenResource.getType() != ResourceType.WOOD){
          throw new IllegalArgumentException("Resource must be wood.");
        }
      
      
      	// Add the weight of the given resource to our bin.
        resourceBin.addSubWeight(givenResource.getWeight());
    }
      	// Must return a block, or fail, (or return null)
        public Block produceBlock(){
          if (resourceBin.getWeight() < Constant.WEIGHT_WOODBLOCK){
            return null;
          	// throw new IllegalStateException("Not enough wood to make a block.");
          }
          resourceBin.addSubWeight(-Constant.WEIGHT_WOODBLOCK);
          return new WoodBlock();
          
        }
        
    	public void displayInventory(){
        	System.out.println("Woodblock Factory Inventory:" + resourceBin.getWeight());  
        
        }
  
}