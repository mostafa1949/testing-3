package CoffeeMachine.src;

public class CoffeeMachine {
CoffeeResources res;
String[] types = {"Espresso", "Latte", "Cappucino"};
		
		public CoffeeMachine(int w, int b,int m, int s){
			
			res= new CoffeeResources(w,m,b,s);
		}
		

		public String makeCoffee(String type) {
			if(checkResources(type)) {
				if(type=="Espresso") {
					res.water-=250;
					res.beans-=16;
					res.sugar-=1;
				}
				if(type=="Latte") {
					res.water-=350;
					res.milk-=75;
					res.beans-=14;
					res.sugar-=2;
				}
				if(type=="Cappucino") {
					res.water-=200;
					res.milk-=100;
					res.beans-=12;
					res.sugar-=3;
				}
				return type+" is done";
			}
			else {
				return "Insufficient resources";
			}
		}
		public boolean checkResources(String type) {
			if(type=="Espresso") {
				if(res.water<250 || res.beans<16 || res.sugar<1) {
					return false;
				}
				else return true;
				
			}
			else if(type=="Latte") {
				if(res.water<350 || res.milk<75 || res.beans<20 || res.sugar<2) {
					return false;
				}
				else return true;
				
			}
			else if(type=="Cappucino") {
				if(res.water<200 || res.milk<100 || res.beans<12 || res.sugar<3) {
					return false;
				}
				else return true;
				
			}
			else {
				return false;
			}
		}
}
