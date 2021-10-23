package chain;

public class Company {
	 
    private String name;
    
    private String Head_Office;

    public Company(String name, String Head_Office) {
        this.name = name;
        this.Head_Office = Head_Office;
    }

    public Company() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead_Office() {
        return Head_Office;
    }

    public void setHead_Office(String Head_Office) {
        this.Head_Office = Head_Office;
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", Head_Office=" + Head_Office + '}';
    }
    
}
