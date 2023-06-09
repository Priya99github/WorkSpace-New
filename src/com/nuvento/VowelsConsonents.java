package com.nuvento;

public class VowelsConsonents {

	public static void main(String[] args) {
		String a = "Padmapriya";
		char [] ch = a.toCharArray();
		int vowelsCount=0;
		int consonentCount=0;
		
		for (int i =0; i<a.length(); i++) {
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		        vowelsCount++;
			}
			else {
			    consonentCount++;	
			}
		}
		System.out.println("vowels Count : "+vowelsCount);
		System.out.println("Consonents Count : "+consonentCount);
	}

}
