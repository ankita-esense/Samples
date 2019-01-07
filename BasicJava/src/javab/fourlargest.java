package javab;

import java.util.Arrays;
import java.util.Scanner;

public class fourlargest {


	    public static void main(String[] args) {
	        int[] array = new int[10];
	        int count = 1;
	        boolean isNeeded = true;
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Enter your " + count + " number");
	            if (scanner.hasNextInt()) {
	                array[i] = scanner.nextInt();
	                count++;
	                if (count > 10) {
	                    break;
	                }
	            } else {
	                isNeeded = false;
	                System.out.println("Not an Integer");
	                break;
	            }

	        }
	        scanner.nextLine();
	        Arrays.sort(array);
	        if (isNeeded) {
	            System.out.println("The 4th largest number is " + array[6] + ".");
	            System.out.println("List of int if you want to check :" + Arrays.toString(array).replace("[", "").replace("]", ""));

	        }

	        scanner.close();

	    }
	}

	

