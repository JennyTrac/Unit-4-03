/* Created by Jenny Trac
Created on Nov 8 2017
Program formats a mailing address using procedures */

import java.util.Scanner;

public class MailingAddress {

    public static String formataddressfirst(String apt, String address)
    {
    String firstline = apt + address;
    return firstline;
    }
    
    public static String formataddresssecond(String city, String province, String postalcode)
    {
    String secondline = city + " " + province + "  " + postalcode;
    return secondline;
    }
    
    public static void main(String[] args)
    {
    // constants and variables
    String apartment = " ";
    Scanner problem_option = new Scanner(System.in);
    Scanner problem_apt = new Scanner(System.in);
    Scanner problem_address = new Scanner(System.in);
    Scanner problem_city = new Scanner(System.in);
    Scanner problem_province = new Scanner(System.in);
    Scanner problem_postal = new Scanner(System.in);
    
    // instructions
    System.out.println("Do you have an apartment? Enter 1 for yes, 2 for no:");
    
    int apartmentoption = (problem_option.nextInt());
    
    if (apartmentoption == 2)
        {
        apartment = " ";
        }
    else if (apartmentoption == 1)
        {
        System.out.println("Enter apartment number:");
        String apartment_input = (problem_apt.nextLine());
        apartment = apartment_input + " - ";
        }
    else
        {
        System.out.println("Not an option");
        }
    
    // input
    System.out.println("Enter street address:");
    String address_input = (problem_address.nextLine());
    System.out.println("Enter city:");
    String city_input = (problem_city.nextLine());
    System.out.println("Enter province:");
    String province_input = (problem_city.nextLine());
    System.out.println("Enter postal code/zip code:");
    String postal_input = (problem_postal.nextLine());
    
    // process
    String line1 = MailingAddress.formataddressfirst(apartment, address_input);
    String line2 = MailingAddress.formataddresssecond(city_input, province_input, postal_input);
    
    // output
    System.out.println(" ");
    System.out.println("Your mailing address is:");
    System.out.println(" ");
    System.out.println(line1);
    System.out.println(line2);
    }

}
