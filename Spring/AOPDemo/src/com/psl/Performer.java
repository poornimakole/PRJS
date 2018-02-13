package com.psl;

public class Performer {
	//Join point
	public void performerPractices()
	{
		System.out.println("Performer practices.....");
	}
	
	//point cut
	public void perform(String song, String artist)throws Exception
	{
		System.out.println("Performer performs a song "+song+" of artist "+artist);
		
			//throw new Exception("rain");
	}
	
	public void hasSupper(){
		System.out.println("performer has supper");
	}
	
	public void giveAutographs(){
		System.out.println("Performers gives autographs");
	}
	
	public void catchesFlight(){
		System.out.println("Performers catches Flight");
	}

}
