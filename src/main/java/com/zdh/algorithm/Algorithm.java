package com.zdh.algorithm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Algorithm
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		removeSameChar(str1, str2);
	}

	/**
	 * 功能描述：当i能同时被3和5整除，打印"FizzBuzz"；如果只被3整除，打印"Fizz"；如果只被5整除，打印"Buzz"；否则打印i；i为1~100的整数
	 * <br>
	 * void
	 * 
	 * @author ZDH
	 * @date 2017年6月18日 下午3:43:57 @修改日志：
	 */
	public static void fizzBuzz()
	{
		for (int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");
			else if(i % 3 == 0)
				System.out.println("Fizz");
			else if(i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}

	/**
	 * 功能描述： 当a、b、c三个boolean值中有两个为true/false时，结果必为true/false
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return boolean
	 * @author ZDH
	 * @date 2017年6月18日 下午4:09:00 @修改日志：
	 */
	public static boolean atLeastTwo(boolean a, boolean b, boolean c)
	{
		return a ? (b || c) : (b && c);
	}

	public static void arrayApp()
	{
		long[] arr;
		arr = new long[100];
		int nElems = 0;
		int j;
		long searchKey;

		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;

		for (j = 0; j < nElems; j++)
		{
			System.out.println(arr[j] + "  ");
		}
		System.out.println();

		searchKey = 66;
		for (j = 0; j < nElems; j++)
		{
			if(arr[j] == searchKey)
			{
				break;
			}
			if(j == nElems)
			{
				System.out.println("Can't find " + searchKey);
			}
			else
			{
				System.out.println("Found " + searchKey);
			}
		}

		searchKey = 55;
		for (j = 0; j < nElems; j++)
		{
			if(arr[j] == searchKey)
			{
				break;
			}
		}

		for (int k = 0; k < nElems; k++)
		{
			arr[k] = arr[k + 1];
			nElems--;
		}

		for (j = 0; j < nElems; j++)
		{
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	/**
	 * 功能描述：输入倒三角形
	 * 
	 * @param num
	 *            三角形行数
	 * @author ZDH
	 * @date 2017年8月18日 下午9:18:47 @修改日志：
	 */
	public static void dengBianSanJao(int num)
	{
		// 外层for循环控制三角形行数
		for (int i = 1; i <= num; i++)
		{
			// 内层循环1控制打印空格数，第一行1个空格，第二行2个空格，依次类推，最后一行应该有num个空格
			for (int j = num; j > num - i; j--)
			{
				System.out.print(" ");
			}
			// 内层循环2控制打印* 数，第一行为num个* ，第二行为四个，依次类推，最后一行应该为1个* .
			for (int m = num; m >= i; m--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	/**
	 * 功能描述：输出倒三角形 ***** *** *
	 * 
	 * @param num
	 *            三角形行数
	 * @author ZDH
	 * @date 2017年8月18日 下午9:47:58 @修改日志： 第1行：5个*，0个空格 第2行：3个*，1个空格 第3行：1个*，2个空格
	 */
	public static void dengBianSanJao2(int num)
	{
		for (int a = num; a >= 1; a--)
		{
			for (int j = num; j > a; j--)
			{
				System.out.print(" ");
			}

			for (int k = 1; k < 2 * a; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 功能描述：打印正三角形 * *** *****
	 * 
	 * @param num
	 *            三角形行数
	 * @author ZDH
	 * @date 2017年8月18日 下午10:05:02 @修改日志：
	 */
	public static void dengBianSanJao3(int num)
	{
		for (int a = 1; a <= num; a++)
		{
			for (int j = num; j > a; j--)
				System.out.print(" ");

			for (int k = 1; k < 2 * a; k++)
				System.out.print("*");

			System.out.println();
		}
	}

	/**
	 * 功能描述：输出三角形 *** ** *
	 * 
	 * @param num
	 *            void
	 * @author ZDH
	 * @date 2017年8月20日 下午9:27:49 @修改日志：
	 */
	public static void rightUpSanJiao(int num)
	{
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}

			for (int k = num; k > i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 功能描述：统计字符串中字母、标点符号和空格的数目
	 * 
	 * @param str
	 *            待统计字符串
	 * @author ZDH
	 * @date 2017年8月18日 下午10:39:25 @修改日志： 说明：字符ASCII码范围为65~122 空格ASCII码为32
	 *       标点符号ASCII码范围为33~64 字符还可以使用：'A'~'z'
	 *       空格还可以使用：Character.isWhitespace(chars[i])或chars[i] == ' '
	 */
	public static void strCount(String str)
	{
		char chars[] = str.toCharArray();
		int cCount = 0;// 字符数量
		int fCount = 0;// 标点符号数量
		int sCount = 0;// 空格数量
		for (int i = 0; i < chars.length; i++)
		{
			if(chars[i] >= 'A' && chars[i] <= 'z')
			{
				cCount++;
			}
			else if(chars[i] == ' ')
			{
				sCount++;
			}
			else
			{
				fCount++;
			}
		}

		System.out.println("字母个数 ： " + cCount);
		System.out.println("标点符号个数 ： " + fCount);
		System.out.println("空格个数 ： " + sCount);
	}

	/**
	 * 功能描述：冒泡排序
	 * 
	 * @param nums
	 *            待排序数组
	 * @author ZDH
	 * @date 2017年8月18日 下午10:53:44 @修改日志：
	 *       冒泡排序需要遵守的原则为：一次外部循环完成后，最大的数会移向最右端，且位置不再变化
	 *       外层循环控制比较次数，内层循环控制相邻两个数据的比较
	 */
	public static void maoPaoSort(int[] nums)
	{
		for (int i = nums.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				int temp;
				if(nums[j] > nums[j + 1])
				{
					temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}

		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + "\t");
		}
	}

	/**
	 * 功能描述：选择排序. 实现思路：数组左边元素大于右边元素时，将右边元素下标给左边元素，
	 * 直到左边元素为最小元素，跳出内层循环，并将两个元素交换位置; 外层循环控制比较次数 特点：数组左侧已经排好序的元素位置不会发生变化
	 * 
	 * @author ZDH
	 * @date 2017年7月8日 下午8:00:01 @修改日志：
	 */
	public static void selectSort(int[] nums)
	{
		for (int i = 0; i < nums.length - 1; i++)
		{
			int min = i;
			for (int j = i + 1; j < nums.length; j++)
			{
				if(nums[min] > nums[j])
				{
					min = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
		}
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + "\t");
		}
	}

	/**
	 * 功能描述：插入排序. 选定数组中某一元素，当左边元素大于这一元素时，将左边元素右移，直到左边元素小于等于该元素， 将该元素与其左侧数据交换;
	 * 特点：数组左侧已经排好序的元素不会发生变动;
	 * 
	 * @author ZDH
	 * @date 2017年7月8日 下午8:09:01 @修改日志：
	 */
	public static void insertSort(int[] nums)
	{
		int out;
		for (out = 1; out < nums.length; out++)
		{
			int temp = nums[out];
			while (out > 0 && nums[out - 1] >= temp)
			{
				nums[out] = nums[out - 1];
				out--;
			}
			nums[out] = temp;
		}

		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + "\t");
		}
	}

	/**
	 * 功能描述：打印实心菱形. 例如： * *** ***** *** *
	 * 实现思路：取行数二分之一值，本例行数为5，分别打印一个正三角形，行数为size/2 + 1；
	 * 完成后，再打印一个倒三角形，行数为size/2，两部分合并，即可构成一个菱形
	 * 
	 * @param num
	 * @author ZDH
	 * @date 2017年8月20日 下午10:03:50 @修改日志：
	 */
	public static void lingXingShiXin(int num)
	{
		if(num % 2 == 0)
		{
			num++;
		}
		for (int i = 1; i <= num / 2 + 1; i++)
		{
			for (int j = num / 2 + 1; j > i; j--)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = num / 2; i > 0; i--)
		{
			for (int j = num / 2; j >= i; j--)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 * 功能描述：打印空心菱形 思路：先打印上半部分，再打印下半部分，每行的第一个和最后一个是*，其他为空格
	 * 
	 * @param num
	 *            void
	 * @author ZDH
	 * @date 2017年8月21日 下午10:31:41 @修改日志：
	 */
	public static void kongXinLingXing(int num)
	{
		if(num % 2 == 0)
		{
			num++;
		}

		for (int i = 1; i <= num / 2 + 1; i++)
		{
			for (int j = num / 2 + 1; j > i; j--)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++)
			{
				if(k == 1 || k == 2 * i - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int i = num / 2; i > 0; i--)
		{
			for (int j = num / 2; j >= i; j--)
			{
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++)
			{
				if(k == 1 || k == 2 * i - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	/**
	 * 功能描述：将输入的字符串倒序输出
	 * 
	 * @param input
	 *            输入的字符串
	 * @return String 输入字符串的倒序输出
	 * @author ZDH
	 * @date 2017年8月21日 下午9:16:24 @修改日志：
	 */
	public static String reverse(String input)
	{
		StringBuilder builder = new StringBuilder();
		char[] characters = input.toCharArray();
		for (int i = characters.length - 1; i >= 0; i--)
		{
			builder.append(characters[i]);
		}
		return builder.toString();
	}

	/**
	 * 功能描述：判断两个字符串是否相等
	 * 
	 * @param one
	 *            字符串1
	 * @param two
	 *            字符串2
	 * @return boolean 返回结果true/false
	 * @author ZDH
	 * @date 2017年8月21日 下午9:18:55 @修改日志：
	 */
	public static boolean isRotation(String one, String two)
	{
		return (one.length() == two.length())
				&& ((one + one).indexOf(two) != -1);
	}

	/**
	 * 功能描述：判断输入的字符串的每个字母是否唯一
	 * 
	 * @param str
	 *            输入字符串
	 * @return boolean true/false
	 * @author ZDH
	 * @date 2017年8月21日 下午9:25:35 @修改日志：
	 */
	public static boolean isUnique(String str)
	{
		if(str == null || str.isEmpty())
		{
			return false;
		}

		HashSet<Character> map = new HashSet<Character>();
		char[] characters = str.toCharArray();
		for (int i = 0; i < characters.length; i++)
		{
			if(map.contains(characters[i]))
			{
				return false;
			}
			else
			{
				map.add(characters[i]);
			}
		}
		return true;
	}

	/**
	 * 功能描述：去除输入字符串中重复字母
	 * 
	 * @param string
	 *            输出字符串
	 * @return String 去重后的字符串
	 * @author ZDH
	 * @date 2017年8月21日 下午9:34:43 @修改日志：
	 */
	public static String removeDuplicates(String string)
	{
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars)
		{
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet)
		{
			sb.append(character);
		}
		return sb.toString();
	}

	/**
	 * 功能描述：根据空格分割字符数组，并将字符数组倒序排列 例如'a','b',' ','c',' ','d', 执行后结果为： 'd','
	 * ','c',' ','a','b'
	 * 
	 * @param words
	 * @return char[]
	 * @author ZDH
	 * @date 2017年8月21日 下午10:07:47 @修改日志：
	 */
	public static char[] reverseWordOrder(char[] words)
	{
		reverseCharacters(words, 0, words.length);
		int lastSpace = 0;
		for (int i = 0; i < words.length; i++)
		{
			if(words[i] == ' ')
			{
				reverseCharacters(words, lastSpace, i);
				lastSpace = i + 1;
			}
		}
		reverseCharacters(words, lastSpace, words.length);
		return words;
	}

	private static void reverseCharacters(char[] words, int min, int max)
	{
		for (int i = 0; i < (max - min) / 2; i++)
		{
			char temp = words[min + i];
			words[min + i] = words[max - i - 1];
			words[max - i - 1] = temp;
		}

		for (char c : words)
		{
			System.out.print(c + "\t");
		}
		System.out.println();
	}

	/**
	 * 功能描述：将字符串转换为数字
	 * 
	 * @param input
	 *            输入的字符串
	 * @return int 转换的数字结果
	 * @author ZDH
	 * @date 2017年8月21日 下午10:26:16 @修改日志：
	 */
	public static int stringToInteger(String input)
	{
		int result = 0;
		int i = 0;
		boolean isNegative = false;
		if(input.charAt(i) == '-')
		{
			isNegative = true;
			i++;
		}

		for (; i < input.length(); i++)
		{
			result *= 10;
			result += (int) input.charAt(i) - 48;
		}

		if(isNegative)
		{
			result *= -1;
		}
		return result;
	}

	/**
	 * 功能描述：验证email地址合法性
	 * 
	 * @param email
	 *            email地址
	 * @return int 0-不合法，1-合法
	 * @author ZDH
	 * @date 2017年8月23日 下午9:49:14 @修改日志：
	 */
	public static int emailValid(String email)
	{
		if(email == null || email.isEmpty())
		{
			return 0;
		}

		if(!(email.endsWith(".com") || email.endsWith(".cn")))
		{
			return 0;
		}

		char[] chars = email.toCharArray();
		if(chars[0] < 48 || (chars[0] > 57 && chars[0] < 65) || chars[0] > 122)
		{
			return 0;
		}

		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < chars.length; i++)
		{
			if(chars[i] == '@')
			{
				index1 = i;
			}

			if(chars[i] == '.')
			{
				index2 = i;
			}
		}

		if(index2 - index1 <= 1)
		{
			return 0;
		}

		return 1;
	}

	/**
	 * 功能描述：打印电池电量 void
	 * 
	 * @author ZDH
	 * @date 2017年8月23日 下午9:48:49 @修改日志：
	 */
	public static void dianLiang()
	{
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] params = str.split(" ");
		int total = Integer.parseInt(params[0]);
		int sydl = Integer.parseInt(params[1]);
		for (int i = 0; i < total; i++)
		{
			if(i < sydl)
			{
				for (int j = 0; j < total; j++)
				{
					if(j == 0 || j == total - 1)
					{
						System.out.print("|");
					}
					else
						System.out.print("-");
				}
				System.out.println();
			}
			else
			{
				for (int j = 0; j < total; j++)
				{
					if(j == 0 || j == total - 1)
					{
						System.out.print("|");
					}
					else
						System.out.print("\\");
				}
				System.out.println();
			}
		}
	}

	public static int sharingApple(int m, int n)
	{
		if(m == 1 && n == 1)
		{
			return 1;
		}
		else if(m < n)
		{
			return sharingApple(m, m);
		}
		else if(m > n)
		{
			return sharingApple(m, n - 1);
		}
		else
			return 1;
	}

	/**
	 * 功能描述：验证输入的数组是否是等差数列
	 * 
	 * @param a
	 *            数组长度
	 * @param arr
	 *            int类型数组
	 * @return String Impossible/Possible
	 * @author ZDH
	 * @date 2017年8月23日 下午9:47:38 @修改日志：
	 */
	public static String valid(int a, int[] arr)
	{
		for (int i = arr.length - 2; i > 0; i--)
		{
			for (int j = 0; j <= i; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}

		for (int i = 1; i < arr.length - 1; i++)
		{
			int res = arr[1] - arr[0];
			if(arr[i + 1] - arr[i] != res)
			{
				return "Impossible";
			}
		}
		return "Possible";
	}

	/**
	 * 功能描述：找出字符串one与字符串two中相同的字符个数
	 * @param one 字符串1
	 * @param two 字符串2
	 * @return int 相同的字符个数
	 * @author ZDH
	 * @date 2017年8月23日 下午10:07:57
	 * @修改日志：
	 */
	public static int longest(String one, String two)
	{
		int n = one.length();
		int m = two.length();

		if(n == 0 || m == 0)
			return 0;

		int maxLenth = 0;
		int[][] memoized = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
			{
				if(one.charAt(i) == two.charAt(j))
				{
					if(i == 0 || j == 0)
						memoized[i][j] = 1;
					else
						memoized[i][j] = memoized[i - 1][j - 1] + 1;
					if(memoized[i][j] > maxLenth)
						maxLenth = memoized[i][j];
				}
			}
		return maxLenth;
	}
	
	/**
	 * 功能描述：找出字符串one与字符串two中相同的字符个数
	 * @param one 字符串1
	 * @param two 字符串2
	 * @return int 相同的字符个数
	 * @author ZDH
	 * @date 2017年8月23日 下午10:07:57
	 * @修改日志：
	 */
	public static int longest2(String one, String two)
	{
		int n = one.length();
		int m = two.length();

		if(n == 0 || m == 0)
			return 0;

		int count = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
			{
				if(one.charAt(i) == two.charAt(j))
				{
					count++;
				}
			}
		return count;
	}
	
	/**
	 * 功能描述：求2的幂
	 * @param x 指数
	 * @return int 2的x次幂结果
	 * @author ZDH
	 * @date 2017年8月23日 下午10:14:13
	 * @修改日志：
	 * 思路：将2的二进制数按位向左移动x位
	 * 例如：2二进制表示为：0010，按位向左移动3位后为：1000，为十进制8
	 */
	public static int towToThe(int x) {
		return 1 << x;
	}
	
	/**
	 * 功能描述：判断x是否为2的指数
	 * @param x 输入值
	 * @return boolean true/false
	 * @author ZDH
	 * @date 2017年8月23日 下午10:30:29
	 * @修改日志：
	 */
	public static boolean isPowerOfTwo(int x) {
		return (x & (x - 1)) == 0;
	}
	
	/**
	 * 功能描述：交换两个输入参数的值
	 * @param a 输入参数1
	 * @param b 输入参数2
	 * @author ZDH
	 * @date 2017年8月23日 下午10:41:14
	 * @修改日志：
	 * 思路：通过参数2进制数按位异或求取结果
	 * 例如：a=2,b=3,则二进制分别为：10，11
	 * 第一次异或结果为：01，此时a=1
	 * 第二次异或结果为：10，此时b=2
	 * 第三次异或结果为：11，此时a=3,至此，完成a，b值的交换
	 * 
	 */
	public static void swapInPlace(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a is : " + a + "; b is : " + b);
	}
	
	public static byte swapBits(byte b) {
		return (byte) (((b & 0xf0) >> 4) | ((b & 0x0f) << 4));
	}
	
	/**
	 * 功能描述：找出数组中唯一出现一次的数
	 * @param input 输入数组，有且只有一个元素只出现一次
	 * @return int 数组中只出现一次的那个元素
	 * @author ZDH
	 * @date 2017年8月24日 下午10:31:12
	 * @修改日志：
	 */
	public static int findTheLoner(int[] input) {
		int value = 0;
		for (int i = 0; i < input.length; i++)
		{
			value = value^input[i];
		}
		return value;
	}
	
	
	public static boolean isSameSign(int x, int y) {
		return ((x^y) < 0);
	}
	
	
	/**
	 * 功能描述：输入两个字符串，并将字符串1与字符串2相同的字符删除后，输出字符串1
	 * @param string1 字符串1
	 * @param string2 字符串2
	 * @author ZDH
	 * @date 2017年8月25日 下午10:13:20
	 * @修改日志：
	 * 
	 * 例如：str1 = "They are good boys.";
	 * 	   str2 = "a g";
	 * 输出为：They re ood boys.
	 * 主意对空格的处理.
	 * 
	 * Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		removeSameChar(str1, str2);
	 */
	public static void removeSameChar(String string1, String string2) {
		char[] chars = string1.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			for (int j = 0; j < string2.toCharArray().length; j++)
			{
				if (chars[i] != ' ' && chars[i] == string2.toCharArray()[j]) {
					chars[i] = '■';
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++)
		{
			sb.append(chars[i]);
		}
		
		String res = sb.toString().replaceAll("■", "");
		System.out.println(res);
	}
	
}
