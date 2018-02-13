package com.psl.q2;

public class TechnicalManager {

	int noOfEmployeeReporting;
	String workPlace;
	int promotionsTillDate;
	int noOfProjects;
	
	public TechnicalManager() {
		// TODO Auto-generated constructor stub
	}
	
	public TechnicalManager(int noOfEmployeeReporting,String workPlace,int promotionsTillDate,int noOfProjects)
	{
		// TODO Auto-generated constructor stub
		this.noOfEmployeeReporting = noOfEmployeeReporting;
		this.workPlace = workPlace;
		if(promotionsTillDate==0 || noOfProjects==0 )
		 {
			 try {
				throw new MyCustomException("promotion till date and number of projects cannot be zero");
			} catch (MyCustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		else
		{
			this.promotionsTillDate = promotionsTillDate;
			this.noOfProjects = noOfProjects;
		}
	}

	public int getNoOfEmployeeReporting() {
		return noOfEmployeeReporting;
	}

	public void setNoOfEmployeeReporting(int noOfEmployeeReporting) {
		this.noOfEmployeeReporting = noOfEmployeeReporting;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	public int getPromotionsTillDate() {
		return promotionsTillDate;
	}

	public void setPromotionsTillDate(int promotionsTillDate) {
		this.promotionsTillDate = promotionsTillDate;
	}

	public int getNoOfProjects() {
		return noOfProjects;
	}

	public void setNoOfProjects(int noOfProjects) {
		this.noOfProjects = noOfProjects;
	}

	@Override
	public String toString() {
		return "noOfEmployeeReporting: "
				+ noOfEmployeeReporting + "\n workPlace: " + workPlace
				+ "\n promotionsTillDate: " + promotionsTillDate
				+ "\n noOfProjects: " + noOfProjects;
	}
	
	
	
}
