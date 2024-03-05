import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int age;
    private int phoneNo;
    private String emailID;
    private String password;

    String status = "NORMAL";
    float wallet = 1000;

    List<Integer> c = new ArrayList<Integer>();
    ArrayList<Category1> cart1 = new ArrayList<Category1>();
    ArrayList<Category2> cart2 = new ArrayList<Category2>();
    ArrayList<Category3> cart3 = new ArrayList<Category3>();
    ArrayList<Admin> cartDeals = new ArrayList<Admin>();

    public void SignUp(String name,int age,int phoneNo,String emailID,String password){
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.emailID = emailID;
        this.password = password;
    }

    public void SignUp(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String Name(){return this.name;}
    public int Age(){return this.age;}
    public int PhoneNo(){return this.phoneNo;}
    public String EmailID(){return this.emailID;}
    public String Password(){return this.password;}



    public void UpgradeStatus(String status){
        this.status = status;
    }

    public String Status(){return status;}


    public void EliteWallet(){
        this.wallet -= 300;
    }
    public void PrimeWallet(){
        this.wallet -= 200;
    }


}
