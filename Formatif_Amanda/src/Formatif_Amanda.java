/*
* @Author : Amanda Tishler
* @Date : Dec. 10, 2020
* @Description : Programme permettant d'utiliser des méthodes pour afficher la somme d'un tableau d'entiers, 
* tester si un tableau contient un élément donné, et retourner le même tableau reçu en paramètre 
* amputé du plus grand nombre de cet élément.
* 
*/

import java.util.Scanner;

public class Formatif_Amanda {

	public static void main(String[] args) 
	{
				
		int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10}; //déclarer le tableau d'entiers
		
	//	Afficher methode 1
		System.out.println(SommeTableau(myTab)); 
	
	//	Afficher methode 2	
		boolean present = ElementPresent(myTab); 
		if(present == true)
			System.out.println("présent");
			else
				System.out.println("pas présent");
		
	//  Afficher methode 3
		int [] a = (tableauAmpute(myTab));
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}			
	   
	}
	
	//1. Méthode permettant de calculer et d’afficher la somme des éléments d’un tableau d’entiers.
	static int SommeTableau(int [] a)
	{
		int somme=0; //variable qui servira pour la valeur de la somme
		
		for(int i=0;i<a.length;i++) 
		{
			somme+=a[i]; //somme = somme+a[i];
		}
		return somme;
	}
	
	//2. Méthode permettant de tester si un tableau contient un élément donné (fourni par l’utilisateur).
	static boolean ElementPresent(int [] a)
	{
		Scanner sc = new Scanner(System.in); 
		int element; // variable qui servira pour l'élément fourni par l'utilisateur
		element=sc.nextInt();
		sc.close();
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == element) // si l'élément est présent, retourner vrai
			return true;			
		} 
		return false; // si l'élément n'est pas présent, retourner faux		
	}
	
	//3. Méthode qui reçoit en paramètre un tableau d’entiers et qui retourne le même tableau amputé du plus grand nombre de cet élément.
	static int[] tableauAmpute(int [] a)
	{
		int index = MethodesTableaux.plusGrandIndex(a); // trouver l'index du plus grand entier
		int fin = a[index];
		a[index] = a[a.length-2];
		a[a.length-2] = fin; //changer la place du plus grand entier avec celui en avant-dernier
		
		int newIndex = MethodesTableaux.plusGrandIndex(a);
		int newFin = a[newIndex];
		a[newIndex] = a[a.length-1];
		a[a.length-1] = newFin; //changer la place du plus grand entier avec celui en dernier
			
		int [] b = new int [a.length-1]; //créé un nouveau tableau qui a un entier de moins
		for (int i=0; i < b.length; i++)
		{
			b[i] = a[i];
		} 
			
		return b;	
	} 
		
	
}