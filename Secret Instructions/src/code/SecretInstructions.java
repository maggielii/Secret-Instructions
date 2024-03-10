package code;

import java.util.Scanner;

public class SecretInstructions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String instruction	= "";
		String output = "";
		int direction = 0;
		int temp = 0;
		
		do 
		{
			
			instruction = input.next();
			
			if(Integer.parseInt(instruction) == 99999)
			{
				break;
			}
			
			char[] instructionArray = instruction.toCharArray();
			
			int n1 = instructionArray[0] - '0';
			int n2 = instructionArray[1] - '0';

			if( (n1+n2) == 0)
			{
				if(direction == 1)
				{
					output += "left";
				}
				else 
				{
					output += "right";
				}
			}
			else if( ( (n1+n2) % 2 ) == 0 )
			{
				output += "right";
				direction = 0;
			}
			else 
			{
				output += "left";
				direction = 1;
			}
			
			output += " ";
			
			output += instructionArray[2];
			output += instructionArray[3];
			output += instructionArray[4];
			output += "\r\n";
			
		}while (Integer.parseInt(instruction) != 99999);

		System.out.println(output);
	}

}
