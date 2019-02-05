import java.util.Scanner;

public class pagination {
	public static void main(String[] args) {
		
		System.out.println("Enter A or a to display 10 entities per page");
		System.out.println("Enter B or b to display 20 entities per page");
		System.out.println("Enter C or c to display 50 entities per page");
		System.out.println("Enter D or d to display 100 entities per page");
		System.out.println("Enter E or e to display 200 entities per page");
		System.out.println("------------------------------------");
		
		
		//input the entity per page 
		System.out.print("Enter:");
		Scanner input = new Scanner(System.in);
		char letter =input.next().charAt(0);
		
		
		//entity of total page
		int entity = 150;
		int entityPerPage;
		switch (letter) {
			case 'a':
			case 'A':
				entityPerPage= 10;
				break;
			case 'b':
			case 'B':
				entityPerPage= 20;
				break;
			case 'c':
			case 'C':
				entityPerPage= 50;
				break;
			case 'd':
			case 'D':
				entityPerPage= 100;
				break;
			case 'e':
			case 'E':
				entityPerPage= 200;
				break;
			default:
				entityPerPage= 5;
		}	
		
		//out put entity and entity per page
		System.out.println("Entities:"+ entity);
		System.out.println("Entities To Display Per Page:"+ entityPerPage);
		System.out.println("====================================");
		
		//Out put the number of page 
		int pageNumber=0;
		System.out.print("|");
		do {
			pageNumber++;
			//when entity more than entityPerPage output entityPerPage
			if(entity > entityPerPage) {
				System.out.print("Page"+pageNumber+":"+entityPerPage+"|");
			//if entity less than entityPerPage output last value of entity 
			}else {
				System.out.print("Page"+pageNumber+":"+entity+"|");
			}
		//minus the total of entity 
			entity -= entityPerPage;
		//while entity less than 0 stop the loop
		} while (entity > 0);
		
		
	}
}
