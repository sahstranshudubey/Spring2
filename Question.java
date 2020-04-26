package com.capgemini.org.bean;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
public class Question {
    @Id
	private BigInteger questionId;
	private String questionTitle;
	private String questionOptions[];
	private int choice;
	private BigDecimal marksScored;
	private BigDecimal questionMarks;
	private int chosenAnswer;
	
	public BigInteger getQuestionId() {
		return questionId;
	}
	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public BigDecimal getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}
	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public void printQuestion() {
		Question q=new Question();
		System.out.println("questionTitle"+q.getQuestionTitle());
		
	}
	
	
	
}
