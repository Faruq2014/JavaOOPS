package com.InterfaceExtending_Implementing;

public class CricketGame implements Cricket{

	public static void main(String[] args) {
		CricketGame cGame = new CricketGame();
		cGame.setHomeTeam("name");
		cGame.setVisitingTeam("name");
		cGame.catchBall("Faruq");
		cGame.catchBall("Shimul");
		// this are constant, direct access is  preferable
		System.out.println("Total filder in the field at a time  "+Cricket.playerInTheField);
		System.out.println("Toata Batsman in the field at a time "+Cricket.batsManInTheField);
		
		// this are constant, indirect access is not preferable
		//System.out.println(cGame.playerInTheField); 
		//System.out.println(cGame.batsManInTheField);
		
	}

	@Override
	public void setHomeTeam(String name) {
		name="Dhaka Dynamite";
		   System.out.println("Home team is"+name );		

	}

	@Override
	public void setVisitingTeam(String name) {
		name="Rangpur Rangers";
		   System.out.println("Visiting team is "+name );	
	}

	public void catchBall(String catcher) {
		// if you change method signature it is totally new method.
		// its became class own method. 
	
	
	System.out.println("Catcher is "+catcher);	
	//Cricket.batsManInTheField=20; // constant--> can not change. 
	}

	@Override
	public void catchBall() {
		// parents method
		
	}


}
