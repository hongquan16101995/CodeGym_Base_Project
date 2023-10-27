package com.codegym.base.socket;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String senderName;
    private String receiveName;
    private String message;
    private String date;
    private Status status;
}
