package DigitalWatch.src;

public class DigitalWatch {

    private String state, state1, time, date;
    private int m, h, D, M, Y;

    public DigitalWatch() {
        state = "NORMAL";
        state1 = "time";
        m = 0;
        h = 0;
        D = 1;
        M = 1;
        Y = 2000;
    }

    public void forInput(char i) {
        switch (state) {
            case "NORMAL":
                if (i == 'c') {
                    state = "UPDATE";
                    state1 = "min";
                } else if (i == 'b') {
                    state = "ALARM";
                    state1 = "alarm";
                } else if (i == 'a' && state1=="time") {
                    state1 = "date";
                }else if (i == 'a' && state1=="date") {
                    state1 = "time";
                }
            case "UPDATE":
                if (i == 'd' || (i == 'a' && state1=="year")) {
                    state = "NORMAL";
                    state1 = "time";
                } else if (i == 'a') {
                    switch (state1) {
                        case "min":
                            state1 = "hour";
                            break;
                        case "hour":
                            state1 = "day";
                            break;
                        case "day":
                            state1 = "month";
                            break;
                        case "month":
                            state1 = "year";
                    }
                } else if (i == 'b') {
                    switch (state1) {
                        case "min":
                            if(m==59) {
                                m=0;
                            }else {
                                m++;
                            }
                            break;
                        case "hour":
                            if(h==23) {
                                h=0;
                            }else {
                                h++;
                            }
                            break;
                        case "day":
                            if(D==31) {
                                D=0;
                            }else {
                                D++;
                            }
                            break;
                        case "month":
                            if(M==12) {
                                M=0;
                            }else {
                                M++;
                            }
                            break;
                        case "year":
                            Y++;
                    }
                }
            case "ALARM":
                if (i == 'd') {
                    state = "NORMAL";
                    state1 = "time";
                } else if (state1=="alarm" && i == 'a') {
                    state1= "chime";
                }
        }
        time = h + " : " + m;
        date = D + "/" + M + "/" + Y;
    }


    public String getState(){
        return state;
    }

    public String getInnerState(){
        return state1;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }
    public int getMin() {
        return m;
    }
    public int getHr() {
        return h;
    }
    public int getDay() {
        return D;
    }


}