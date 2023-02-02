package org.system;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("desktop size is 26 inches");
}
public static void main(String[] args) {
	Desktop dt=new Desktop();
	dt.computerModel();
	dt.desktopSize();
}
}
