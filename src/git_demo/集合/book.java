package git_demo.集合;

public class book {
	 private int num;
	    private String name;
	    private double price;
	    private String press;
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getPress() {
			return press;
		}
		public void setPress(String press) {
			this.press = press;
		}
		public book(int num, String name, double price, String press) {
			super();
			this.num = num;
			this.name = name;
			this.price = price;
			this.press = press;
		}

}
