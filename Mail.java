package com.luxoft.oop.xtasks;

public class Mail {
    private Human from;
    private Human to;
    private String msg;

    @Override
    public String toString() {
        return "Mail{" +
                "from=" + from +
                ", to=" + to +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Mail() {
    }

    public Human getFrom() {
        return from;
    }

    public Human getTo() {
        return to;
    }

    public String getMsg() {
        return msg;
    }

    public void setFrom(Human from) {
        this.from = from;
    }

    public void setTo(Human to) {
        this.to = to;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
