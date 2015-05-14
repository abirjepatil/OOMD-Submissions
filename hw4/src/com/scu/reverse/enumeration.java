package com.scu.reverse;

public class enumeration {

	
	
	public enum IceCreamFlavors {
		VANILLA (1.99,1.3) {
			public void IceCreamFlavors (int price, int weight)
			{
				this.price=price;
				this.weight=weight;
			}
			
			@Override
			void rateFlavor(int rating) {
				// TODO Auto-generated method stub
				/*
				is in range 1-4; "ok" if rating is in range 5 - 7; 
				"tasty" if rating is in range 8-10
				*/
				
				if(rating<11)
				{
					if(rating>=1&&rating<=4)
					{
						
						System.out.println("Bland");
					}
					
					if(rating>=5&&rating<=7)
					{
						
						System.out.println("Ok");
					}
					else if(rating>=7&&rating<=10)
						{
						System.out.println("Tasty");
						
					}

				}
			}
		}, CHOCOLATE (2.99,1.4)  {
			public void IceCreamFlavors (int price, int weight)
			{
				this.price=price;
				this.weight=weight;
			}
			
			@Override
			void rateFlavor(int rating) {
				// TODO Auto-generated method stub
				if(rating<11)
				{
					if(rating>=1&&rating<=4)
					{
						
						System.out.println("Bland");
					}
					
					if(rating>=5&&rating<=7)
					{
						
						System.out.println("Ok");
					}
					else if(rating>=7&&rating<=10)
							{
						System.out.println("Tasty");
						
					}

				}
				
			}
		}, STRAWBERRY (3.99,1.5) {
			public void IceCreamFlavors (int price, int weight)
			{
				this.price=price;
				this.weight=weight;
			}
			
			@Override
			void rateFlavor(int rating) {
				// TODO Auto-generated method stub
				if(rating<11)
				{
					if(rating>=1&&rating<=4)
					{
						
						System.out.println("Bland");
					}
					
					if(rating>=5&&rating<=7)
					{
						
						System.out.println("Ok");
					}
					else if(rating>=7&&rating<=10)
					{
						System.out.println("Tasty");
						
					}

				}
				
			}
		}, MINT(4.99,1.6) {
			
			
			
			@Override
			void rateFlavor(int rating) {
				// TODO Auto-generated method stub
				if(rating<11)
				{
					if(rating>=1&&rating<=4)
					{
						
						System.out.println("Bland");
					}
					
					if(rating>=5&&rating<=7)
					{
						
						System.out.println("Ok");
					}
					else if(rating>=7&&rating<=10)
						{
						System.out.println("Tasty");
						
					}

				}
				
			}
		};
		double price;
		double weight;
	
				private IceCreamFlavors(double price,double weight) {
					// TODO Auto-generated constructor stub
					this.price=price;
					this.weight=weight;
				}
		
				abstract void rateFlavor(int rating);



				
	}
	
	
	
	/*
	 * Use the following prices and weights:
	 *   {VANILLA, CHOCOLATE, STRAWBERRY, MINT}: 
	 *    PRICES: {1.99, 2.99, 3.99, 4.99},
	 *     WEIGHTS: {1.3, 1.4, 1.5, 1.6}
	 * 
	 */
	
	public static void main(String[] args)
	{
		
		IceCreamFlavors a= IceCreamFlavors.VANILLA;
		
		IceCreamFlavors b = IceCreamFlavors.CHOCOLATE;
		IceCreamFlavors c = IceCreamFlavors.STRAWBERRY;
		IceCreamFlavors d = IceCreamFlavors.MINT;
		a.rateFlavor(1);
		  System.out.println(a.name()+" :The ordinal is = " +a.ordinal()+" Price :"+a.price+"  Weight:"+a.weight+"");
		  System.out.println(b.name()+" The ordinal is = " +b.ordinal()+" Price :"+b.price+"  Weight:"+b.weight+"");
		  System.out.println(c.name()+ " The ordinal is = " +c.ordinal()+" Price :"+c.price+"  Weight:"+c.weight+"");
		  System.out.println(d.name()+" The ordinal is = " +d.ordinal()+" Price :"+d.price+"  Weight:"+d.weight+"");
				
		
	}
}
