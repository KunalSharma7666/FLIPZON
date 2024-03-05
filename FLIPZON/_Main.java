import java.util.*;

public class _Main {

    static void one(){
        System.out.println();
        System.out.println("1. Enter as Admin");
        System.out.println("2. Explore the Product Catalog");
        System.out.println("3. Show Available Deals");
        System.out.println("4. Enter as Customer");
        System.out.println("5. Exit the Application");
        System.out.println();
    }

    static void one1(){
        System.out.println();
        System.out.println("Please choose any one of the following actions");
        System.out.println("1. Add Category");
        System.out.println("2. Delete category");
        System.out.println("3. Add Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Set Discount on Product");
        System.out.println("6. Add giveaway deal");
        System.out.println("7. Back");
        System.out.println();
    }

    static void one4(){
        System.out.println();
        System.out.println("1. Sign up");
        System.out.println("2. Log in");
        System.out.println("3. Back");
        System.out.println();
    }

    static void onefour2(){

        System.out.println();
        System.out.println("1. Browse Products");
        System.out.println("2. Browse Deals");
        System.out.println("3. Add a Product to Cart");
        System.out.println("4. Add Products in deal to cart");
        System.out.println("5. View Coupons");
        System.out.println("6. Check account balance");
        System.out.println("7. View cart");
        System.out.println("8. Empty cart");
        System.out.println("9. Checkout cart");
        System.out.println("10. Upgrade customer status");
        System.out.println("11. Add amount to wallet");
        System.out.println("12. Back");
        System.out.println();

    }

    public static void main(String[] args) {
        Admin Ad = new Admin();
        Product1_1 p1 = new Product1_1();
        Product2_1 p2 = new Product2_1();
        Product3_1 p3 = new Product3_1();
        product1_2 p12 = new product1_2();
        Category1 ca = new Category1();
        Product2_2 p22 = new Product2_2();
        Category2 cat = new Category2();
        Product3_2 p32 = new Product3_2();
        Category3 cat3 = new Category3();
        ArrayList<Admin> admin = new ArrayList<Admin>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Category1> category1 = new ArrayList<Category1>();
        ArrayList<Category2> category2 = new ArrayList<Category2>();
        ArrayList<Category3> category3 = new ArrayList<Category3>();
        ArrayList<Admin> Available_Deals = new ArrayList<Admin>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("WELCOME TO FLIPZON");

        while(true){

            one();
            int a = in.nextInt();

            if(a==1){
                System.out.println();
                System.out.println("Dear Admin,");
                System.out.println("Please enter your username and password");
                System.out.println();
                String name = in.next();
                int password = in.nextInt();

                if(Objects.equals(name, "Kunal") && password == 2021331){
                    System.out.println("Welcome "+name+"!!!!!");
                    while(true) {
                        one1();
                        int b = in.nextInt();
                        if(b==1){
                            System.out.println();
                            System.out.println("Add category ID:");
                            int categoryID = in.nextInt();
                            System.out.println();



                            int temp = 0;

                            if(categoryID == 1) {
                                for (int i = 0; i < category1.size(); i++) {
                                    if (category1.get(i).categoryID == categoryID) {
                                        System.out.println("Dear Admin, the category ID is already used!!! Please set a different and a unique category ID");
                                        temp += 1;
                                    }
                                }
                            }
                            if(categoryID == 1 && temp == 0 ){
                                System.out.println("Add name of the category:");
                                String categoryName = in.next();

                                System.out.println("Add a Product");
                                System.out.println();
                                System.out.println("Product name:");
                                String productName = in.next();
                                System.out.println("Product ID:");
                                float productID = in.nextFloat();
                                System.out.println("Capacity:");
                                float capacity = in.nextFloat();
                                System.out.println("Power consumption:");
                                float power_consumption = in.nextFloat();
                                System.out.println("Price");
                                float price = in.nextFloat();
                                System.out.println("Quantity: ");
                                int quantity = in.nextInt();
                                p1.AddCategory1(categoryID,categoryName);
                                p1.AddaProduct1(productName,productID,price,quantity);
                                p1.AddProduct1_1(capacity,power_consumption);
                                category1.add(p1);
                            }
                            int kun= 0;
                            if(categoryID == 2) {

                                for (int i = 0; i < category2.size(); i++) {
                                    if (category2.get(i).categoryID == categoryID) {
                                        System.out.println("Dear Admin, the category ID is already used!!! Please set a different and a unique category ID");
                                        kun+= 1;
                                    }
                                }
                            }
                            if(categoryID == 2 && kun == 0 ){
                                System.out.println("Add name of the category:");
                                String categoryName = in.next();

                                System.out.println("Add a Product");
                                System.out.println();
                                System.out.println("Product name:");
                                String productName = in.next();
                                System.out.println("Product ID:");
                                float productID = in.nextFloat();
                                System.out.println("Operating System:");
                                String operating_system = in.next();
                                System.out.println("Storage capacity:");
                                int storage = in.nextInt();
                                System.out.println("RAM:");
                                int RAM = in.nextInt();
                                System.out.println("Price:");
                                float price = in.nextFloat();
                                System.out.println("Quantity: ");
                                int quantity = in.nextInt();
                                p2.AddCategory2(categoryID,categoryName);
                                p2.AddaProduct2(productName,productID,price,quantity);
                                p2.AddProduct2_1(operating_system,storage,RAM);
                                category2.add(p2);
                            }

                            int tus= 0;
                            if(categoryID == 3) {

                                for (int i = 0; i < category3.size(); i++) {
                                    if (category3.get(i).categoryID == categoryID) {
                                        System.out.println("Dear Admin, the category ID is already used!!! Please set a different and a unique category ID");
                                        tus+= 1;
                                    }
                                }
                            }
                            if(categoryID == 3 && tus == 0 ){
                                System.out.println("Add name of the category:");
                                String categoryName = in.next();

                                System.out.println("Add a Product");
                                System.out.println();
                                System.out.println("Product name:");
                                String productName = in.next();
                                System.out.println("Product ID:");
                                float productID = in.nextFloat();
                                System.out.println("Items");
                                String items = in.next();
                                System.out.println("Serve:");
                                int Serve = in.nextInt();
                                System.out.println("Time sufficient for consumption");
                                int time = in.nextInt();
                                System.out.println("Price:");
                                float price = in.nextFloat();
                                System.out.println("Quantity: ");
                                int quantity = in.nextInt();
                                p3.AddCategory3(categoryID,categoryName);
                                p3.AddaProduct3(productName,productID,price,time,quantity);
                                p3.AddProduct3_1(items,Serve);
                                category3.add(p3);
                            }
                        }
                        if(b==2){
                            System.out.println("Enter the categoryID of the category you want to delete:");
                            int categoryID = in.nextInt();
                            System.out.println();
                            if(categoryID == p1.categoryID){
                                category1.clear();
                            }
                            if(categoryID == p2.categoryID){
                                category2.clear();
                            }
                            if(categoryID == p3.categoryID){
                                category3.clear();
                            }
                        }

                        if(b==3){

                            System.out.println();
                            System.out.println("Enter category ID");

                            int categoryID = in.nextInt();
                            System.out.println();

                            if(category1.size() == 2){
                                System.out.println("Product name:");
                                String productName = in.next();
                                System.out.println("Product ID:");
                                float productID = in.nextFloat();
                                System.out.println("Price");
                                float price =  in.nextFloat();
                                System.out.println("Quantity: ");
                                int quantity = in.nextInt();
                                ca.AddaProduct1(productName,productID,price,quantity);
                                category1.add(ca);
                                System.out.println();}


                            if(category1.size() == 1){
                                if(categoryID == category1.get(0).categoryID){

                                    System.out.println("Product name:");
                                    String productName = in.next();
                                    System.out.println("Product ID:");
                                    float productID = in.nextFloat();
                                    System.out.println("Color:");
                                    String color = in.next();
                                    System.out.println("Price");
                                    float price =  in.nextFloat();
                                    System.out.println("Quantity: ");
                                    int quantity = in.nextInt();
                                    p12.AddaProduct1(productName,productID,price,quantity);
                                    p12.AddProduct1_2(color);
                                    category1.add(p12);
                                    System.out.println();}

                            }

                            if(category2.size() == 2){

                                System.out.println("Product name:");
                                String productName = in.next();
                                System.out.println("Product ID:");
                                float productID = in.nextFloat();
                                System.out.println("Price");
                                float price =  in.nextFloat();
                                System.out.println("Quantity: ");
                                int quantity = in.nextInt();
                                cat.AddaProduct2(productName,productID,price,quantity);
                                category2.add(cat);
                                System.out.println();}


                            if(category2.size() == 1){
                                if(categoryID == category2.get(0).categoryID){

                                    System.out.println("Product name:");
                                    String productName = in.next();
                                    System.out.println("Product ID:");
                                    float productID = in.nextFloat();
                                    System.out.println("Power Usage:");
                                    float power = in.nextFloat();
                                    System.out.println("Price");
                                    float price =  in.nextFloat();
                                    System.out.println("Quantity: ");
                                    int quantity = in.nextInt();
                                    p22.AddaProduct2(productName,productID,price,quantity);
                                    p22.AddProduct2_2(power);
                                    category2.add(p22);
                                    System.out.println();}
                            }


                            if(category3.size() == 2){

                                System.out.println("Product name:");
                                String productName = in.next();
                                System.out.println("Product ID:");
                                float productID = in.nextFloat();
                                System.out.println("Time sufficient for consumption:");
                                int time = in.nextInt();
                                System.out.println("Price");
                                float price =  in.nextFloat();
                                System.out.println("Quantity: ");
                                int quantity = in.nextInt();
                                cat3.AddaProduct3(productName,productID,price,time,quantity);
                                category3.add(cat3);
                                System.out.println();}

                            if(category3.size() == 1){
                                if(categoryID == category3.get(0).categoryID){

                                    System.out.println("Product name:");
                                    String productName = in.next();
                                    System.out.println("Product ID:");
                                    float productID = in.nextFloat();
                                    System.out.println("Quantity:");
                                    float quantity = in.nextFloat();
                                    System.out.println("Time sufficient for consumption:");
                                    int time = in.nextInt();
                                    System.out.println("Price");
                                    float price =  in.nextFloat();
                                    System.out.println("Quantity: ");
                                    int Quantity = in.nextInt();
                                    p32.AddaProduct3(productName,productID,price,time,Quantity);
                                    p32.AddProduct3_2(quantity);
                                    category3.add(p32);
                                    System.out.println();}
                            }

                        }


                        if(b==4){

                            System.out.println("Enter the productID of the product you want to delete");
                            float productID = in.nextFloat();
                            System.out.println();
                            if((int)Math.floor(productID) == p1.categoryID){
                                for(int i=0;i<category1.size();i++){
                                    if(productID == category1.get(i).productID){
                                        category1.remove(category1.get(i));
                                    }
                                }
                            }

                            if((int)Math.floor(productID) == p2.categoryID){
                                for(int j=0;j<category2.size();j++){
                                    if(productID == category1.get(j).productID){
                                        category2.remove(category2.get(j));
                                    }
                                }
                            }
                            if((int)Math.floor(productID) == p3.categoryID){
                                for(int k=0;k<category3.size();k++){
                                    if(productID == category1.get(k).productID){
                                        category3.remove(category3.get(k));
                                    }
                                }
                            }
                        }
                        if(b==5){
                            System.out.println("Dear Admin give the Product ID you want to add discount for:");
                            System.out.println("Enter the Product ID:");
                            float productID = in.nextFloat();
                            System.out.println();
                            System.out.println("Enter discount for Elite,Prime and Normal customers respectively(in % terms)");
                            float Elite = in.nextFloat();
                            float Prime = in.nextFloat();
                            float Normal = in.nextFloat();
                            Ad.AddDiscount(productID,Elite ,Prime ,Normal);
                            admin.add(Ad);
                        }

                        if(b==6){
                            float x=0;
                            float y=0;
                            System.out.println("Dear Admin give the Product IDs you want to combine and giveaway a deal for");
                            System.out.println("Enter the first Product ID:");
                            float productID1 = in.nextFloat();
                            System.out.println();
                            System.out.println("Enter the second Product ID:");
                            float productID2 = in.nextFloat();
                            System.out.println();
                            System.out.println("Enter the combined price(Should be less than their combined price.)");
                            float CombinedPrice1 = in.nextFloat();
                            float CombinedPrice2 = in.nextFloat();
                            float CombinedPrice3 = in.nextFloat();
                            if(category1.size()!=0){
                            if((int)Math.floor(productID1) == category1.get(0).categoryID ){
                                for(int i=0;i<category1.size();i++){
                                    if(productID1 == category1.get(i).productID){
                                        x  = category1.get(i).price;
                                    }
                                }
                            }}
                            if(category2.size()!=0){
                            if((int)Math.floor(productID1) == category2.get(0).categoryID ){
                                for(int i=0;i<category2.size();i++){
                                    if(productID1 == category2.get(i).productID){
                                        x  = category2.get(i).price;
                                    }
                                }
                            }}
                            if(category3.size()!=0){
                            if((int)Math.floor(productID1) == category3.get(0).categoryID ){
                                for(int i=0;i<category3.size();i++){
                                    if(productID1 == category3.get(i).productID){
                                        x  = category3.get(i).price;
                                    }
                                }
                            }}
                            if(category1.size()!=0){
                            if((int)Math.floor(productID2) == category1.get(0).categoryID ){
                                for(int i=0;i<category1.size();i++){
                                    if(productID2== category1.get(i).productID){
                                        y  = category1.get(i).price;
                                    }
                                }
                            }}
                            if(category2.size()!=0){
                            if((int)Math.floor(productID2) == category2.get(0).categoryID ){
                                for(int i=0;i<category2.size();i++){
                                    if(productID2== category2.get(i).productID){
                                        y  = category2.get(i).price;
                                    }
                                }
                            }}
                            if(category3.size()!=0){
                            if((int)Math.floor(productID2) == category3.get(0).categoryID ){
                                for(int i=0;i<category3.size();i++){
                                    if(productID2== category3.get(i).productID){
                                        y  = category3.get(i).price;
                                    }
                                }
                            }}
                            if(x+y<CombinedPrice1 && x+y<CombinedPrice2 && x+y<CombinedPrice3 ){
                                System.out.println();
                                System.out.println("Combined price of deal  cannot be greater than the combined price of the product");
                            }
                            else{
                                Ad.AddGiveawayDeal(productID1 ,productID2 ,CombinedPrice1,CombinedPrice2,CombinedPrice3 );
                                Available_Deals.add(Ad);
                            }

                        }
                        if(b>=7){
                            break;
                        }
                    }

                }
                else{

                    System.out.println("Please enter correct username or password");
                }

            }

            if(a==2){
                if(category1.size()==0 && category2.size()==0 && category3.size()==0){
                    System.out.println("Product Catalog is Empty. Please try again later");
                }
                else {
                    if(category1.size()!=0) {
                        for (int i = 0; i < category1.size(); i++) {
                            if (category1.get(i).productID == p1.productID) {
                                System.out.println();
                                p1.PrintCategory1();
                                p1.printproduct1_1();
                                System.out.println();
                            }
                            if (category1.get(i).productID == p12.productID) {
                                System.out.println();
                                p12.PrintCategory1();
                                p12.printproduct1_2();
                                System.out.println();
                            }
                            if (category1.get(i).productID == ca.productID) {
                                System.out.println();
                                ca.PrintCategory1();
                                System.out.println();
                            }
                        }
                    }

                    if(category2.size()!=0){
                        for(int j=0;j<category2.size();j++){
                            if (category2.get(j).productID == p2.productID) {
                                System.out.println();
                                p2.PrintCategory2();
                                p2.printproduct2_1();
                                System.out.println();
                            }
                            if (category2.get(j).productID == p22.productID) {
                                System.out.println();
                                p22.PrintCategory2();
                                p22.printproduct2_2();
                                System.out.println();
                            }
                            if (category2.get(j).productID == cat.productID) {
                                System.out.println();
                                cat.PrintCategory2();
                                System.out.println();
                            }

                        }
                    }

                    if(category3.size()!=0){
                        for(int k=0;k<category3.size();k++){
                            if (category3.get(k).productID == p3.productID) {
                                System.out.println();
                                p3.PrintCategory3();
                                p3.printproduct3_1();
                                System.out.println();
                            }
                            if (category3.get(k).productID == p32.productID) {
                                System.out.println();
                                p32.PrintCategory3();
                                p32.printproduct3_2();
                                System.out.println();
                            }
                            if (category3.get(k).productID == cat3.productID) {
                                System.out.println();
                                cat3.PrintCategory3();
                                System.out.println();
                            }
                        }
                    }
                }
            }

            if(a==3){

                if(Available_Deals.size()!=0){
                    for(int i=0;i<Available_Deals.size();i++){
                        System.out.println();
                        System.out.println("Product with ID "+Available_Deals.get(i).getProductID1()+"and Product with ID "+Available_Deals.get(i).getProductID2() +" are on deal with a combined price for ELITE category Rs "+Available_Deals.get(i).getCombinedPrice1());
                        System.out.println();
                        System.out.println("Product with ID "+Available_Deals.get(i).getProductID1()+"and Product with ID "+Available_Deals.get(i).getProductID2() +" are on deal with a combined price for  PRIME category Rs "+Available_Deals.get(i).getCombinedPrice1());
                        System.out.println();
                        System.out.println("Product with ID "+Available_Deals.get(i).getProductID1()+"and Product with ID "+Available_Deals.get(i).getProductID2() +" are on deal with a combined price for NORMAL category Rs "+Available_Deals.get(i).getCombinedPrice1());
                    }
                }
                else{
                    System.out.println("Dear user, there are no deals for now!!! Please check regularly for exciting deals.");
                }
            }

            if(a==4){
                while(true) {
                    one4();
                    int c = in.nextInt();
                    if (c == 1) {
                        Customer C = new Customer();
                        System.out.println();
                        System.out.println("Enter name:");
                        String name = in.next();
                        System.out.println();
                        System.out.println("Enter Password:");
                        String password = in.next();
                        C.SignUp(name, password);
                        customers.add(C);
                        System.out.println();
                        System.out.println("Customer successfully registered!!");

                    }
                    if (c == 2) {

                        System.out.println("Enter name:");
                        String name = in.next();
                        System.out.println();
                        System.out.println("Enter password:");
                        String password = in.next();

                        if(customers.size() == 0){
                            System.out.println("please sign up before login");
                        }
                        else {
                            int checker = 0;
                            for (int i = 0; i < customers.size(); i++) {

                                if (customers.get(i).Name().equals(name) && customers.get(i).Password().equals(password)) {

                                    System.out.println("Welcome " + name);
                                    while (true) {
                                        onefour2();
                                        int k = in.nextInt();
                                        System.out.println();
                                        if (k == 1) {

                                            if(category1.size()==0 && category2.size()==0 && category3.size()==0){
                                                System.out.println("Product Catalog is Empty. Please try again later");
                                            }
                                            else {
                                                if(category1.size()!=0) {
                                                    for (int i1 = 0; i1 < category1.size(); i1++) {
                                                        if (category1.get(i1).productID == p1.productID && category1.get(i1).quantity !=0) {
                                                            System.out.println();
                                                            p1.PrintCategory1();
                                                            p1.printproduct1_1();
                                                            System.out.println();
                                                        }
                                                        if (category1.get(i1).productID == p12.productID && category1.get(i1).quantity !=0) {
                                                            System.out.println();
                                                            p12.PrintCategory1();
                                                            p12.printproduct1_2();
                                                            System.out.println();
                                                        }
                                                        if (category1.get(i1).productID == ca.productID && category1.get(i1).quantity !=0) {
                                                            System.out.println();
                                                            ca.PrintCategory1();
                                                            System.out.println();
                                                        }
                                                    }
                                                }

                                                if(category2.size()!=0){
                                                    for(int j=0;j<category2.size();j++){
                                                        if (category2.get(j).productID == p2.productID && category2.get(j).quantity !=0) {
                                                            System.out.println();
                                                            p2.PrintCategory2();
                                                            p2.printproduct2_1();
                                                            System.out.println();
                                                        }
                                                        if (category2.get(j).productID == p22.productID && category2.get(j).quantity !=0) {
                                                            System.out.println();
                                                            p22.PrintCategory2();
                                                            p22.printproduct2_2();
                                                            System.out.println();
                                                        }
                                                        if (category2.get(j).productID == cat.productID && category2.get(j).quantity !=0) {
                                                            System.out.println();
                                                            cat.PrintCategory2();
                                                            System.out.println();
                                                        }

                                                    }
                                                }

                                                if(category3.size()!=0){
                                                    for(int k1=0;k1<category3.size();k1++){
                                                        if (category3.get(k1).productID == p3.productID && category3.get(k1).quantity !=0) {
                                                            System.out.println();
                                                            p3.PrintCategory3();
                                                            p3.printproduct3_1();
                                                            System.out.println();
                                                        }
                                                        if (category3.get(k1).productID == p32.productID && category3.get(k1).quantity !=0) {
                                                            System.out.println();
                                                            p32.PrintCategory3();
                                                            p32.printproduct3_2();
                                                            System.out.println();
                                                        }
                                                        if (category3.get(k1).productID == cat3.productID && category3.get(k1).quantity !=0) {
                                                            System.out.println();
                                                            cat3.PrintCategory3();
                                                            System.out.println();
                                                        }
                                                    }
                                                }
                                            }


                                        }
                                        if (k == 2) {
                                            if(Available_Deals.size()!=0){
                                                for(int i2=0;i2<Available_Deals.size();i2++){
                                                    System.out.println();
                                                    System.out.println("Product with ID "+Available_Deals.get(i).getProductID1()+"and Product with ID "+Available_Deals.get(i).getProductID2() +" are on deal with a combined price for ELITE category Rs "+Available_Deals.get(i).getCombinedPrice1());
                                                    System.out.println();
                                                    System.out.println("Product with ID "+Available_Deals.get(i).getProductID1()+"and Product with ID "+Available_Deals.get(i).getProductID2() +" are on deal with a combined price for  PRIME category Rs "+Available_Deals.get(i).getCombinedPrice1());
                                                    System.out.println();
                                                    System.out.println("Product with ID "+Available_Deals.get(i).getProductID1()+"and Product with ID "+Available_Deals.get(i).getProductID2() +" are on deal with a combined price for NORMAL category Rs "+Available_Deals.get(i).getCombinedPrice1());
                                                }
                                            }

                                        }
                                        if (k == 3) {
                                            System.out.println("Enter product ID and quantity:");
                                            float productID = in.nextFloat();
                                            int quantity = in.nextInt();
                                            if((int)Math.floor(productID)==category1.get(0).categoryID){
                                                for(int o=0;o<category1.size();o++){
                                                    if(productID==category1.get(o).productID){
                                                        if(category1.get(o).quantity>=quantity){
                                                            for(int z = 0;z<quantity;z++){
                                                                customers.get(i).cart1.add(category1.get(o));
                                                            }
                                                            category1.get(o).quantity -= quantity;
                                                        }
                                                        if(category1.get(o).quantity<quantity){
                                                            System.out.println("The entered quantity for this product exceeds our stock limit.");
                                                        }
                                                        if(category1.get(o).quantity==0){
                                                            System.out.println("Entered product is out of stock.");
                                                        }

                                                    }
                                                }
                                            }

                                            if((int)Math.floor(productID)==category2.get(0).categoryID){
                                                for(int p=0;p<category2.size();p++){
                                                    if(productID==category2.get(p).productID){
                                                        if(category2.get(p).quantity>=quantity){
                                                            for(int m = 0;m<quantity;m++){
                                                                customers.get(i).cart2.add(category2.get(p));
                                                            }
                                                            category2.get(p).quantity -= quantity;
                                                        }
                                                        if(category2.get(p).quantity<quantity){
                                                            System.out.println("The entered quantity for this product exceeds our stock limit.");
                                                        }
                                                        if(category2.get(p).quantity==0){
                                                            System.out.println("Entered product is out of stock.");
                                                        }

                                                    }
                                                }
                                            }

                                            if((int)Math.floor(productID)==category3.get(0).categoryID){
                                                for(int q=0;q<category3.size();q++){
                                                    if(productID==category3.get(q).productID){
                                                        if(category3.get(q).quantity>=quantity){
                                                            for(int r = 0;r<quantity;r++){
                                                                customers.get(i).cart3.add(category3.get(q));
                                                            }
                                                            category3.get(q).quantity -= quantity;
                                                        }
                                                        if(category3.get(q).quantity<quantity){
                                                            System.out.println("The entered quantity for this product exceeds our stock limit.");
                                                        }
                                                        if(category3.get(q).quantity==0){
                                                            System.out.println("Entered product is out of stock.");
                                                        }

                                                    }
                                                }
                                            }


                                        }
                                        if (k == 4) {
                                            for(int k1 =0;k1<Available_Deals.size();k1++){
                                                customers.get(i).cartDeals.add(Available_Deals.get(k1));
                                            }

                                        }
                                        if (k == 5) {
                                            System.out.println("Your Coupons: ");
                                            for(int i4=0;i4<customers.get(i).c.size();i4++){
                                                System.out.println(customers.get(i).c.get(i4)+" %");
                                            }


                                        }
                                        if (k == 6) {
                                            System.out.println("Current Account balance is Rupees:");
                                            System.out.println(customers.get(i).wallet);
                                        }
                                        if (k == 7) {

                                            if(customers.get(i).cart1.size()!=0){
                                                if(customers.get(i).cart1.get(0).productID==p1.productID){
                                                    System.out.println(p1.productID + p1.productName);
                                                }
                                                if(customers.get(i).cart1.get(0).productID==p12.productID){
                                                    System.out.println(p12.productID + p12.productName);
                                                }
                                                if(customers.get(i).cart1.get(0).productID==ca.productID){
                                                    System.out.println(ca.productID + ca.productName);
                                                }
                                                float flag = customers.get(i).cart1.get(0).productID;
                                                for(int i5=0;i5<customers.get(i).cart1.size();i5++){
                                                    if(flag!=customers.get(i).cart1.get(i5).productID){
                                                        flag = customers.get(i).cart1.get(i5).productID;
                                                        if(customers.get(i).cart1.get(i5).productID==p1.productID){
                                                            System.out.println(p1.productID + p1.productName);
                                                        }
                                                        if(customers.get(i).cart1.get(i5).productID==p12.productID){
                                                            System.out.println(p12.productID + p12.productName);
                                                        }
                                                        if(customers.get(i).cart1.get(i5).productID==ca.productID){
                                                            System.out.println(ca.productID + ca.productName);
                                                        }
                                                    }
                                                }

                                            }
                                            if(customers.get(i).cart2.size()!=0){
                                                if(customers.get(i).cart2.get(0).productID==p2.productID){
                                                    System.out.println(p2.productID + p2.productName);
                                                }
                                                if(customers.get(i).cart2.get(0).productID==p22.productID){
                                                    System.out.println(p22.productID + p22.productName);
                                                }
                                                if(customers.get(i).cart2.get(0).productID==cat.productID){
                                                    System.out.println(cat.productID + cat.productName);
                                                }
                                                float flag = customers.get(i).cart2.get(0).productID;
                                                for(int i5=0;i5<customers.get(i).cart2.size();i5++){
                                                    if(flag!=customers.get(i).cart2.get(i5).productID){
                                                        flag = customers.get(i).cart2.get(i5).productID;
                                                        if(customers.get(i).cart2.get(i5).productID==p2.productID){
                                                            System.out.println(p2.productID + p2.productName);
                                                        }
                                                        if(customers.get(i).cart2.get(i5).productID==p22.productID){
                                                            System.out.println(p22.productID + p22.productName);
                                                        }
                                                        if(customers.get(i).cart2.get(i5).productID==cat.productID){
                                                            System.out.println(cat.productID + cat.productName);
                                                        }
                                                    }
                                                }

                                            }

                                            if(customers.get(i).cart3.size()!=0){
                                                if(customers.get(i).cart3.get(0).productID==p3.productID){
                                                    System.out.println(p3.productID + p3.productName);
                                                }
                                                if(customers.get(i).cart3.get(0).productID==p32.productID){
                                                    System.out.println(p32.productID + p32.productName);
                                                }
                                                if(customers.get(i).cart3.get(0).productID==cat3.productID){
                                                    System.out.println(cat3.productID + cat3.productName);
                                                }
                                                float flag = customers.get(i).cart3.get(0).productID;
                                                for(int i5=0;i5<customers.get(i).cart3.size();i5++){
                                                    if(flag!=customers.get(i).cart3.get(i5).productID){
                                                        flag = customers.get(i).cart3.get(i5).productID;
                                                        if(customers.get(i).cart3.get(i5).productID==p3.productID){
                                                            System.out.println(p3.productID + p3.productName);
                                                        }
                                                        if(customers.get(i).cart3.get(i5).productID==p32.productID){
                                                            System.out.println(p32.productID + p32.productName);
                                                        }
                                                        if(customers.get(i).cart3.get(i5).productID==cat3.productID){
                                                            System.out.println(cat3.productID + cat3.productName);
                                                        }
                                                    }
                                                }

                                            }


                                        }
                                        if (k == 8) {
                                            int temp1 = 0, temp2= 0, temp3 =0 , temp4 = 0, temp5 = 0, temp6=0,temp7 = 0,temp8 = 0,temp9 = 0;
                                            for(int f = 0;f<customers.get(i).cart1.size();f++) {
                                                if (customers.get(i).cart1.get(f).productID == p1.productID) {
                                                    temp1 += 1;
                                                }
                                                if (customers.get(i).cart1.get(f).productID == p12.productID) {
                                                    temp2 += 1;
                                                }
                                                if (customers.get(i).cart1.get(f).productID == ca.productID) {
                                                    temp3 += 1;
                                                }
                                            }
                                            for(int g=0;g<customers.get(i).cart2.size();g++){

                                                if(customers.get(i).cart2.get(g).productID == p2.productID){
                                                    temp4+=1;
                                                }
                                                if(customers.get(i).cart2.get(g).productID == p22.productID){
                                                    temp5+=1;
                                                }
                                                if(customers.get(i).cart2.get(g).productID == cat.productID){
                                                    temp6+=1;
                                                }
                                            }
                                            for(int y=0;y<customers.get(i).cart3.size();y++){

                                                if(customers.get(i).cart3.get(y).productID == p3.productID){
                                                    temp7+=1;
                                                }
                                                if(customers.get(i).cart3.get(y).productID == p32.productID){
                                                    temp8+=1;
                                                }
                                                if(customers.get(i).cart3.get(y).productID == cat3.productID){
                                                    temp9+=1;
                                                }
                                            }
                                            for(int a1 =0;a1<category1.size();a1++){
                                                if(category1.get(a1).productID ==p1.productID){
                                                    category1.get(a1).quantity +=temp1;
                                                }
                                                if(category1.get(a1).productID ==p12.productID){
                                                    category1.get(a1).quantity +=temp2;
                                                }
                                                if(category1.get(a1).productID ==ca.productID){
                                                    category1.get(a1).quantity +=temp3;
                                                }
                                            }
                                            for(int a2 =0;a2<category2.size();a2++){
                                                if(category2.get(a2).productID ==p2.productID){
                                                    category2.get(a2).quantity +=temp4;
                                                }
                                                if(category2.get(a2).productID ==p22.productID){
                                                    category2.get(a2).quantity +=temp5;
                                                }
                                                if(category2.get(a2).productID ==cat.productID){
                                                    category2.get(a2).quantity +=temp6;
                                                }
                                            }
                                            for(int a3 =0;a3<category3.size();a3++){
                                                if(category3.get(a3).productID ==p3.productID){
                                                    category3.get(a3).quantity +=temp7;
                                                }
                                                if(category3.get(a3).productID ==p32.productID){
                                                    category3.get(a3).quantity +=temp8;
                                                }
                                                if(category3.get(a3).productID ==cat3.productID){
                                                    category3.get(a3).quantity +=temp9;
                                                }
                                            }
                                            customers.get(i).cart1.clear();
                                            customers.get(i).cart2.clear();
                                            customers.get(i).cart3.clear();
                                            System.out.println("Cart Successfully Emptied");
                                        }
                                        if (k == 9) {

                                            if(customers.get(i).cart1.size()==0 && customers.get(i).cart2.size()==0 && customers.get(i).cart3.size()==0 && customers.get(i).cartDeals.size()==0){
                                                System.out.println("Cart is empty");
                                            }
                                            else {
                                                float Total = 0.0F;
                                                float add = 0.0F;
                                                if (customers.get(i).cart1.size() != 0) {
                                                    for (int j = 0; j < customers.get(i).cart1.size(); j++) {
                                                        add += customers.get(i).cart1.get(j).price;
                                                    }
                                                }
                                                if (customers.get(i).cart2.size() != 0) {
                                                    for (int m = 0; m < customers.get(i).cart2.size(); m++) {
                                                        add += customers.get(i).cart2.get(m).price;
                                                    }
                                                }
                                                if (customers.get(i).cart3.size() != 0) {
                                                    for (int l = 0; l < customers.get(i).cart3.size(); l++) {
                                                        add += customers.get(i).cart3.get(l).price;
                                                    }
                                                }

                                                int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0, temp6 = 0, temp7 = 0, temp8 = 0, temp9 = 0;


                                                if (customers.get(i).wallet < add) {
                                                    System.out.println("Insufficient balance!! Please try again");
                                                } else {
                                                    System.out.println("Your order is placed successfully. Details:");
                                                    for (int f = 0; f < customers.get(i).cart1.size(); f++) {
                                                        if (customers.get(i).cart1.get(f).productID == p1.productID) {
                                                            temp1 += 1;
                                                        }
                                                        if (customers.get(i).cart1.get(f).productID == p12.productID) {
                                                            temp2 += 1;
                                                        }
                                                        if (customers.get(i).cart1.get(f).productID == ca.productID) {
                                                            temp3 += 1;
                                                        }
                                                    }
                                                    for (int g = 0; g < customers.get(i).cart2.size(); g++) {

                                                        if (customers.get(i).cart2.get(g).productID == p2.productID) {
                                                            temp4 += 1;
                                                        }
                                                        if (customers.get(i).cart2.get(g).productID == p22.productID) {
                                                            temp5 += 1;
                                                        }
                                                        if (customers.get(i).cart2.get(g).productID == cat.productID) {
                                                            temp6 += 1;
                                                        }
                                                    }
                                                    for (int y = 0; y < customers.get(i).cart3.size(); y++) {

                                                        if (customers.get(i).cart3.get(y).productID == p3.productID) {
                                                            temp7 += 1;
                                                        }
                                                        if (customers.get(i).cart3.get(y).productID == p32.productID) {
                                                            temp8 += 1;
                                                        }
                                                        if (customers.get(i).cart3.get(y).productID == cat3.productID) {
                                                            temp9 += 1;
                                                        }
                                                    }


                                                    if (customers.get(i).cart1.size() != 0) {
                                                        float temp = customers.get(i).cart1.get(0).productID;
                                                        if (ca.productID == customers.get(i).cart1.get(0).productID) {
                                                            ca.PrintCategory1();
                                                            System.out.println("Total Price for given quantity: "+(temp3*ca.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getNormal();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp3 * p1.price) - (p * temp3 * ca.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getElite();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp3 * ca.price) - (Math.max(p, 10) * temp3 * ca.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp3 * ca.price) + " " + (Math.max(p, 10) * temp3 * ca.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp3 * ca.price) - (Math.max(temp12, p) * temp3 * ca.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp3 * ca.price) + " " + (Math.max(temp12, p) * temp3 * ca.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        q = admin.get(s).getPrime();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp3 * ca.price) - (Math.max(temp12, q) * temp3 * ca.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp3 * ca.price) + " " + (Math.max(temp12, q) * temp3 * ca.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp3 * ca.price) - (Math.max(q, 5) * temp3 * ca.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp3 * ca.price) + " " + (Math.max(q, 5) * temp3 * ca.price / 100));
                                                                }

                                                            }


                                                        }
                                                        if (p1.productID == customers.get(i).cart1.get(0).productID) {
                                                            p1.PrintCategory1();
                                                            p1.printproduct1_1();
                                                            System.out.println("Total Price for given quantity: "+(temp1*p1.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getNormal();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp1 * p1.price) - (p * temp1 * p1.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getElite();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp1 * p1.price) - (Math.max(p, 10) * temp1 * p1.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp1 * p1.price) + " " + (Math.max(p, 10) * temp1 * p1.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp1 * p1.price) - (Math.max(temp12, p) * temp1 * p1.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp1 * p1.price) + " " + (Math.max(temp12, p) * temp1 * p1.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        q = admin.get(s).getPrime();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp1 * p1.price) - (Math.max(temp12, q) * temp1 * p1.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp1 * p1.price) + " " + (Math.max(temp12, q) * temp1 * p1.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp1 * p1.price) - (Math.max(q, 5) * temp1 * p1.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp1 * p1.price) + " " + (Math.max(q, 5) * temp1 * p1.price / 100));
                                                                }

                                                            }

                                                        }
                                                        if (p12.productID == customers.get(i).cart1.get(0).productID) {
                                                            p12.PrintCategory1();
                                                            p12.printproduct1_2();
                                                            System.out.println("Total Price for given quantity: "+(temp2*p12.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getNormal();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp2 * p12.price) - (p * temp2 * p12.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getElite();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp2 * p12.price) - (Math.max(p, 10) * temp2 * p12.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp2 * p12.price) + " " + (Math.max(p, 10) * temp2 * p12.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp2 * p12.price) - (Math.max(temp12, p) * temp2 * p12.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp2 * p12.price) + " " + (Math.max(temp12, p) * temp2 * p12.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart1.get(0).productID == admin.get(s).getProductID()) {
                                                                        q = admin.get(s).getPrime();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp2 * p12.price) - (Math.max(temp12, q) * temp2 * p12.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp2 * p12.price) + " " + (Math.max(temp12, q) * temp2 * p12.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp2 * p12.price) - (Math.max(q, 5) * temp2 * p12.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp2 * p12.price) + " " + (Math.max(q, 5) * temp2 * p12.price / 100));
                                                                }

                                                            }


                                                        }
                                                        for (int p = 1; p < customers.get(i).cart1.size(); p++) {
                                                            if (temp != customers.get(i).cart1.get(p).productID) {
                                                                temp = customers.get(i).cart1.get(p).productID;
                                                                if (customers.get(i).cart1.get(p).productID == ca.productID) {
                                                                    ca.PrintCategory1();
                                                                    System.out.println("Total Price for given quantity: "+(temp3*ca.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float P = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                P = admin.get(s).getNormal();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp3 * p1.price) - (p * temp3 * ca.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float P = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                P = admin.get(s).getElite();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp3 * ca.price) - (Math.max(P, 10) * temp3 * ca.price / 100);
                                                                            System.out.println("Discount: " + Math.max(P, 10) + "% of " + (temp3 * ca.price) + " " + (Math.max(P, 10) * temp3 * ca.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp3 * ca.price) - (Math.max(temp12, p) * temp3 * ca.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp3 * ca.price) + " " + (Math.max(temp12, p) * temp3 * ca.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                q = admin.get(s).getPrime();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp3 * ca.price) - (Math.max(temp12, q) * temp3 * ca.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp3 * ca.price) + " " + (Math.max(temp12, q) * temp3 * ca.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp3 * ca.price) - (Math.max(q, 5) * temp3 * ca.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp3 * ca.price) + " " + (Math.max(q, 5) * temp3 * ca.price / 100));
                                                                        }

                                                                    }
                                                                }
                                                                if (customers.get(i).cart1.get(p).productID == p1.productID) {
                                                                    p1.PrintCategory1();
                                                                    p1.printproduct1_1();
                                                                    System.out.println("Total Price for given quantity: "+(temp1*p1.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float P = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                P = admin.get(s).getNormal();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp1 * p1.price) - (p * temp1 * p1.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float P = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                P = admin.get(s).getElite();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp1 * p1.price) - (Math.max(P, 10) * temp1 * p1.price / 100);
                                                                            System.out.println("Discount: " + Math.max(P, 10) + "% of " + (temp1 * p1.price) + " " + (Math.max(P, 10) * temp1 * p1.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp1 * p1.price) - (Math.max(temp12, p) * temp1 * p1.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp1 * p1.price) + " " + (Math.max(temp12, p) * temp1 * p1.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                q = admin.get(s).getPrime();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp1 * p1.price) - (Math.max(temp12, q) * temp1 * p1.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp1 * p1.price) + " " + (Math.max(temp12, q) * temp1 * p1.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp1 * p1.price) - (Math.max(q, 5) * temp1 * p1.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp1 * p1.price) + " " + (Math.max(q, 5) * temp1 * p1.price / 100));
                                                                        }
                                                                    }
                                                                }
                                                                if (p12.productID == customers.get(i).cart1.get(p).productID) {
                                                                    p12.PrintCategory1();
                                                                    p12.printproduct1_2();
                                                                    System.out.println("Total Price for given quantity: "+(temp2*p12.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float P = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                P = admin.get(s).getNormal();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp2 * p12.price) - (p * temp2 * p12.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float P = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                P = admin.get(s).getElite();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp2 * p12.price) - (Math.max(P, 10) * temp2 * p12.price / 100);
                                                                            System.out.println("Discount: " + Math.max(P, 10) + "% of " + (temp2 * p12.price) + " " + (Math.max(P, 10) * temp2 * p12.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp2 * p12.price) - (Math.max(temp12, p) * temp2 * p12.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp2 * p12.price) + " " + (Math.max(temp12, p) * temp2 * p12.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        for (int s = 0; s < admin.size(); s++) {
                                                                            if (customers.get(i).cart1.get(p).productID == admin.get(s).getProductID()) {
                                                                                q = admin.get(s).getPrime();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp2 * p12.price) - (Math.max(temp12, q) * temp2 * p12.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp2 * p12.price) + " " + (Math.max(temp12, q) * temp2 * p12.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp2 * p12.price) - (Math.max(q, 5) * temp2 * p12.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp2 * p12.price) + " " + (Math.max(q, 5) * temp2 * p12.price / 100));
                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }
                                                    }

                                                    if (customers.get(i).cart2.size() != 0) {
                                                        float temp10 = customers.get(i).cart2.get(0).productID;
                                                        if (cat.productID == customers.get(i).cart2.get(0).productID) {
                                                            cat.PrintCategory2();
                                                            System.out.println("Total Price for given quantity: "+(temp6*cat.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getNormal();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp6 * cat.price) - (p * temp6 * cat.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                for (int s = 0; s < admin.size(); s++) {
                                                                    if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                        p = admin.get(s).getElite();
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp6 * cat.price) - (Math.max(p, 10) * temp6 * cat.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp6 * cat.price) + " " + (Math.max(p, 10) * temp6 * cat.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp6 * cat.price) - (Math.max(temp12, p) * temp6 * cat.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp6 * cat.price) + " " + (Math.max(temp12, p) * temp6 * cat.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            q = admin.get(s).getPrime();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp6 * cat.price) - (Math.max(temp12, q) * temp6 * cat.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp6 * cat.price) + " " + (Math.max(temp12, q) * temp6 * cat.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp6 * cat.price) - (Math.max(q, 5) * temp6 * cat.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp6 * cat.price) + " " + (Math.max(q, 5) * temp6 * cat.price / 100));
                                                                }

                                                            }
                                                        }
                                                        if (p2.productID == customers.get(i).cart2.get(0).productID) {
                                                            p2.PrintCategory2();
                                                            p2.printproduct2_1();
                                                            System.out.println("Total Price for given quantity: "+(temp4*p2.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getNormal();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp4 * p2.price) - (p * temp4 * p2.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getElite();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp4 * p2.price) - (Math.max(p, 10) * temp4 * p2.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp4 * p2.price) + " " + (Math.max(p, 10) * temp4 * p2.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp4 * p2.price) - (Math.max(temp12, p) * temp4 * p2.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp4 * p2.price) + " " + (Math.max(temp12, p) * temp4 * p2.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            q = admin.get(s).getPrime();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp4 * p2.price) - (Math.max(temp12, q) * temp4 * p2.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp4 * p2.price) + " " + (Math.max(temp12, q) * temp4 * p2.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp4 * p2.price) - (Math.max(q, 5) * temp4 * p2.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp4 * p2.price) + " " + (Math.max(q, 5) * temp4 * p2.price / 100));
                                                                }

                                                            }
                                                        }
                                                        if (p22.productID == customers.get(i).cart2.get(0).productID) {
                                                            p22.PrintCategory2();
                                                            p22.printproduct2_2();
                                                            System.out.println("Total Price for given quantity: "+(temp5*p22.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getNormal();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp5 * p22.price) - (p * temp5 * p22.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getElite();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp5 * p22.price) - (Math.max(p, 10) * temp5 * p22.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp5 * p22.price) + " " + (Math.max(p, 10) * temp5 * p22.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp5 * p22.price) - (Math.max(temp12, p) * temp5 * p22.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp5 * p22.price) + " " + (Math.max(temp12, p) * temp5 * p22.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart2.get(0).productID == admin.get(s).getProductID()) {
                                                                            q = admin.get(s).getPrime();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp5 * p22.price) - (Math.max(temp12, q) * temp5 * p22.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp5 * p22.price) + " " + (Math.max(temp12, q) * temp5 * p22.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp5 * p22.price) - (Math.max(q, 5) * temp5 * p22.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp5 * p22.price) + " " + (Math.max(q, 5) * temp5 * p22.price / 100));
                                                                }

                                                            }
                                                        }
                                                        for (int r = 1; r < customers.get(i).cart2.size(); r++) {
                                                            if (temp10 != customers.get(i).cart2.get(r).productID) {
                                                                temp10 = customers.get(i).cart2.get(r).productID;
                                                                if (customers.get(i).cart2.get(r).productID == cat.productID) {
                                                                    cat.PrintCategory2();
                                                                    System.out.println("Total Price for given quantity: "+(temp6*cat.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float p = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    p = admin.get(s).getNormal();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp6 * cat.price) - (p * temp6 * cat.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float p = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    p = admin.get(s).getElite();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp6 * cat.price) - (Math.max(p, 10) * temp6 * cat.price / 100);
                                                                            System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp6 * cat.price) + " " + (Math.max(p, 10) * temp6 * cat.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp6 * cat.price) - (Math.max(temp12, p) * temp6 * cat.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp6 * cat.price) + " " + (Math.max(temp12, p) * temp6 * cat.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    q = admin.get(s).getPrime();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp6 * cat.price) - (Math.max(temp12, q) * temp6 * cat.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp6 * cat.price) + " " + (Math.max(temp12, q) * temp6 * cat.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp6 * cat.price) - (Math.max(q, 5) * temp6 * cat.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp6 * cat.price) + " " + (Math.max(q, 5) * temp6 * cat.price / 100));
                                                                        }

                                                                    }
                                                                }
                                                                if (customers.get(i).cart2.get(r).productID == p2.productID) {
                                                                    p2.PrintCategory2();
                                                                    p2.printproduct2_1();
                                                                    System.out.println("Total Price for given quantity: "+(temp4*p2.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float p = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    p = admin.get(s).getNormal();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp4 * p2.price) - (p * temp4 * p2.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float p = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    p = admin.get(s).getElite();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp4 * p2.price) - (Math.max(p, 10) * temp4 * p2.price / 100);
                                                                            System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp4 * p2.price) + " " + (Math.max(p, 10) * temp4 * p2.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp4 * p2.price) - (Math.max(temp12, p) * temp4 * p2.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp4 * p2.price) + " " + (Math.max(temp12, p) * temp4 * p2.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    q = admin.get(s).getPrime();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp4 * p2.price) - (Math.max(temp12, q) * temp4 * p2.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp4 * p2.price) + " " + (Math.max(temp12, q) * temp4 * p2.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp4 * p2.price) - (Math.max(q, 5) * temp4 * p2.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp4 * p2.price) + " " + (Math.max(q, 5) * temp4 * p2.price / 100));
                                                                        }
                                                                    }
                                                                }
                                                                if (p22.productID == customers.get(i).cart2.get(r).productID) {
                                                                    p22.PrintCategory2();
                                                                    p22.printproduct2_2();
                                                                    System.out.println("Total Price for given quantity: "+(temp5*p22.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float p = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    p = admin.get(s).getNormal();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp5 * p22.price) - (p * temp5 * p22.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float p = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    p = admin.get(s).getElite();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp5 * p22.price) - (Math.max(p, 10) * temp5 * p22.price / 100);
                                                                            System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp5 * p22.price) + " " + (Math.max(p, 10) * temp5 * p22.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp5 * p22.price) - (Math.max(temp12, p) * temp5 * p22.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp5 * p22.price) + " " + (Math.max(temp12, p) * temp5 * p22.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        if (admin.size() != 0) {
                                                                            for (int s = 0; s < admin.size(); s++) {
                                                                                if (customers.get(i).cart2.get(r).productID == admin.get(s).getProductID()) {
                                                                                    q = admin.get(s).getPrime();
                                                                                }
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp5 * p22.price) - (Math.max(temp12, q) * temp5 * p22.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp5 * p22.price) + " " + (Math.max(temp12, q) * temp5 * p22.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp5 * p22.price) - (Math.max(q, 5) * temp5 * p22.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp5 * p22.price) + " " + (Math.max(q, 5) * temp5 * p22.price / 100));
                                                                        }

                                                                    }

                                                                }

                                                            }

                                                        }

                                                    }

                                                    if (customers.get(i).cart3.size() != 0) {
                                                        float temp20 = customers.get(i).cart3.get(0).productID;
                                                        if (cat3.productID == customers.get(i).cart3.get(0).productID) {
                                                            cat3.PrintCategory3();
                                                            System.out.println("Total Price for given quantity: "+(temp9*cat3.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getNormal();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp9 * cat3.price) - (p * temp9 * cat3.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getElite();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp9 * cat3.price) - (Math.max(p, 10) * temp9 * cat3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp9 * cat3.price) + " " + (Math.max(p, 10) * temp9 * cat3.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp9 * cat3.price) - (Math.max(temp12, p) * temp9 * cat3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp9 * cat3.price) + " " + (Math.max(temp12, p) * temp9 * cat3.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            q = admin.get(s).getPrime();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp9 * cat3.price) - (Math.max(temp12, q) * temp9 * cat3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp9 * cat3.price) + " " + (Math.max(temp12, q) * temp9 * cat3.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp9 * cat3.price) - (Math.max(q, 5) * temp9 * cat3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp9 * cat3.price) + " " + (Math.max(q, 5) * temp9 * cat3.price / 100));
                                                                }

                                                            }


                                                        }
                                                        if (p3.productID == customers.get(i).cart3.get(0).productID) {
                                                            p3.PrintCategory3();
                                                            p3.printproduct3_1();
                                                            System.out.println("Total Price for given quantity: "+(temp7*p3.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getNormal();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp7 * p3.price) - (p * temp7 * p3.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {
                                                                        if (customers.get(i).cart3.size() != 0) {
                                                                            if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                                p = admin.get(s).getElite();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp7 * p3.price) - (Math.max(p, 10) * temp7 * p3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp7 * p3.price) + " " + (Math.max(p, 10) * temp7 * p3.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp7 * p3.price) - (Math.max(temp12, p) * temp7 * p3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp7 * p3.price) + " " + (Math.max(temp12, p) * temp7 * p3.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {

                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            q = admin.get(s).getPrime();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp7 * p3.price) - (Math.max(temp12, q) * temp7 * p3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp7 * p3.price) + " " + (Math.max(temp12, q) * temp7 * p3.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp7 * p3.price) - (Math.max(q, 5) * temp7 * p3.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp7 * p3.price) + " " + (Math.max(q, 5) * temp7 * p3.price / 100));
                                                                }

                                                            }

                                                        }
                                                        if (p32.productID == customers.get(i).cart3.get(0).productID) {
                                                            p32.PrintCategory3();
                                                            p32.printproduct3_2();
                                                            System.out.println("Total Price for given quantity: "+(temp8*p32.price));
                                                            if (customers.get(i).Status().equals("NORMAL")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {

                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getNormal();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                Total += (temp8 * p32.price) - (p * temp8 * p32.price / 100);
                                                            }
                                                            if (customers.get(i).Status().equals("ELITE")) {
                                                                float p = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {

                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            p = admin.get(s).getElite();
                                                                        }
                                                                    }

                                                                }
                                                                System.out.println("Delivery Charges: Rs 100");
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp8 * p32.price) - (Math.max(p, 10) * temp8 * p32.price / 100);
                                                                    System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp8 * p32.price) + " " + (Math.max(p, 10) * temp8 * p32.price / 100));
                                                                }
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(10, temp11);
                                                                    Total += (temp8 * p32.price) - (Math.max(temp12, p) * temp8 * p32.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp8 * p32.price) + " " + (Math.max(temp12, p) * temp8 * p32.price / 100));
                                                                }
                                                            }
                                                            if (customers.get(i).Status().equals("PRIME")) {
                                                                float q = 0.0F;
                                                                if (admin.size() != 0) {
                                                                    for (int s = 0; s < admin.size(); s++) {

                                                                        if (customers.get(i).cart3.get(0).productID == admin.get(s).getProductID()) {
                                                                            q = admin.get(s).getPrime();
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                if (!customers.get(i).c.isEmpty()) {
                                                                    float temp11 = Collections.max(customers.get(i).c);
                                                                    float temp12 = Math.max(5, temp11);
                                                                    Total += (temp8 * p32.price) - (Math.max(temp12, q) * temp8 * p32.price / 100);
                                                                    System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp8 * p32.price) + " " + (Math.max(temp12, q) * temp8 * p32.price / 100));
                                                                }
                                                                if (customers.get(i).c.isEmpty()) {
                                                                    Total += (temp8 * p32.price) - (Math.max(q, 5) * temp8 * p32.price / 100);
                                                                    System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp8 * p32.price) + " " + (Math.max(q, 5) * temp8 * p32.price / 100));
                                                                }

                                                            }

                                                        }
                                                        for (int s = 1; s < customers.get(i).cart3.size(); s++) {
                                                            if (temp20 != customers.get(i).cart3.get(s).productID) {
                                                                temp20 = customers.get(i).cart3.get(s).productID;
                                                                if (customers.get(i).cart3.get(s).productID == cat3.productID) {
                                                                    cat3.PrintCategory3();
                                                                    System.out.println("Total Price for given quantity: "+(temp9*cat3.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float p = 0.0F;

                                                                        for (int k2 = 0; k2 < admin.size(); k2++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k2).getProductID()) {
                                                                                p = admin.get(k2).getNormal();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp9 * cat3.price) - (p * temp9 * cat3.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float p = 0.0F;
                                                                        for (int k3 = 0; k3 < admin.size(); k3++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k3).getProductID()) {
                                                                                p = admin.get(k3).getElite();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp9 * cat3.price) - (Math.max(p, 10) * temp9 * cat3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp9 * cat3.price) + " " + (Math.max(p, 10) * temp9 * cat3.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp9 * cat3.price) - (Math.max(temp12, p) * temp9 * cat3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp9 * cat3.price) + " " + (Math.max(temp12, p) * temp9 * cat3.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        for (int k4 = 0; k4 < admin.size(); k4++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k4).getProductID()) {
                                                                                q = admin.get(k4).getPrime();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp9 * cat3.price) - (Math.max(temp12, q) * temp9 * cat3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp9 * cat3.price) + " " + (Math.max(temp12, q) * temp9 * cat3.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp9 * cat3.price) - (Math.max(q, 5) * temp9 * cat3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp9 * cat3.price) + " " + (Math.max(q, 5) * temp9 * cat3.price / 100));
                                                                        }

                                                                    }
                                                                }
                                                                if (customers.get(i).cart3.get(s).productID == p3.productID) {
                                                                    p3.PrintCategory3();
                                                                    p3.printproduct3_1();
                                                                    System.out.println("Total Price for given quantity: "+(temp7*p3.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float p = 0.0F;
                                                                        for (int k1 = 0; k1 < admin.size(); k1++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k1).getProductID()) {
                                                                                p = admin.get(k1).getNormal();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp7 * p3.price) - (p * temp7 * p3.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float p = 0.0F;
                                                                        for (int k5 = 0; k5 < admin.size(); k5++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k5).getProductID()) {
                                                                                p = admin.get(k5).getElite();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp7 * p3.price) - (Math.max(p, 10) * temp7 * p3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp7 * p3.price) + " " + (Math.max(p, 10) * temp7 * p3.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp7 * p3.price) - (Math.max(temp12, p) * temp7 * p3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp7 * p3.price) + " " + (Math.max(temp12, p) * temp7 * p3.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        for (int k6 = 0; k6 < admin.size(); k6++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k6).getProductID()) {
                                                                                q = admin.get(k6).getPrime();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp7 * p3.price) - (Math.max(temp12, q) * temp7 * p3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, q) + "% of " + (temp7 * p3.price) + " " + (Math.max(temp12, q) * temp7 * p3.price / 100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp7 * p3.price) - (Math.max(q, 5) * temp7 * p3.price / 100);
                                                                            System.out.println("Discount: " + Math.max(q, 5) + "% of " + (temp7 * p3.price) + " " + (Math.max(q, 5) * temp7 * p3.price / 100));
                                                                        }
                                                                    }

                                                                }
                                                                if (p32.productID == customers.get(i).cart1.get(s).productID) {
                                                                    p32.PrintCategory3();
                                                                    p32.printproduct3_2();
                                                                    System.out.println("Total Price for given quantity: "+(temp8*p32.price));
                                                                    if (customers.get(i).Status().equals("NORMAL")) {
                                                                        float p = 0.0F;
                                                                        for (int k8 = 0; k8 < admin.size(); k8++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k8).getProductID()) {
                                                                                p = admin.get(k8).getNormal();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (100 + ((5 * add) / 100)));
                                                                        Total += (temp8 * p32.price) - (p * temp8 * p32.price / 100);
                                                                    }
                                                                    if (customers.get(i).Status().equals("ELITE")) {
                                                                        float p = 0.0F;
                                                                        for (int k9 = 0; k9 < admin.size(); k9++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k9).getProductID()) {
                                                                                p = admin.get(k9).getElite();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs 100");
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp8 * p32.price) - (Math.max(p, 10) * temp8 * p32.price / 100);
                                                                            System.out.println("Discount: " + Math.max(p, 10) + "% of " + (temp8 * p32.price) + " " + (Math.max(p, 10) * temp8 * p32.price / 100));
                                                                        }
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(10, temp11);
                                                                            Total += (temp8 * p32.price) - (Math.max(temp12, p) * temp8 * p32.price / 100);
                                                                            System.out.println("Discount: " + Math.max(temp12, p) + "% of " + (temp8 * p32.price) + " " + (Math.max(temp12, p) * temp8 * p32.price / 100));
                                                                        }
                                                                    }
                                                                    if (customers.get(i).Status().equals("PRIME")) {
                                                                        float q = 0.0F;
                                                                        for (int k10 = 0; k10 < admin.size(); k10++) {
                                                                            if (customers.get(i).cart3.get(s).productID == admin.get(k10).getProductID()) {
                                                                                q = admin.get(k10).getPrime();
                                                                            }
                                                                        }
                                                                        System.out.println("Delivery Charges: Rs " + (((2 * add) / 100) + 100));
                                                                        if (!customers.get(i).c.isEmpty()) {
                                                                            float temp11 = Collections.max(customers.get(i).c);
                                                                            float temp12 = Math.max(5, temp11);
                                                                            Total += (temp8 * p32.price) - (Math.max(temp12, q) * temp8 * p32.price / 100);
                                                                            System.out.println("Discount: "+Math.max(temp12, q)+"% of "+(temp8*p32.price)+" "+(Math.max(temp12, q)*temp8*p32.price/100));
                                                                        }
                                                                        if (customers.get(i).c.isEmpty()) {
                                                                            Total += (temp8 * p32.price) - (Math.max(q, 5) * temp8 * p32.price / 100);
                                                                            System.out.println("Discount: "+Math.max(q, 5)+"% of "+(temp8 * p32.price)+" "+(Math.max(q, 5)*temp8*p32.price/100));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }

                                                    if (customers.get(i).status.equals("ELITE")) {
                                                        if(!(customers.get(i).cartDeals.isEmpty())){
                                                            System.out.println("Purchased Deals: ");
                                                            for(int x = 0;x<customers.get(i).cartDeals.size();x++){

                                                                System.out.println(customers.get(i).cartDeals.get(x).getProductID1()+" & "+customers.get(i).cartDeals.get(x).getProductID2());

                                                                Total += customers.get(i).cartDeals.get(x).getCombinedPrice1();
                                                            }
                                                        }

                                                        System.out.println("Total cost: Rs " + (Total + 100));
                                                        System.out.println("Your order will be delivered within 1-2 days");
                                                        if ((Total + 100) >= 5000) {

                                                            int r1 = random.nextInt(5, 15);
                                                            int r2 = random.nextInt(5, 15);
                                                            int r3 = random.nextInt(5, 15);
                                                            int r4 = random.nextInt(5, 15);
                                                            customers.get(i).c.add(r1);
                                                            customers.get(i).c.add(r2);
                                                            customers.get(i).c.add(r3);
                                                            customers.get(i).c.add(r4);

                                                            System.out.println("You have won four coupons of "+r1+"% and "+r2+"% and "+ r3+"% and "+ r4+"% discount. Congratulations!!");
                                                        }
                                                        customers.get(i).wallet -= (100+Total);
                                                    }
                                                    if (customers.get(i).status.equals("PRIME")) {
                                                        if(!(customers.get(i).cartDeals.isEmpty())){
                                                            System.out.println("Purchased Deals: ");
                                                            for(int x = 0;x<customers.get(i).cartDeals.size();x++){

                                                                System.out.println(customers.get(i).cartDeals.get(x).getProductID1()+" & "+customers.get(i).cartDeals.get(x).getProductID2());

                                                                Total += customers.get(i).cartDeals.get(x).getCombinedPrice2();
                                                            }
                                                        }

                                                        System.out.println("Total cost: Rs " + ((2 * add) / 100 + (Total + 100)));
                                                        System.out.println("Your order will be delivered within 3-6 days");
                                                        if ((((2 * add) / 100) + (Total + 100)) >= 5000) {

                                                            int r1 = random.nextInt(5, 15);
                                                            customers.get(i).c.add(r1);
                                                            int r2 = random.nextInt(5, 15);
                                                            customers.get(i).c.add(r2);
                                                            System.out.println("You have won two coupons of " + r1 + "% and " + r2 + "% discount. Congratulations!!");

                                                        }

                                                        customers.get(i).wallet -=(((2 * add)/100) +(100+Total));
                                                    }
                                                    if (customers.get(i).status.equals("NORMAL")) {
                                                        if(!(customers.get(i).cartDeals.isEmpty())){
                                                            System.out.println("Purchased Deals: ");
                                                            for(int x = 0;x<customers.get(i).cartDeals.size();x++){

                                                                System.out.println(customers.get(i).cartDeals.get(x).getProductID1()+" & "+customers.get(i).cartDeals.get(x).getProductID2());

                                                                Total += customers.get(i).cartDeals.get(x).getCombinedPrice3();
                                                            }
                                                        }
                                                        System.out.println("Total cost: Rs " + ((5 * add) / 100 + (Total + 100)));
                                                        System.out.println("Your order will be delivered within 7-10 days");
                                                        customers.get(i).wallet -=(((5 * add) /100) +(100+Total));
                                                    }

                                                    customers.get(i).cart1.clear();
                                                    customers.get(i).cart2.clear();
                                                    customers.get(i).cart3.clear();
                                                }
                                            }}
                                        if (k == 10) {
                                            for (int j = 0; j < customers.size(); j++) {
                                                if (customers.get(j).Name().equals(name) && customers.get(j).Password().equals(password)) {
                                                    System.out.println("Current Status: " + customers.get(j).status);
                                                    System.out.println();
                                                    System.out.println("Choose new status: ");
                                                    String status = in.next();
                                                    customers.get(j).UpgradeStatus(status);
                                                    System.out.println();
                                                    System.out.println("Status updated to " + status);
                                                    if (Objects.equals(status, "ELITE")) {
                                                        customers.get(j).EliteWallet();
                                                    }
                                                    if (Objects.equals(status, "PRIME")) {
                                                        customers.get(j).PrimeWallet();

                                                    }
                                                }
                                            }
                                        }
                                        if (k == 11) {
                                            System.out.println("Enter the amount you want to add to your wallet:");
                                            float amount = in.nextFloat();
                                            customers.get(i).wallet +=amount;
                                            System.out.println("Amount successfully added");

                                        }
                                        if (k >= 12) {
                                            System.out.println("Bye " + name + "!!");
                                            break;
                                        }
                                    }
                                    checker+=1;
                                }
                            }
                            if(checker==0){
                                System.out.println();
                                System.out.println("please sign up before login or if signed up already than please enter name/password correctly");
                            }
                        }
                    }
                    if (c >= 3) {
                        break;
                    }
                }
            }
            if(a>=5){
                break;
            }
        }
    }
}


class Category1 {
    String categoryName;
    int categoryID;

    String productName;
    float productID;
    float price;
    int quantity;


    public void AddCategory1(int categoryID , String categoryName ){
        this.categoryID= categoryID;
        this.categoryName= categoryName;
    }

    public void AddaProduct1(String productName ,float productID,float price, int quantity ){

        this. productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;

    }

    public void PrintCategory1(){
        System.out.println("Product Name: "+productName);
        System.out.println("ProductID: "+productID);
        System.out.println("Price: "+price);
    }


}

class Product1_1 extends Category1{

    float capacity;
    float power_consumption;

    public void AddProduct1_1(float capacity,float power_consumption){
        this.capacity = capacity;
        this.power_consumption = power_consumption;
    }

    public void printproduct1_1(){
        System.out.println("Capacity: "+capacity);
        System.out.println("Power consumption: "+power_consumption);

    }


}

class product1_2 extends Category1{

    String color;

    public void AddProduct1_2(String color){
        this.color = color;
    }

    public void printproduct1_2(){
        System.out.println("Color: "+color);
    }

}

class Category2{

    int categoryID;
    String categoryName;
    String productName;
    float productID;
    float price;
    int quantity;

    public void AddCategory2(int categoryID ,String categoryName ){

        this.categoryID = categoryID;
        this.categoryName = categoryName;

    }

    public void AddaProduct2(String productName, float productID,float price,int quantity){
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public void PrintCategory2(){
        System.out.println("Product Name: "+productName);
        System.out.println("ProductID: "+productID);
        System.out.println("Price: "+price);
    }

}

class Product2_1 extends Category2{

    String operating_system;
    int storage_capacity;
    int RAM;

    public  void AddProduct2_1(String operating_system,int storage_capacity,int RAM){

        this.operating_system = operating_system;
        this.storage_capacity = storage_capacity;
        this.RAM = RAM;

    }

    public void printproduct2_1(){

        System.out.println("Operating system: "+operating_system);
        System.out.println("Storage capacity: "+storage_capacity);
        System.out.println("RAM: "+RAM);
    }
}

class Product2_2 extends Category2{

    float powerUsage;

    public  void AddProduct2_2(float powerUsage){
        this.powerUsage = powerUsage;

    }

    public void printproduct2_2(){

        System.out.println("Power Usage: "+powerUsage);
    }
}


class Category3{

    int categoryID;
    String categoryName;
    String productName;
    float productID;
    float price;
    float time_sufficient;
    int quantity;

    public void AddCategory3(int categoryID , String categoryName ){
        this.categoryID= categoryID;
        this.categoryName= categoryName;
    }

    public void AddaProduct3(String productName ,float productID,float price,float time_sufficient ,int quantity){

        this. productName = productName;
        this.productID = productID;
        this.price = price;
        this.time_sufficient = time_sufficient;
        this.quantity = quantity;

    }
    public void PrintCategory3(){
        System.out.println("Product Name: "+productName);
        System.out.println("ProductID: "+productID);
        System.out.println("Price: "+price);
        System.out.println("Time Sufficient: "+time_sufficient);
    }



}

class Product3_1 extends Category3{

    String items;
    int serves;


    public void AddProduct3_1(String items,int serves){
        this.items = items;
        this.serves = serves;
    }

    public void printproduct3_1(){

        System.out.println("Items: "+items);
        System.out.println("Serves: "+serves);
    }

}

class Product3_2 extends Category3{

    float quantityinkg;

    public void AddProduct3_2(float quantityinkg){
        this.quantityinkg = quantityinkg;
    }

    public void printproduct3_2(){
        System.out.println("quantityinkg: "+quantityinkg);
    }


}

