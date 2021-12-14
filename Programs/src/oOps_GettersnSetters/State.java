package oOps_GettersnSetters;

public class State {
	
	private String name;
	private String country;
	private District district;
	
	public State(){}
	
	public State(String name, String country, District district){
		this.name = name;
		this.country = country;
		this.district = district;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getCountry(){
		return country;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public District getDistrict(){
		return district;
	}
	public void setDistrict(District district){
		this.district = district;
	}
	public boolean equals(State s){
		if(name.equals(s.name) && country.equals(s.country) && district.equals(s.district)){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "name = " + name + ",country = " + country + district;
	}

}
