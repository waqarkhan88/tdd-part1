package com.sibisoft.tdd.training;

public class Sum extends Expression {
	public Expression augend;
	public Expression addend;
	
	public Sum(Expression augend, Expression addend) {
		this.augend= augend;
		this.addend= addend;
	}
	
	public Money reduce(Bank bank, String to) {
		int amount= augend.reduce(bank, to).amount 
				+ addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}
	
	public Expression times(int multiplier) {
		return new Sum(augend.times(multiplier),addend.times(multiplier));
	}
}
