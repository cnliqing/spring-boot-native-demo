package com.li.example.nativedemo.enums;

public enum MessageType {

    /**
     * 文字
     */
    TEXT("text","文字"),

    /**
     * 语音
     */
    VOICE("voice","语音")
    ;

    private final String code;
    private final String desc;

    MessageType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

}