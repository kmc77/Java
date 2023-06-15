package ex21_3_insert_delete_update;

public class GoodsInfo {

	private String code;
	private String name;
	private int price;
	private String maker;

	// 이곳에서 마우스 오른쪽 버튼 클릭 -> Source -> Generate toString()
	@Override
	public String toString() {
		// return "GoodsInfo [code=" + code + ", name=" + name + ", price=" + price + ",
		// maker=" + maker + "]";
		return code + "\t" + String.format("%-10s\t", name) + price + "\t" + maker;
	}

	// 이곳에서 마우스 오른쪽 버튼 클릭 -> Source -> Generate Getters and Setters
	// -> Select All

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

}
