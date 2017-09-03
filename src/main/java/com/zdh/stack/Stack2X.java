package com.zdh.stack;

public class Stack2X
{
	private int maxSize;

	private char[] stackArray;

	private int top;

	public Stack2X(int s)
	{
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char c)
	{
		stackArray[++top] = c;
	}

	public char pop()
	{
		return stackArray[top--];
	}

	public char peek()
	{
		return stackArray[top];
	}

	public boolean isEmpty()
	{
		return top == -1;
	}

	public int size()
	{
		return top + 1;
	}

	public char peekN(int n)
	{
		return stackArray[n];
	}

	public void display(String string)
	{
		System.out.print(string);
		System.out.print("Stack (bottom-->top) : ");
		for (int i = 0; i < size(); i++)
		{
			System.out.print(peekN(i) + "\t");
		}
		System.out.println();
	}
}

class InToPost
{
	private Stack2X theStack;

	private String input;

	private String output = "";

	public InToPost(String in)
	{
		input = in;
		int stackSize = input.length();
		theStack = new Stack2X(stackSize);
	}

	public String doTrans()
	{
		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			theStack.display("For " + ch + "");
			switch (ch)
			{
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			case '(':
				theStack.push(ch);
				break;
			case ')':
				gotParen(ch);
				break;
			default:
				output = output + ch;
				break;
			}
		}
		while (!theStack.isEmpty()) {
			theStack.display("While ");
			output = output + theStack.pop();
		}
		
		theStack.display("End ");
		return output;
	}

	public void gotOper(char ch, int prec)
	{
		while (!theStack.isEmpty())
		{
			char opTop = theStack.pop();
			if(opTop == '(')
			{
				theStack.push(opTop);
				break;
			}
			else
			{
				int prec2;
				if(opTop == '+' || opTop == '-')
				{
					prec2 = 1;
				}
				else
				{
					prec2 = 2;
				}

				if(prec2 < prec)
				{
					theStack.push(opTop);
					break;
				}
				else
				{
					output = output + opTop;
				}
			}
		}
		theStack.push(ch);
	}

	public void gotParen(char ch)
	{
		while (!theStack.isEmpty())
		{
			char chx = theStack.pop();
			if(chx == '(')
			{
				break;
			}
			else
			{
				output = output + chx;
			}
		}
	}
}
