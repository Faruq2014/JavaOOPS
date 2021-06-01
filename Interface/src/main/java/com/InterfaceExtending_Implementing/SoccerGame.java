package com.InterfaceExtending_Implementing;

public class SoccerGame implements Soccer{

	public static void main(String[] args) {
		new SoccerGame().setHomeTeam("name");
		new SoccerGame().setVisitingTeam("name");
		new SoccerGame().endOfHalfTime(0);
		new SoccerGame().OffSide("kamal");
		new SoccerGame().OffSide("faruq");
		
	}

	@Override
	public void setHomeTeam(String name) {
		name="Barcelona";
   System.out.println("Home team is"+name );		
	}

	@Override
	public void setVisitingTeam(String name) {
		name="Real Madrid";
		   System.out.println("Visiting team is"+name );	
		
	}

	@Override
	public void endOfHalfTime(int halfTime) {
		halfTime=30;
		System.out.println(halfTime + " minute is the half time");
		
	}
	@Override
	public void OffSide(String offSide) {
		
		/*
		 * for (int i = 0; i < offSide.length(); i++) { System.out.println(i+
		 * "player being off side positions  "+offSide); break; }
		 */
		System.out.println(offSide.length()+ "player being off side positions  "+offSide);
		
		
	}

		
	}

	


