package ru.netology.data;

import lombok.Data;

@Data
public class UserInfo {
    private String login;
    private String password;
    private String verificationCode;
    private String[] cards;

    public UserInfo() {
        this.login = "vasya";
        this.password = "qwerty123";
        this.verificationCode = "12345";
        this.cards = new String[]{"5559 0000 0000 0001", "5559 0000 0000 0002"};
    }

    public String getCard(int indexCard) {
        return cards[indexCard];
    }
}

