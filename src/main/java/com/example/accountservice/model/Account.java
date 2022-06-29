package com.example.accountservice.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id;
    @Column(name="fulname")
    public String fulname;
    @Column(name="link_avatar")
    public String linkAvatar;
    @Column(name="dob")
    public LocalDate dob;
    @Column(name="gender")
    public boolean gender;
    @Column(name="link_facebook")
    public String linkFacebook;
    @Column(name="list_friend_id")
    public String listFriendId;
    @Column(name="date_up_vip")
    public LocalDateTime dateUpVip;
    @Column(name="date_expiration")
    public LocalDateTime dateExpiration;
    @Column(name="address")
    public String address;
    @Column(name="email")
    public String email;
    @Column(name="company_name")
    public String companyName;
    @Column(name="description")
    public String description;
    @Column(name="phone_number")
    public String phoneNumber;
    @Column(name="website")
    public String website;
    @Column(name = "unique_id", updatable = false)
    public String unique_id;
    @Column(name="username")
    public String username;
    @Column(name="password")
    public String password;
    @Column(name="account_type")
    public String accountType;
    @Column(name="is_deleted")
    public boolean isDeleted;

    public Account(int id, String fulname, String linkAvatar, LocalDate dob, boolean gender, String linkFacebook, String listFriendId,
                   LocalDateTime dateUpVip, LocalDateTime dateExpiration, String address, String email, String companyName, String description,
                   String phoneNumber, String website, String unique_id, String username, String password, String accountType, boolean isDeleted) {
        this.id = id;
        this.fulname = fulname;
        this.linkAvatar = linkAvatar;
        this.dob = dob;
        this.gender = gender;
        this.linkFacebook = linkFacebook;
        this.listFriendId = listFriendId;
        this.dateUpVip = dateUpVip;
        this.dateExpiration = dateExpiration;
        this.address = address;
        this.email = email;
        this.companyName = companyName;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.unique_id = unique_id;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.isDeleted = isDeleted;
    }

    public Account() {

    }
    //UserAccount
    public Account(int id, String fulname, String linkAvatar, LocalDate dob, boolean gender, String linkFacebook, String listFriendId, LocalDateTime dateUpVip, LocalDateTime dateExpiration, String address, String email, String unique_id, String username, String password, String accountType, boolean isDeleted) {
        this.id = id;
        this.fulname = fulname;
        this.linkAvatar = linkAvatar;
        this.dob = dob;
        this.gender = gender;
        this.linkFacebook = linkFacebook;
        this.listFriendId = listFriendId;
        this.dateUpVip = dateUpVip;
        this.dateExpiration = dateExpiration;
        this.address = address;
        this.email = email;
        this.unique_id = unique_id;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.isDeleted = isDeleted;
    }
    //CompanyAccount
    public Account(String address, String email, String companyName, String description, String phoneNumber, String website, String unique_id, String username, String password, String accountType, boolean isDeleted) {
        this.address = address;
        this.email = email;
        this.companyName = companyName;
        this.description = description;
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.unique_id = unique_id;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }

    public String getFulname() {
        return fulname;
    }

    public String getLinkAvatar() {
        return linkAvatar;
    }

    public LocalDate getDob() {
        return dob;
    }

    public boolean isGender() {
        return gender;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public String getListFriendId() {
        return listFriendId;
    }

    public LocalDateTime getDateUpVip() {
        return dateUpVip;
    }

    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountType() {
        return accountType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }
}