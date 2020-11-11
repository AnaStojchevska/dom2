package domasno2;

import java.util.Scanner;

public class Glavna {
	public static void main(String[] args) {
		Student s[]=new Student[100];
		int i,n,n1;
		String ime,prezime;
		Scanner sc=new Scanner(System.in);
		System.out.println("Vnesi broj na studenti:");
		n1=sc.nextInt();
		for(i=0; i<n1; i++) {
			
			System.out.println("Vnesi ime: ");
	    ime=sc.next();
		System.out.println("Vnesi prezime: ");
		prezime=sc.next();
		System.out.println("Vnesi broj na predmeti: ");
	    n=sc.nextInt();
		
		Ocenka o[]=new Ocenka[100];
		int ocenka;
	     String predmet, datumNaIspit;
		System.out.println("Vnesi go n:");
		n=sc.nextInt();

			for(j=0; j<n; j++) {
			System.out.println("Vnesi predmet: ");
	    predmet=sc.next();
		System.out.println("Vnesi datum na ispit: ");
		datumNaIspit=sc.next();
		System.out.println("vnesi ocenka: ");
	    ocenka=sc.nextInt();
		Ocenka 1=new Ocenka(predmet,datumNaIspit,ocenka);
		o[j]=o1;
		}
			Student s1=new Student(ime,prezime,n,o);
			s[i]=s1;
		}
	    for(i=0;i<n;i++) {
	    	System.out.println(s[i].getime());
	    	System.out.println(s[i].getprezime());
	    	System.out.println(s[i].getprosek());
	    	for(j=0;j<s[i].getn();j++) {
	    		System.out.println(s[i].geto().getpredmet());
	    		System.out.println(s[i].geto().getdatumNaIspit());
	    		System.out.println(s[i].geto().getocenka());
	    	}
	    for(i=0;i<n;i++) {
	    	o.getpredmet();
	    	o.getdatumNaIspit();
	    	o.getocenka();
	    }
	    }
	    	
	    	
	    }
	}
	