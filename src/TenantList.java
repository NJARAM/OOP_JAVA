/*collection class to hold list ot  tenants*/
public class TenantList extends ObjectList{
    /** constructor initializes the empty list and sets the maximum
     * list size
     */
    public TenantList(int sizeIn){
        super(sizeIn);//objectList constructor 
        
    }
    /**reads the tenant at the position in the list
     * @param positionIn the position of the tenant in the list
     * @return the tenant at a given position in the list
     * or null if no tenant at that position
     */
    public Tenant getTenant(int positionIn)
    {
        if(positionIn<1 || positionIn>getTotal())
        {
            
            return null;
        }
        else
        {
         return (Tenant)getItem(positionIn);   
        }
    }
    /**searches for a tenant in given room
     * @param roomIn The room to search for
     * @return tenant in given room or null if no tenant in the room
     */
    public Tenant search(int roomIn)
    {
      for(int i=1;i<=getTotal();i++)
      {
          if(getTenant(i).getRooom()==roomIn)
          {
           return getTenant(i);
          }
      } 
      return null;
    }
    public boolean removeTenant(int roomIn)
    {
        for(int i=1;i<=getTotal();i++)
        {
          if(getTenant(i).getRooom()==roomIn)
          {
              remove(i);
              return true;
          }  
        }
        return false;
    }
}
