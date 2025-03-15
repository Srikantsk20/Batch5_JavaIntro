package Gwladys;

public class IfStatement {
    public static void main(String[] args) {
    int a = 15;
		int b = 10;
		int c = 20;
		// Simple If
		
		if (a > b) {  // 15 > 10 = True
			System.out.println("value of A is greater than B");
		}
		
		// If - else 
		if (a > b) {  // 15 > 10 = True
			System.out.println("value of A is greater than B");
		}
		else {
			System.out.println("value of B is greater than A");
		}
		
		
		// else if ladder
		
		int day = 7;
		
		if (day == 1 ) {  // 5 > 10 = F
			System.out.println("Day is Monday");
		} else if (day == 2 ) { // 5> 15 = F
			System.out.println("Day is Tuesday");
		} else if (day == 3 ) { // 5> 15 = F
			System.out.println("Day is Wednesday");
		} else if (day == 4 ) { // 5> 15 = F
			System.out.println("Day is Thursday");
		} else if (day == 5 ) { // 5> 15 = F
			System.out.println("Day is Friday");
		} else if (day == 6 ) { // 5> 15 = F
				System.out.println("Day is Saturday");
		} else if (day == 7 ) { // 5> 15 = F
			System.out.println("Day is Sunday");
		}
		else {
				System.out.println("Invalid day");	
		}
// Nested If
		
		if (a > b) {  // 15 > 10 = True
			if (a > c ) {  // 15 > 20 = False
				System.out.println("value of a is greater than b and c");
			} else {
				System.out.println("value of a is greater than b but less than c");
			}
		}
		else {
			System.out.println("value of B is greater than A");
		}
    
} }
