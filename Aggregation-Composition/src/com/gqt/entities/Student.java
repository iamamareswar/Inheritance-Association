package com.gqt.entities;

public class Student 
{
	 public Heart heart=new Heart(72,340);
	    public Brain brain=new Brain("Grayish", 1400);
	    public Bike bike;
	    public Book book;
		public void setBike(Bike bike) {
			this.bike = bike;
		}
		public void setBook(Book book) {
			this.book = book;
		}
}
