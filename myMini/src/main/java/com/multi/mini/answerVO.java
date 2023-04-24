package com.multi.mini;

import java.sql.Timestamp;

public class answerVO {

	private int answer_no;
	private int ask_no;
	private String content;
	private String writer;
	private Timestamp writtentime;

	public int getAnswer_no() {
		return answer_no;
	}

	public void setAnswer_no(int answer_no) {
		this.answer_no = answer_no;
	}

	public int getAsk_no() {
		return ask_no;
	}

	public void setAsk_no(int ask_no) {
		this.ask_no = ask_no;
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

	@Override
	public String toString() {
		return "answerVO [answer_no=" + answer_no + ", ask_no=" + ask_no + ", content=" + content + ", writer=" + writer
				+ ", writtentime=" + writtentime + "]";
	}

}
