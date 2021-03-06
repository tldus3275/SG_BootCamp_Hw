package dev.gate.domain;

public class Qna {
	private String writer;
	
	private String title;
	
	private String contents;
	
	public Qna(){
		
	}

	public Qna(String writer, String title, String contents) {
		super();
		this.writer = writer;
		this.title = title;
		this.contents = contents;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Qna [writer=" + writer + ", title=" + title + ", contents=" + contents + "]";
	}
	
	

}
