/**collection class to hold list of payment objects*/
public class PaymentList extends ObjectList{
    /**constructor initializes the empty list and sets the maximum list size*/
    public PaymentList(int sizeIn) {
        super(sizeIn);
    }
    public Payment getPayment(int positionIn)
    {
      if(positionIn<1 || positionIn>getTotal())
      {
          return null;
      } 
      else
      {
          //calls the inherited method and type cast
          return  (Payment) getItem(positionIn);
      }
    }
    /**returns the total value of payments recorded */
    public double calculatedTotalPaid(){
        double totalPaid=0;
        for(int i=1;i<=getTotal();i++)
        {
            totalPaid=totalPaid+getPayment(i).getAmount();
        }
        return totalPaid;
    }
}
