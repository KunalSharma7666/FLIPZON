public class Admin {

    private String name;
    private int password;
    private float productID1;
    private float productID2;
    private float CombinedPrice1;
    private float productID;
    private float Elite;
    private float Prime;
    private float Normal;

    private float CombinedPrice2;
    private float CombinedPrice3;



    public void EnterAsAdmin(String name , int password){
        this.name = name;
        this.password = password;
    }

    public String Name(){return this.name;}
    public int Password(){return this.password;}



    public void AddGiveawayDeal(float productID1,float productID2,float CombinedPrice1,float CombinedPrice2,float CombinedPrice3){
        this.productID1 = productID1;
        this.productID2 = productID2;
        this.CombinedPrice1 = CombinedPrice1;
        this.CombinedPrice2 = CombinedPrice2;
        this.CombinedPrice3 = CombinedPrice3;
    }

    public float getProductID1(){return this.productID1;}
    public float getProductID2(){return this.productID2;}
    public float getCombinedPrice1(){return this.CombinedPrice1;} // ELITE

    public float getCombinedPrice2(){return this.CombinedPrice2;} // PRIME
    public float getCombinedPrice3(){return this.CombinedPrice3;} // NORMAL



    public void AddDiscount(float productID,float Elite,float Prime,float Normal){

        this.productID = productID;
        this.Elite = Elite;
        this.Prime = Prime;
        this.Normal = Normal;
    }

    public float getProductID(){return this.productID;}
    public float getElite(){return this.Elite;}
    public float getPrime(){return this.Prime;}
    public float getNormal(){return this.Normal;}









}
