package chain;

import java.util.Scanner;

public class SupplyChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome To Supply Chain Company"
                + "\n We provides Services for Supply Chain"
                + "\n We are here to Assist You");
        
        System.out.println("Please Select The Service You want");
        System.out.println("We Provides:");
        System.out.println("1) Marketing"
                + "\n 2) Delivery "
                + "\n 3) Finance Management");
        
        System.out.println("Enter the Number of Your Choice e.g 1 for Marketing");
        
        Scanner a = new Scanner(System.in);
        
        Scanner b = new Scanner(System.in);
        int choice = a.nextInt();
        
        if(choice==1){
            
            
            Marketing ser= new Marketing();
            
            System.out.println("You Have Selected Marketing");
            
            ser.setName("Marketing");
            
            
            System.out.println("Enter Years");
            
            int years = a.nextInt();
            
            ser.setYears(years);
            
            System.out.println("Enter Your Company Name:");
            
            String name = b.nextLine();
            
            Company company = new Company();
            
            company.setName(name);
            
            System.out.println("Enter Your Company Head Office: ");
            
            String head =  b.nextLine();
            
            company.setHead_Office(head);
            ser.setCompany(company);
            
            String cities[] = {""};
            
            System.out.println("Enter Cities: ");
            System.out.println("In How Many Cities You want Services: ");
            
            int c = a.nextInt();
            
            for(int i=0; i<c; i++){
                
                System.out.println("Enter City Name "+i+1);
                String city = b.nextLine();
                city = cities[i];
                
            }
            ser.setDistributed_Area(cities);
            System.out.println("Now For Office Use: ");
            
            System.out.println("Enter Package Price: ");
            
            int price =  a.nextInt();
            
            ser.setPrice_Per_Anum(price);
            
            System.out.println("Your Bill is : "+ser.PriceOfPackage(price,years));

            
            ser.display_Factory_Provided_Services();
        }
        
        
        if(choice==2){
            
            
            Delivery ser= new Delivery();
            
            System.out.println("You Have Selected Delivery");
            
            ser.setName("Delivery");
            
            
            System.out.println("Enter Years");
            
            int years = a.nextInt();
            
            ser.setYears(years);
            
            System.out.println("Enter Your Company Name:");
            
            String name = b.nextLine();
            
            Company company = new Company();
            
            company.setName(name);
            
            System.out.println("Enter Your Company Head Office: ");
            
            String head =  b.nextLine();
            
            company.setHead_Office(head);
            ser.setCompany(company);
            
            String cities[] = {""};
            
            System.out.println("Enter Cities: ");
            System.out.println("In How Many Cities You want Services: ");
            
            int c = a.nextInt();
            
            for(int i=0; i<c; i++){
                
                System.out.println("Enter City Name "+i+1);
                String city = b.nextLine();
                city = cities[i];
                
            }
            ser.setDistributed_Area(cities);
            System.out.println("Now For Office Use: ");
            
            System.out.println("Enter Package Price: ");
            
            int price =  a.nextInt();
            
            ser.setPrice_Per_Anum(price);
            
            System.out.println("Your Bill is : "+ser.PriceOfPackage(price,years));

            
            ser.display_Factory_Provided_Services();
        }

        if(choice==3){
            
            
            Finance ser= new Finance();
            
            System.out.println("You Have Selected Finance");
            
            ser.setName("Finance");
            
            
            System.out.println("Enter Years");
            
            int years = a.nextInt();
            
            ser.setYears(years);
            
            System.out.println("Enter Your Company Name:");
            
            String name = b.nextLine();
            
            Company company = new Company();
            
            company.setName(name);
            
            System.out.println("Enter Your Company Head Office: ");
            
            String head =  b.nextLine();
            
            company.setHead_Office(head);
            ser.setCompany(company);
            
            String cities[] = {""};
            
            System.out.println("Enter Cities: ");
            System.out.println("In How Many Cities You want Services: ");
            
            int c = a.nextInt();
            
            for(int i=0; i<c; i++){
                
                System.out.println("Enter City Name "+i+1);
                String city = b.nextLine();
                city = cities[i];
                
            }
            ser.setDistributed_Area(cities);
            System.out.println("Now For Office Use: ");
            
            System.out.println("Enter Package Price: ");
            
            int price =  a.nextInt();
            
            ser.setPrice_Per_Anum(price);
            
            System.out.println("Your Bill is : "+ser.PriceOfPackage(price,years));

            
            ser.display_Factory_Provided_Services();
        }

        
    }
}
