/**class used to record details of a tenant*/
public class Tenant{
    private String name;
    private int room;
    private PaymentList payments;
    public static final int maxNoOfPayments=12;
    /** constructor initializes the name and room number of the tenant
     * and sets payment made to the empty list
     */
    public Tenant(String nameIn,int roomIn)
    {
       name=nameIn;
       room=roomIn;
       payments=new PaymentList(maxNoOfPayments);
    }
    /** read the name of the tenant */
    public String getName(){
        return name;
    }
    public int getRooom(){
        return room;
    }
    public void makePayments(Payment paymentIn){
        payments.add(paymentIn);
    }
    /** reads payments made by the tenant*/
    public PaymentList getPayments(){
        return payments;
    }
    
}
