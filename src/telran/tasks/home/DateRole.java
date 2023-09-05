package telran.tasks.home;

import java.time.LocalDate;

public class DateRole {
	
		public String name;
	    public String role;
	    public LocalDate date;

	    public DateRole( String name, String role,LocalDate date) {
	        this.date = date;
	        this.role = role;
	        this.name = name;
	    }
	    
	    
	    public String getName() {
	        return this.name;
	    }

	    public String getRole() {
	        return this.role;
	    }

	    public LocalDate getDate() {
	        return this.date;
	    }

		@Override
	    public String toString() {


	        return "Employee: Name - " + getName() + ", Role - " + getRole() +  ", Date - " + getDate() + "\n";
	    }
	    
}
