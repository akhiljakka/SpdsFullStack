package com.spds.spds.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int entry_id                ;
    private String name                    ;
    private String email                   ;
    private String password                ;
    private String social_id               ;
    private String picture                 ;
    private String uuid                    ;
    private String mobile                  ;
    private String date                    ;
    private String otp                     ;
    private String otp_status              ;
    private String otp_token               ;
    private String email_subscription      ;
    private String device_id               ;
    private String referral_code           ;
    private String referral_by             ;
    private double wallet_balance          ;
    private int city_id                 ;
    private String source                  ;
    private String status                  ;
}
