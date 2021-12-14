package oOps_GettersnSetters;

public class Branch {
	private String bname;
	private int bid;

	public Branch() {
	}

	public Branch(String bname, int bid) {
		this.bname = bname;
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}
	public boolean equals(Branch b){
		if(bname.equals(b.bname) && bid == b.bid){
			return true;
		}else{
			return false;
		}
	}

	public String toString() {
		return " bid = " + bid + ",bname = " + bname;
	}

}
