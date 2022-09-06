package com.javaassesment.methods;

public class gradeAssignment {
	String physics1Grade;
	String Grade;
	double pointer;
	SettersAndGetters student=new SettersAndGetters();
	
 public String grade(double marks) {
	 if(marks>90d) {
		 Grade="A1";
	 }
	 else if(marks>80d) {
		 Grade="A2";
	 }
	 else if(marks>70d) {
		 Grade="B1";
	 }
	 else if(marks>60d) {
		 Grade="B2";
	 }
	 else if(marks>50d) {
		 Grade="C1";
	 }
	 else if(marks>40d) {
		 Grade="C2";
	 }
	 else if(marks>33d ) {
		 Grade="D1";
	 }
	 else if(marks>21) {
		 Grade="E1";
	 }
	 else if(marks>0) {
		 Grade="E2";
	 }
	
	 return Grade;
	 
 }
 public double pointer(String Grade) {
	 if(Grade=="A1") {
		 pointer=10;	 
	 }
	 else if(Grade=="A2"){
		 pointer=9;
	 }
	 else if(Grade=="B1"){
		 pointer=8;
	 }
	 else if(Grade=="B2"){
		 pointer=7;
	 }
	 else if(Grade=="C1"){
		 pointer=6;
	 }
	 else if(Grade=="C2"){
		 pointer=5;
	 }
	 else if(Grade=="D"){
		 pointer=4;
	 }
	 else if(Grade=="E1"){
		 pointer=0 ;
	 }
	 else if(Grade=="E2"){
		 pointer=0;
	 }
	 return pointer;
 }
}
