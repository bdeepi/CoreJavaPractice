package oOps_Array_List;

public class Branch {
	
	private int bid;
	private String bname;
	
	public Branch(int bid, String bname){
		this.bid = bid;
		this.bname = bname;
	}
	
	public int getBid(){
		return bid;
	}
	public void setBid(int bid){
		this.bid = bid;
	}
	public String getBname(){
		return bname;
	}
	public void setBname(String bname){
		this.bname = bname;
	}
	
	public String toString(){
		return "bid = " + bid + "bname =" + bname; 
	}

}
