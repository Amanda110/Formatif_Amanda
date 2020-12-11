/*
* @Author : jzagabe
* @Date : Nov. 26, 2020
* @Description : Programme permettant d'utiliser des méthodes
* pour afficher l'élément le plus grand / petit dans un tableau d'entiers 
* ou leurs indices
*/

	public class MethodesTableaux
	{

		public static void main(String[] args)
		{
			int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10};
			
			
			System.out.println(moyenneNotes(myTab));
	     
		}
		
		
		// methode pour afficher le plus grand
		static int plusGrandNum(int []Tab)
		{
			int max=0; // variable qui servira pour la valeur maximale
			for(int i=0;i<Tab.length;i++)
			{
				if(Tab[i]>max)
					max=Tab[i];
			}
			return max;
		}
		
		
		// methode pour afficher le plus petit nombre
			static int plusPetitNum(int []Tab)
			{
				int min=234567650; // variable qui servira pour la valeur minimale
				for(int i=0;i<Tab.length;i++)
				{
					if(Tab[i]<min)
						min=Tab[i];
				}
				return min;
			}

			
			
			// methode pour afficher l'index du plus grand nombre
			static int plusGrandIndex(int []Tab)
			{
				int max=0; // variable qui servira pour la valeur maximale
				int pos=0; // variable pour la position du plus grand nombre
				for(int i=0;i<Tab.length;i++)
				{
					if(Tab[i]>max)
					{
						max=Tab[i];
						pos=i;
					}
				}
				return pos;
			}
			
			// methode pour afficher l'index du plus petit nombre
			static int plusPetitIndex(int []Tab)
			{
				int min=2147483647; // variable qui servira pour la valeur la plus petite
				int pos=0; // variable pour la position de la plus petite valeur
				for(int i=0;i<Tab.length;i++)
				{
					if(Tab[i]<min)
						{
							min=Tab[i];
							pos=i;
						}
				}
				return pos;
			}

			/*méthode permettant d’afficher le nombre d’éléments d’un tableau 
	*		d’entiers dont la valeur est inférieure à 10
	*/
			static int plusPetitDix(int [] a)
			{
				int cpt=0; // compteur pour les valeurs <10
				
				for(int i=0;i<a.length;i++)
				{
					if (a[i]<10)
					cpt++;
				}
				return cpt;
			}

	/*
	 * Méthode permettant de dire si un élément 
	 * quelconque est présent ou non dans un tableau d’entiers
	 */
	static boolean isPresent(int []a, int x)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
				return true;
		}
		return false;
	}
	/*
	 * Méthode permettant de ranger en ordre croissant les éléments d’un tableau d’entiers
	 */

	static int [] croissant(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			int temp;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		return a;
		
	}

	static int [] croissant2(int []a)
	{
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1; // Pour pouvoir recommencer le comptage
			}
		}
		return a;
		
	}

	static int [] decroissant (int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int temp;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		return a;
	}

	//Méthode permettant de calculer et d’afficher la moyenne des éléments d’un tableau d’entiers

	static double moyenneNotes(int [] a)
	{
		int somme=0;
		for(int i=0;i<a.length;i++)
		{
			somme+=a[i];  // somme = somme+a[i];
		}
		return somme/a.length;
		
	}
	
	}
	


	
