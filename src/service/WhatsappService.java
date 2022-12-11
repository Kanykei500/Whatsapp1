package service;

import classes.Profile;
import enums.Status;

public interface WhatsappService {
    String changeStatus();
    String createWhatsAppUserName();
    String getWhatsAppStatus();

    String changeWhatsAppStatus();

    Profile getProfile();


    Status getStatus();
}
