/*
*the generic container class to store a list of Objects
*/
public class ObjectList {
    private Object[] list;
    private int total;
    /**constructor initializes an empty list 
    *@param sizeIn used to set the maximum size of the list
    */
    public ObjectList(int sizeIn){
        list=new Object[sizeIn];
        total=0;
    }
    /**adds the object to the end of the list
     * @parem objectIn The object to add
     * @return Returns true if the object was added successfully and force otherwise
     */
    public boolean add(Object objectIn){
       if(!isFull()){
           list[total]=objectIn;
           total++;
           return true;
       } 
       else{
           return false;
       }
    }
    
    public boolean isFull(){
        if(total==list.length)
            return true;
        else
            return false;
    }
    public boolean isEmpty(){
     if(total==0)  
         return true;
     else
         return false;
    }
    /**Reads an object from a specified position in the list
     * 
     * @param positionIn The position of the object in the list
     * @return or null if no object is at that position
     */
    public Object getItem(int positionIn){
        if(positionIn<1 || positionIn>total)
        {
            return null;
        }
        else
        {
         return list[positionIn-1];   
        }
    }
    /**reads the number of objects stored in the list*/
    public int getTotal(){
        return total;
    }
    /**Removes an object from the specified position in the list
     * 
     * @param numberIn The position of the object to be removed
     * @return returns true if the item is removed successfully and false otherwise
     */
     public boolean remove(int numberIn){
         if(numberIn>=1 && numberIn<=total)
         {
             for(int i=numberIn-1;i<=total-2;i++)
             {
                 list[i]=list[i+1];
             } 
                 total--;
                 return true;
            
         }
         else
         {
             return false;
         }
     }
     public String toString()
     {
        String items="";
        for(int i=0;i<total;i++)
        {
        items=items+list[i].toString()+" ";
        }
        return "["+items+"]";
     }
}
