package chain;

public class Delivery extends Builder_Services{
	    
	    
	    private double Price_Per_Anum;

	    private String[] Distributed_Area;

	    

	    public Delivery(double Price_Per_Anum, String[] Distributed_Area, 
	            String Name, String Type, int Years, Company company) {
	       
	        super(Name,  Years, company);
	        this.Price_Per_Anum = Price_Per_Anum;
	        this.Distributed_Area = Distributed_Area;
	    
	    }

	    Delivery() {
	   
	    }
	    
	   

	    
	    public String[] getDistributed_Area() {
	        return Distributed_Area;
	    }

	    public void setDistributed_Area(String[] Distributed_Area) {
	        this.Distributed_Area = Distributed_Area;
	    }
	    
	    

	    public double getPrice_Per_Anum() {
	        return Price_Per_Anum;
	    }

	    public void setPrice_Per_Anum(double Price_Per_Anum) {
	        this.Price_Per_Anum = Price_Per_Anum;
	    }

	    
	    @Override
	    public double PriceOfPackage(double Price_Per_Anum,double Years) {
	    
	        return Price_Per_Anum*Years;
	    }
	    
	    @Override
	    public void StateLogistics(int i) {
	        i=0;
	        System.out.println("For How Many Times Service is Provided Already:"
	                + i+1+"Times");
	    
	        i++;
	    }
}
