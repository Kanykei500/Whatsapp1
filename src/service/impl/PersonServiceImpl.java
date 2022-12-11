package service.impl;

import classes.Passport;
import classes.Profile;
import enums.Country;
import enums.Gender;
import enums.Status;
import service.PersonService;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl  implements PersonService {
    private List<Passport>passportList=new ArrayList<>();

    public List<Passport> getPassportList() {
        return passportList;
    }

    public void setPassportList(List<Passport> passportList) {
        this.passportList = passportList;
    }


    @Override
    public Passport getPassportFirstName() {
        try {
            System.out.println("First name");
            String firstName = new Scanner(System.in).nextLine();

            if (firstName.isEmpty())
                throw new Exception("First name can't be isEmpty");
            for (Passport passport : passportList) {
                if (passport.getFirstName().equals(firstName)) {
                    return passport;
                }

            }
            throw new Exception("Error");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String createPassport() {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("ID");
            int id=scanner.nextInt();

            System.out.println("Last name: ");
            String lastName=new Scanner(System.in).nextLine();

            System.out.println("First name: ");
            String firstName=new Scanner(System.in).nextLine();

            System.out.println("Country: ");
            String country=new Scanner(System.in).nextLine();

            System.out.println("Gender: ");
            String gender=new Scanner(System.in).nextLine();

            System.out.println("Date of birth (yy-mm-dd)");
            String[] dateOfBirth=new Scanner(System.in).nextLine().trim().split("-");

            if (id<0)
                throw new Exception("ID ters san bolbosh kerek");
            if (id==0)
                throw new Exception("ID 0 san bolbosh kerek");

            if (dateOfBirth.length !=3)
                throw new Exception("Error");
            LocalDate localDate=LocalDate.of(
                    Integer.parseInt(dateOfBirth[0]),
                    Integer.parseInt(dateOfBirth[1]),
                    Integer.parseInt(dateOfBirth[2])
            );

            Passport passport=new Passport(id,lastName,firstName,localDate,
                    Country.valueOf(country), Gender.valueOf(gender));
            passportList.add(passport);



        }catch (Exception e){
            e.printStackTrace();
        }
        return "Pasport sozdan uspeshno";
    }


}
