public class EmployeeOverr {
	private int id;
    private String name;

    public EmployeeOverr(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object obj) {
    	if(this == obj) return true;
    	if(!(obj instanceof EmployeeOverr)) return false;
    	
    	EmployeeOverr ob = (EmployeeOverr) obj;
    	return this.id == ob.id;
    }
    
    
    
}
