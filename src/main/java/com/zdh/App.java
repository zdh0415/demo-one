package com.zdh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Hello world!
 */

public class App
{
	public static void main(String[] args) throws IOException
	{
		server();
	}

//	public static void client() throws UnknownHostException, IOException
//	{
//		// 客户端
//		// 1、创建客户端Socket，指定服务器地址和端口
//		Socket socket = new Socket("127.0.0.1", 10086);
//		// 2、获取输出流，向服务器端发送信息
//		OutputStream os = socket.getOutputStream();// 字节输出流
//		PrintWriter pw = new PrintWriter(os);// 将输出流包装成打印流
//		pw.write("用户名：admin；密码：admin");
//		pw.flush();
//		socket.shutdownOutput();
//		// 3、获取输入流，并读取服务器端的响应信息
//		InputStream is = socket.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(is));
//		String info = null;
//		while ((info = br.readLine()) != null)
//		{
//			System.out.println("Hello,我是客户端，服务器说：" + info);
//		}
//
//		// 4、关闭资源
//		br.close();
//		is.close();
//		pw.close();
//		os.close();
//		socket.close();
//	}

	public static void server() throws IOException
	{
		// 1、创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
		ServerSocket serverSocket = new ServerSocket(10086);// 1024-65535的某个端口
		// 2、调用accept()方法开始监听，等待客户端的连接
		Socket socket = serverSocket.accept();
		// 3、获取输入流，并读取客户端信息
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String info = null;
		while ((info = br.readLine()) != null)
		{
			System.out.println("Hello,我是服务器，客户端说：" + info);
		}
		socket.shutdownInput();// 关闭输入流
		// 4、获取输出流，响应客户端的请求
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("Hello World！");
		pw.flush();

		// 5、关闭资源
		pw.close();
		os.close();
		br.close();
		isr.close();
		is.close();
		socket.close();
		serverSocket.close();
	}
}