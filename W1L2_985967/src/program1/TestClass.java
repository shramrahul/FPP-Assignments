package program1;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TestClass {
    public static void main(String[] args){

         //first customer
         Customer cust1= new Customer("Shreeram","Chaulagain","123456789");
         Address billingAddressOfCustomer1=new Address("104 xyz","xyz","Chicago","2345");
         cust1.setBillingAddress(billingAddressOfCustomer1);
         Address shippingAddressOfCustomer1=new Address("102 def","qwe","Arizona","43567");
         cust1.setShippingAddress(shippingAddressOfCustomer1);

         //Second customer
         Customer cust2= new Customer("David","Luios","987654321");
         Address billingAddressOfCustomer2=new Address("104 abc","abc","Chicago","9876");
         cust2.setBillingAddress(billingAddressOfCustomer2);
         Address shippingAddressOfCustomer2=new Address("105 tgd","edf","Florida","542345");
         cust2.setShippingAddress(shippingAddressOfCustomer2);

         //third Customer
         Customer cust3= new Customer("Homer","Putin","98765432100098");
         Address billingAddressOfCustomer3=new Address("104 pqr","fairfield","Iowa","56543");
         cust3.setBillingAddress(billingAddressOfCustomer3);
         Address shippingAddressOfCustomer3=new Address("104 ret","ret","California","5672345");
         cust3.setShippingAddress(shippingAddressOfCustomer3);

         Customer[] customers={cust1,cust2,cust3};

         System.out.println("Customers with billing address to Chicago are as follows : \n ");

         for(Customer customer: customers){
            String billingAddress=customer.getBillingAddress().getState();
            if(billingAddress.equalsIgnoreCase("Chicago")){
                System.out.println(customer.toString());
            }
        }
    }
}

/*
* output
*
*
* Customers with billing address to Chicago are as follows :

 [ Shreeram, Chaulagain, ssn: 123456789]
 [ David, Luios, ssn: 987654321]
*/
