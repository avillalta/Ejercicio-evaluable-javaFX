package org.example.ejercicioevaluablejavafx.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String mail;
    private String platform;
    private Boolean is_admin;
    private Integer version;
    private String date;

}
