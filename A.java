import mypack.subpack.subsubpack.PackageDemo;

public class A{
	protected void msg() {
		System.out.println("test protected");
	}

	public static void main(String args[]) {
		PackageDemo obj = new PackageDemo();
		obj.hello();
	} 

}