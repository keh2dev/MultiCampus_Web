package com.multi.mini;

public class faqVO {

	private int faq_no;
	private String title;
	private String content;
	private String writer;

	@Override
	public String toString() {
		return "faqVO [faq_no=" + faq_no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

	public int getFaq_no() {
		return faq_no;
	}

	public void setFaq_no(int faq_no) {
		this.faq_no = faq_no;
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
