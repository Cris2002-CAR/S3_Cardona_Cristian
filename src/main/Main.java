package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private Scanner reader = new Scanner(System.in);

	public Main() {

	}

	public static void main(String[] args) {
		
		int continuee = 0;
		do {
		Main obj = new Main();
		obj.menu();
		}while(continuee == 0);
	}

	public void menu() {
		
		System.out.println("Calculadora de conjuntos");
		System.out.println("1. Union " + "\n2. Diferencia" + "\n3: Interseccion" + "\n4: Salir");
		
		System.out.print("Escoge una opcion: ");
		int option = reader.nextInt();
		reader.nextLine();
		System.out.println();

		switch (option) {

		case 1:
			union();
			break;

		case 2:
			diference();
			break;

		case 3:
			intersection();
			break;

		case 4:
			System.exit(0);
			break;

		default:
			System.out.println("Opcion invalida");
			break;

		}

	}

	private void intersection() {

		System.out.println("Cuantos elementos tendra el conjunto A ?");
		int numA = reader.nextInt();
		reader.nextLine();

		String[] conA = new String[numA];

		Set<String> a = new HashSet<String>();

		System.out.println("Ingresa los elementos del conjunto A");

		for (int i = 0; i < numA; i++) {

			System.out.print((i + 1) + "." + " elemento:");
			conA[i] = reader.nextLine();

		}

		a.addAll(Arrays.asList(conA));

		System.out.println("Cuantos elementos tendra el conjunto B ?");
		int numB = reader.nextInt();
		reader.nextLine();

		String[] conB = new String[numB];

		Set<String> b = new HashSet<String>();

		System.out.println("Ingresa los elementos del conjunto B");

		for (int i = 0; i < numB; i++) {

			System.out.print((i + 1) + "." + " elemento:");
			conB[i] = reader.nextLine();
			

		}

		b.addAll(Arrays.asList(conB));

		Set<String> intersection = new HashSet<String>(a);
		intersection.retainAll(b);

		System.out.print("La interseccion de A y B :");
		System.out.println(intersection);

	}

	private void diference() {

		System.out.println("Cuantos elementos tendra el conjunto A ?");
		int numA = reader.nextInt();
		reader.nextLine();

		String[] conA = new String[numA];

		Set<String> a = new HashSet<String>();

		System.out.println("Ingresa los elementos del conjunto A");

		for (int i = 0; i < numA; i++) {

			System.out.print((i + 1) + "." + " elemento:");
			conA[i] = reader.nextLine();

		}

		a.addAll(Arrays.asList(conA));

		System.out.println("Cuantos elementos tendra el conjunto B ?");
		int numB = reader.nextInt();
		reader.nextLine();

		String[] conB = new String[numB];

		Set<String> b = new HashSet<String>();

		System.out.println("Ingresa los elementos del conjunto B");

		for (int i = 0; i < numB; i++) {

			System.out.print((i + 1) + "." + " elemento:");
			conB[i] = reader.nextLine();
			

		}

		b.addAll(Arrays.asList(conB));

		System.out.println("De que forma sera la diferencia: ");
		System.out.println("1: (A - B)" + "\n2: (B - A)");
		
		System.out.print("Escoge una opcion: ");
		int option = reader.nextInt();
		reader.nextLine();
		System.out.println();

		switch (option) {

		case 1:

			Set<String> diference = new HashSet<String>(a);
			diference.removeAll(b);

			System.out.print("La diferencia de (A - B) :");
			System.out.println(diference);

			break;

		case 2:
			Set<String> diference2 = new HashSet<String>(b);
			diference2.removeAll(a);

			System.out.print("La diferencia de (B - A) es :");
			System.out.println(diference2);
			break;

		default:
			System.out.println("Opcion invalida");

		}

	}

	public void union() {

		System.out.println("Cuantos elementos tendra el conjunto A ?");
		int numA = reader.nextInt();
		reader.nextLine();

		String[] conA = new String[numA];

		Set<String> a = new HashSet<String>();

		System.out.println("Ingresa los elementos del conjunto A");

		for (int i = 0; i < numA; i++) {

			System.out.print((i + 1) + "." + " elemento:");
			conA[i] = reader.nextLine();
			

		}

		a.addAll(Arrays.asList(conA));

		System.out.println("Cuantos elementos tendra el conjunto B ?");
		int numB = reader.nextInt();
		reader.nextLine();

		String[] conB = new String[numB];

		Set<String> b = new HashSet<String>();

		System.out.println("Ingresa los elementos del conjunto B");

		for (int i = 0; i < numB; i++) {

			System.out.print((i + 1) + "." + " elemento:");
			conB[i] = reader.nextLine();

		}

		b.addAll(Arrays.asList(conB));

		Set<String> union = new HashSet<String>(a);

		union.addAll(b);

		System.out.print("Union de los conjuntos A y B: ");

		System.out.println(union);

	}

}
