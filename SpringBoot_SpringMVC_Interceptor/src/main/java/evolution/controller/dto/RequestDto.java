package evolution.controller.dto;

public class RequestDto {
	private String name;

	@Override
	public String toString() {
		return "RequestDto [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
