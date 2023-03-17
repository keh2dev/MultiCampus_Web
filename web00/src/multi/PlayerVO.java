package multi;

public class PlayerVO {
	private String no;
	private String name;
	private String height;
	private String weight;
	private String team;
	private String img;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "PlayerVO [no=" + no + ", name=" + name + ", height=" + height + ", weight=" + weight + ", team=" + team
				+ ", img=" + img + "]";
	}
	
	
}
