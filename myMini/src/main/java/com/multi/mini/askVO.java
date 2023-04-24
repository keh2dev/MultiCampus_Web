package com.multi.mini;

import java.sql.Timestamp;

public class askVO {

	private int ask_no;
	private String title;
	private String content;
	private String writer;
	private Timestamp writtentime;
	private int answer_no;
	
	public int getAsk_no() {
		return ask_no;
	}
	public void setAsk_no(int ask_no) {
		this.ask_no = ask_no;
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
	public Timestamp getWrittentime() {
		return writtentime;
	}
	public void setWrittentime(Timestamp writtentime) {
		this.writtentime = writtentime;
	}
	public int getAnswer_no() {
		return answer_no;
	}
	public void setAnswer_no(int answer_no) {
		this.answer_no = answer_no;
	}

	@Override
	public String toString() {
		return "askVO [ask_no=" + ask_no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", writtentime=" + writtentime + ", answer_no=" + answer_no + "]";
	}
	
}
