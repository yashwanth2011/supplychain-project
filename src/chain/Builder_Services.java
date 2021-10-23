package chain;

public class Builder_Services implements Observer_Logistics, State,Factory_Delivered_Services{

    private String Name;
    

    int Years;
    
     private Company company;
    
    
    public Builder_Services() {
    }

    public Builder_Services(String Name, int Years, Company company) {
        this.Name = Name;
      
        this.Years = Years;
        this.company = company;
    }

    

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int Years) {
        this.Years = Years;
    }

    @Override
    public double PriceOfPackage(double years, double price){
        return years*price;
    }

    
    
    @Override
    public void StateLogistics(int i) {
        i=0;
        System.out.println("For How Many Times Service is Provided Already:"
                + i+1+"Times");
    
        i++;
    }

    

    @Override
    public void display_Factory_Provided_Services() {
    
        System.out.println("Company Name: "+company.getName());
        System.out.println("Head Office: "+company.getHead_Office());
        System.out.println("Service Provided: ");
        System.out.println("Service Title: " +Name);
        System.out.println("Number Of Years: "+Years);
        
    }

    
    
    

}
