package de.op.academy.cucumber;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
	private final Deque<Number> stack;

	public Calculator() {
		stack = new ArrayDeque<>();
	}

	public void push(Number num) {
		stack.push(num);
	}

	public void push(char op) {
		final Number b = stack.size() >= 2 ? stack.pop() : 0;
		final Number a = stack.size() >= 1 ? stack.pop() : 0;

		switch (op) {
		case '+':
			stack.push(a.doubleValue() + b.doubleValue());
			break;
		case '-':
			stack.push(a.doubleValue() - b.doubleValue());
			break;
		case '*':
			stack.push(a.doubleValue() * b.doubleValue());
			break;
		case '/':
			stack.push(a.doubleValue() / b.doubleValue());
			break;
		default:
			throw new IllegalArgumentException("Unknown operator '" + op + "'.");
		}
	}

	public Number getValue() {
		return stack.pop();
	}

}
