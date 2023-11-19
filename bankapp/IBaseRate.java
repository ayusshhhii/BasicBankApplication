package bankapp;

public interface IBaseRate {
	//write a method that returns the base rate
	
	//this is like an api available to us
	default double getBaseRate() {
		return 2.5;
	} 
	
}
