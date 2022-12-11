package service.impl;

import classes.Profile;
import enums.Status;
import service.WhatsappService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WhatsappServiceImpl implements WhatsappService {
    private List<Profile> profiles = new ArrayList<>();

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public String getWhatsAppStatus() {
        return List.of(Status.values()).toString();
    }


    @Override
    public String changeStatus() {
        return null;
    }

    @Override
    public String createWhatsAppUserName() {

        System.out.print("ID : ");
        int id = new Scanner(System.in).nextInt();


        System.out.print("Username : ");
        String username = new Scanner(System.in).nextLine().toLowerCase();

        System.out.print(" Password : ");
        String password = new Scanner(System.in).nextLine();

        System.out.print(" Phone number : ");
        String phoneNumber = new Scanner(System.in).nextLine().trim().toLowerCase();

        System.out.print(" Image: ");
        String image = new Scanner(System.in).nextLine();
        List<Profile> contacts = new ArrayList<>();
        List<String> messages = new ArrayList<>();
        Profile profile = new Profile(id, username, password, phoneNumber,
                image, Status.PRIVET_YA_ISPOLZUYU_WHATSAPP, contacts, messages);
        profiles.add(profile);
        return "WhatsApp uspeshno sozdan";
    }






    @Override
    public String changeWhatsAppStatus() {
        System.out.println("Username:");
        String userName=new Scanner(System.in).nextLine().toLowerCase();

        System.out.println("Password:");
        String password=new Scanner(System.in).nextLine();

        for (Profile profile:profiles) {
            if (profile.getUserName().equals(userName) && profile.getPassword().equals(password)){
                System.out.println("WhatsApp status:"+ Arrays.toString(Status.values()));
                System.out.println("Izmenit status:");
                int index=new Scanner(System.in).nextInt();
                profile.setStatus(Status.values()[index]);
                return "Status uspeshno izmenen";


            }

        }
        return null;
    }

    @Override
    public Profile getProfile() {
        System.out.println("Username:");
        String userName=new Scanner(System.in).nextLine().toLowerCase();

        System.out.println("Password:");
        String password=new Scanner(System.in).nextLine();
        for (Profile profile:profiles ) {
           if (profile.getUserName().equals(userName) && profile.getPassword().equals(password)){
               return profile;
           }
               

        }

        
        return null;
    }

    @Override
    public Status getStatus() {
        System.out.println("Username:");
        String userName=new Scanner(System.in).nextLine().toLowerCase();

        System.out.println("Password:");
        String password=new Scanner(System.in).nextLine();

        for (Profile profile:profiles ) {
            if (profile.getUserName().equals(userName) && profile.getPassword().equals(password)){
                return profile.getStatus();
            }

        }
        return null;
    }
}
