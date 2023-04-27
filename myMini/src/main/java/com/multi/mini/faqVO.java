package com.multi.mini;

public class faqVO {

	private int faq_no;
	private String category;
	private String title;
	private String content;
	private String writer;
	@Override
	public String toString() {
		return "faqVO [faq_no=" + faq_no + ", category=" + category + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + "]";
	}
	public int getFaq_no() {
		return faq_no;
	}
	public void setFaq_no(int faq_no) {
		this.faq_no = faq_no;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}


}
