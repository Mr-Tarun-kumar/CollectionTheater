package com.tarun;

public class Main {

    public static void main(String[] args) {
	Theatre theatre=new Theatre("olympion",8,12);
	theatre.getSeats();
	if (theatre.reserveSeat("H11")){
	    System.out.println("please pay");

    }else {
	    System.out.println("Sorry, seat is taken");
    }
        if (theatre.reserveSeat("H11")){
            System.out.println("please pay");

        }else {
            System.out.println("Sorry, seat is taken");
        }

    }
}
