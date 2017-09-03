package com.zdh.stack;

public class StackDemo
{
	public static void main(String[] args)
	{
		// String str = "hello xiaochi";
		// StackX<Character> sx = new StackX<Character>(str.length());
		// char[] cs = str.toCharArray();
		// for (char c : cs)
		// {
		// sx.push(c);
		// }
		//
		// while(!sx.isEmpty()) {
		// System.out.print(sx.pop());
		// }
		// System.out.println("===================");

		String str = "{[([)]}";
		boolean b = valid(str);
		System.out.println(b);
	}
	
	public static boolean valid(String string) {
		StackX<Character> sx = new StackX<Character>(string.length());
		StackX<Character> sx2 = new StackX<Character>(string.length());
		for (int i = 0; i < string.length(); i++)
		{
			char ch = string.charAt(i);
			switch (ch)
			{
			case '{':
			case '[':
			case '(':
				sx.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				
				if(!sx.isEmpty())
				{
					char chx = sx.pop();
					if((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
							|| (ch == ')' && chx != '('))
					{
						System.out.println("Error: " + chx + "缺少对应的结束符号,或" + ch + "缺少对应的开始符号");
						return false;
					}
				}
				else
				{
					System.out.println("Error: " + ch + " at " + i);
					return false;
				}
				break;
			default:
				break;
			}
		}
		if (!sx.isEmpty()) {
			System.out.println("Error : Missing right delimiter");
			return false;
		}
		
		return true;
	}
}
