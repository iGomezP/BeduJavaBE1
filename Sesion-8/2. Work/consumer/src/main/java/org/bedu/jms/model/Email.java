package org.bedu.jms.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Getter & Setter
@Data
// Constructor vacío
@NoArgsConstructor
public class Email {
    private String subject;
    private String to;
    private String from;
    private String body;
}
