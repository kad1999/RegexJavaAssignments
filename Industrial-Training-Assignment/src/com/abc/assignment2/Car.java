package com.abc.assignment2;
class Engine {
	int engineNumber;
	int mftYear;
	String company;
	
	public Engine() {
		this.engineNumber = 1001;
		this.mftYear = 2001;
		this.company = "Hero";
	}

	public Engine(int engineNumber, int mftYear, String company) {
		super();
		this.engineNumber = engineNumber;
		this.mftYear = mftYear;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", mftYear=" + mftYear + ", company=" + company + "]";
	}
	
	
}

class Car {
	int modelNo;
	int mftYear;
	Engine engine;
	
	
	public Car(int modelNo, int mftYear, Engine engine) {
		super();
		this.modelNo = modelNo;
		this.mftYear = mftYear;
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", mftYear=" + mftYear + ", engine=" + engine + "]";
	}
	
	
	
}
