package pl.com.botega.moddoc.preparation;

public class CreateQDocDraft {
	private final String title;
	private final String type;

	public CreateQDocDraft(String title, String type) {
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}
}
