package com.clubmatrix.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class JoinRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserLogin user;


    @ManyToOne
    @JoinColumn(name = "club_id", nullable = false)
    private Club club;

    private String status; 

    private LocalDateTime createdAt = LocalDateTime.now();


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public UserLogin getUser() {
        return user;
    }
    public void setUser(UserLogin user) {
        this.user = user;
    }

    public Club getClub() {
        return club;
    }
    public void setClub(Club club) {
        this.club = club;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
