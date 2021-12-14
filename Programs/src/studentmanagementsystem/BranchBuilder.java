package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class BranchBuilder {
	List<Branch> branches = new ArrayList<Branch>();

	public boolean addBranch(Branch b) {
		for (Branch br : branches) {
			if (br.getBid() == b.getBid()) {
				return false;

			}

		}
		branches.add(b);
		return true;
	}

	public Branch getBranch(int id) {
		for (Branch br : branches) {
			if (br.getBid() == id) {
              return br;
			}
		}
        return null;
	}

}
