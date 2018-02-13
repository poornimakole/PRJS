package com.psl.demo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class WaitNotifyDemo extends JFrame implements Runnable {

	 int gx=10,rx=10,bx=10;
	 
	public WaitNotifyDemo() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setSize(800,600);
		setTitle("Lets Race.....!!!!");
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			{
				if(Thread.currentThread().getName().equals("green"))
				{
					gx++;
					try {
						Thread.sleep(20);
						if(gx==400)
						{
							synchronized (this) {
							wait();
							}
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
						
				}
				else if(Thread.currentThread().getName().equals("red"))
				{
					rx++;
					try {
						Thread.sleep(20);
						if(rx==400)
						{
							synchronized (this) {
							wait();
							}
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					bx++;
					try {
						Thread.sleep(40);
						if(bx==400)
						{
							synchronized (this) {
							notifyAll();
							}
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			repaint();
			}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillOval(gx,150,50, 50);
		
		g.setColor(Color.RED);
		g.fillOval(rx,250,50, 50);
		
		g.setColor(Color.BLUE);
		g.fillOval(bx,350,50, 50);
		
	}
	
	
	public static void main(String[] args) {
		WaitNotifyDemo wnd=new WaitNotifyDemo();
		
		Thread t1=new Thread(wnd,"green");
		Thread t2=new Thread(wnd,"red");
		Thread t3=new Thread(wnd,"blue");
		
		t1.start();
		t2.start();
		t3.start();
	}

	
}
