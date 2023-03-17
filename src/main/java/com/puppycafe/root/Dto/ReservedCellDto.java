package com.puppycafe.root.Dto;

public class ReservedCellDto {
	private String day;	//예약일
	private int rstarthour;	//예약시작시간
	private int amount;	//마릿수
	public ReservedCellDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservedCellDto(String day, int rstarthour, int amount) {
		super();
		this.day = day;
		this.rstarthour = rstarthour;
		this.amount = amount;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getRstarthour() {
		return rstarthour;
	}
	public void setRstarthour(int rstarthour) {
		this.rstarthour = rstarthour;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
