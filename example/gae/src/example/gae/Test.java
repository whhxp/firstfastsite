package example.gae;

import javax.persistence.EntityManager;

public class Test {
	public static void main(String[] args) {
		EntityManager em = EMF.get().createEntityManager();
		
		
	    try {
	        // ... do stuff with em ...
	    	Employee emp=new Employee();
	    	emp.setFirstName("sen");
	    	emp.setLastName("a");
	    	emp.setId(12L);
	    	em.persist(emp);
	    	System.out.println(emp);
	    	
	    	Employee emp2 = test(em);
	    	
	    	System.out.println(emp2);
	    	
	    } finally {
	        //em.close();
	    }
		
	}

	private static Employee test(EntityManager em) {
		Employee emp2=em.getReference(Employee.class, 12L);
		return emp2;
	}
}
