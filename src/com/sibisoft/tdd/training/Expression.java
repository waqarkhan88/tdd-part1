package com.sibisoft.tdd.training;

public abstract class Expression {
	
	public abstract Money reduce(Bank bank, String to);
	public abstract Expression times(int multiplier);
	
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

}
