package application.domain;

import java.time.LocalDate;
import java.util.Scanner;

public class Booking {
    Scanner sc = new Scanner(System.in);
    private static int counter = 0;

    private int id;
    private String date;
    private int cantidad;
    private int guestId;
    private int servicesId;
    private int bedRoomId;

    public Booking(){
        counter++;
        this.id = counter;
    }
    public Booking(String date, int cantidad, int guestId, int servicesId, int bedRoomId){
        counter++;
        this.id = counter;
        this.date = date;
        this.cantidad = cantidad;
        this.guestId = guestId;
        this.servicesId = servicesId;
        this.bedRoomId = bedRoomId;
    }

    public int getId() {
        return id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getServicesId() {
        return servicesId;
    }

    public void setServicesId(int servicesid) {
        this.servicesId = servicesid;
    }

    public int getBedRoomId() {
        return bedRoomId;
    }

    public void setBedRoomId(int bedRoom) {
        this.bedRoomId = bedRoom;
    }
    public Booking createBooking(Booking booking){


        System.out.println("Ingrese la fecha de la reserva");
        String date = sc.nextLine();
        booking.date = date;

        System.out.println("Ingrese lacantidad de personas de la reserva");
        int cantidad = sc.nextInt();
        booking.cantidad = cantidad;
        sc.nextLine();

        System.out.println("Ingrese el email del huesped");
        int guestId = sc.nextInt();
        booking.guestId = guestId;
        sc.nextLine();


        System.out.println("Ingrese la contraseña");
        int servicesId = sc.nextInt();
        booking.servicesId = servicesId;
        sc.nextLine();


        System.out.println("Ingrese el estado del huesped");
        int bedRoomId = sc.nextInt();
        booking.bedRoomId = bedRoomId;

        return booking;
    }
    public void getBookingById(int id , Booking booking){


        if(this.id == id){
            System.out.println("Id:" + booking.id + "\n" +
                    "Fecha: " + booking.date + "\n" +
                    "Cantidad de personas: " + booking.cantidad + "\n" +
                    "ID del huesped: " + booking.guestId + "\n" +
                    "ID del servicio: "  + booking.servicesId + "\n" +
                    "ID de la habitacion: " + booking.bedRoomId + "\n");


        }else{
            System.out.println("Valide el id de la reserva que esta consultando");
        }

    }
}
