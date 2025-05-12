package orgs;

public class SmartPhone {
	private String deviceName;
	private int price;
	private String ram_Storage;
	private double screenSize;

	public void setDeviceName(String dname) {
		this.deviceName = dname;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRamStorage(String ramStore) {
		this.ram_Storage = ramStore;
	}

	public void setScreenSize(double sSize) {
		this.screenSize = sSize;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public int getPrice() {
		return price;
	}

	public String getramStorage() {
		return ram_Storage;
	}

	public Double getScreenSize() {
		return screenSize;
	}

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.setDeviceName("HelloDevice");
		phone.setPrice(1000);
		phone.setRamStorage("1GB");
		phone.setScreenSize(1080);
		System.out.println("Device Name: "+phone.getDeviceName());
		System.out.println("Price: "+phone.getPrice());
		System.out.println("Ram/Storage: "+phone.getramStorage());
		System.out.println("ScreenSize: "+phone.getScreenSize());
	}
}
