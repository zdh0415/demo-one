package com.zdh.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack2XDemo
{

	public static void main(String[] args) throws IOException {
		String input, output;
		while (true) {
			System.out.println("Enter infix : ");
			System.out.flush();
			
			input = getString();
			if ("".equals(input)) {
				break;
			}
			
			InToPost theTrans = new InToPost(input);
			output = theTrans.doTrans();
			System.out.println("Postfix is " + output + "\n");
			
		}
	}
	
	public static String getString() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String s = br.readLine();
		return s;
	}
}
