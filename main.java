package Alprsln;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;




public class Psc_21 {
	public static void main(String args[]) {
		
		tara1 tara1 = new tara1(args[0]);
		tara2 tara2 = new tara2(args[0]);
		tara3 tara3 = new tara3(args[0]);
		Thread t1 = new Thread(tara1);
		Thread t2 = new Thread(tara2);
		Thread t3 = new Thread(tara3);
		t1.start();
		t2.start();
		t3.start();
		
		
		tara4 tara4 = new tara4(args[0]);
		tara5 tara5 = new tara5(args[0]);
		tara6 tara6 = new tara6(args[0]);
		Thread t4 = new Thread(tara4);
		Thread t5 = new Thread(tara5);
		Thread t6 = new Thread(tara6);
		t4.start();
		t5.start();
		t6.start();
		
		
		tara7 tara7 = new tara7(args[0]);
		tara8 tara8 = new tara8(args[0]);
		tara9 tara9 = new tara9(args[0]);
		Thread t7 = new Thread(tara7);
		Thread t8 = new Thread(tara8);
		Thread t9 = new Thread(tara9);
		t7.start();
		t8.start();
		t9.start();
		
		
		tara10 tara10 = new tara10(args[0]);
		tara11 tara11 = new tara11(args[0]);
		tara12 tara12 = new tara12(args[0]);
		Thread t10 = new Thread(tara10);
		Thread t11 = new Thread(tara11);
		Thread t12 = new Thread(tara12);
		t10.start();
		t11.start();
		t12.start();
		
		tara14 tara14 = new tara14(args[0]);
		tara15 tara15 = new tara15(args[0]);
		tara16 tara16 = new tara16(args[0]);
		Thread t14 = new Thread(tara14);
		Thread t15 = new Thread(tara15);
		Thread t16 = new Thread(tara16);
		t14.start();
		t15.start();
		t16.start();
		
		tara17 tara17 = new tara17(args[0]);
		Thread t17 = new Thread(tara17);
		t17.start();
				
	}

}

class tara1 implements Runnable{
	String host;
	public tara1(String host){
		this.host = host;
		
	}
	
	public void run() {
		
		for (int port = 1; port < 50; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
			
		}catch (IOException e){}
		
		}
	}	
}
class tara2 implements Runnable{
	
	String host;
	public tara2(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 50; port < 100; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}
class tara3 implements Runnable{
	
	String host;
	public tara3(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 100; port < 150; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}
class tara4 implements Runnable{
	String host;
	public tara4(String host){
		this.host = host;
		
	}
	
	public void run() {
		
		for (int port = 150; port < 200; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}
class tara5 implements Runnable{
	
	String host;
	public tara5(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 200; port < 250; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}
class tara6 implements Runnable{
	
	String host;
	public tara6(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 250; port < 300; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}
class tara7 implements Runnable{
	
	String host;
	public tara7(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 350; port < 400; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara8 implements Runnable{
	
	String host;
	public tara8(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 400; port < 450; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara9 implements Runnable{
	
	String host;
	public tara9(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 450; port < 500; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara10 implements Runnable{
	String host;
	public tara10(String host){
		this.host = host;
		
	}
	
	public void run() {
		
		for (int port = 500; port < 550; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara11 implements Runnable{
	
	String host;
	public tara11(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 550; port < 600; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara12 implements Runnable{
	

	String host;
	public tara12(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 650; port < 700; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara13 implements Runnable{
	
	String host;
	public tara13(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 700; port < 750; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara14 implements Runnable{
	
	String host;
	public tara14(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 750; port < 800; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara15 implements Runnable{
	String host;
	public tara15(String host){
		this.host = host;
		
	}
	
	public void run() {
		
		for (int port = 800; port < 850; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara16 implements Runnable{
	
	String host;
	public tara16(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 850; port < 900; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}class tara17 implements Runnable{
	
	String host;
	public tara17(String host){
		this.host = host;
		
	}
	public void run() {
		
		for (int port = 900; port < 1000; port++) {

		try {
			
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(host,port));
			System.out.println("|+| Port " + port +" is open");
		}catch (IOException e){}
		
		}
	}	
}
