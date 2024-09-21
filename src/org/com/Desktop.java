package org.com;

public class Desktop implements Hardware,Software {

	@Override
	public void softwareResourses() {
		System.out.println("Software Resourses");
	}

	@Override
	public void hardwareResourses() {
		System.out.println("Hardware Resourses");
	}
	private void desktopModel1() {
		System.out.println("Desktop Model1");
	}
	private void addToKart() {
		System.out.println("Hai");


	}
	private void payment() {
	System.out.println("Hello");
	}
	
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel1();
	d.softwareResourses();
	d.hardwareResourses();
}
}
