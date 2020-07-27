package com.InterfaceExtending_Implementing;

public interface Soccer extends Sports {
	//method from parent
	public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
	   
    // own method
	   public void endOfHalfTime(int halfTime);
	   public void OffSide(String  offSide);
}
