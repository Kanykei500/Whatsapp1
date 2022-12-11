import enums.Country;
import service.PersonService;
import service.WhatsappService;
import service.impl.PersonServiceImpl;
import service.impl.WhatsappServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonServiceImpl personService=new PersonServiceImpl();
        WhatsappServiceImpl whatsappService=new WhatsappServiceImpl();

        while (true){
            System.out.print("""
1. CREATE PASSPORT
2. GET ALL PASSPORTS
3. REGISTER TO WHATSAPP
4. GET ALL WHATSAPP USER
5. CHANGE WHATSAPP STATUS
6. GET ALL WHATSAPP STATUSES
7. GET ALL COUNTRY
8. GO TO YOUR PROFILE
9. GET PASSPORT BY FIRST NAME
10. GET WHATSAPP STATUS BY USER
11. ADD CONTACT
12. SEND MESSAGE  

Write command:""");
            Scanner scanner=new Scanner(System.in);
            int number= scanner.nextInt();
            switch (number){

                case 1:
                    System.out.println(personService.createPassport());
                    break;
                case 2:
                    System.out.println(personService.getPassportList());
                    break;
                case 3:
                    System.out.println(whatsappService.createWhatsAppUserName());
                    break;
                case 4:
                    System.out.println(whatsappService.getProfile());
                    break;
                case 5:
                    System.out.println(whatsappService.changeWhatsAppStatus());
                    break;
                case 6:
                    System.out.println(whatsappService.getWhatsAppStatus());
                    break;
                case 7:
                    System.out.println("Countries:"+ Arrays.toString(Country.values()));
                    break;
                case 8:
                    System.out.println(whatsappService.getProfiles());
                    break;
                case 9:
                    System.out.println(personService.getPassportFirstName());
                    break;
                case 10:
                    System.out.println(whatsappService.getStatus());
                    break;
                default:
                    System.out.println("Default");


            }

        }




    }
}