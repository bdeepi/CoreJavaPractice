package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class DesignationBuilder {
	List<Designation> des = new ArrayList<Designation>();

	public boolean addDesignation(Designation d) {
		for (Designation ds : des) {
			if (ds.getId() == ds.getId()) {
				return false;

			}

		}
		des.add(d);
		return true;
	}
	public Designation getDesignation(int id){
		for(Designation ds : des){
			if(ds.getId() == id){
			return ds;	
			}
		}
		return null;
	}

}
