package application.domain;

import java.util.Scanner;

public class Guest {

    Scanner sc = new Scanner(System.in);
    //esta bariable se utiliza para asignar automaticamente el id del usuario
    private static int counter = 0;
    private  final int id;
    private  String name;
    private  String lastName;
    private  String email;
    private  String password;
    private  boolean state;
    private  String origin;
    private  String guestType;


    public Guest() {
        counter++;
        this.id = counter;
    }
    public Guest(int id, String name, String lastName, String email, String password, Boolean state, String origin, String guestType) {
        counter++;
        this.id = counter;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
        this.origin = origin;
        this.guestType = guestType;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }
    public Guest createGuest(Guest guest){


        System.out.println("Ingrese el nombre del huesped");
        String name = sc.nextLine();


        System.out.println("Ingrese el apellido del huesped");
        String lastName = sc.nextLine();
        guest.lastName = lastName;

        System.out.println("Ingrese el email del huesped");
        String email = sc.nextLine();
        guest.email = email;


        System.out.println("Ingrese la contraseña");
        String password = sc.nextLine();
        guest.password = password;


        System.out.println("Ingrese el estado del huesped");
        boolean state = sc.nextBoolean();
        guest.state = state;

        System.out.println("Ingrese el lugar de origen del huesped");
        String origin = sc.nextLine();
        guest.origin = origin;


        System.out.println("Ingrese el tipo de huesped");
        String guestType = sc.nextLine();
        guest.guestType = guestType;


        return guest;
    }
    public void getGuestById(int id , Guest guest){


        if(this.id == id){
            System.out.println("Id:" + guest.id + "\n" +
                    "Nombre: " + guest.name + "\n" +
                    "Apellido: " + guest.lastName + "\n" +
                    "Email: " + guest.email + "\n" +
                    "Origen: "  + guest.origin + "\n");


        }else{
            System.out.println("Valide el id del huesped que esta consultando");
        }

    }
}
