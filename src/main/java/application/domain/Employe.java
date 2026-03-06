package application.domain;

import java.util.Scanner;

public class Employe {

    Scanner sc = new Scanner(System.in);

    //esta bariable se utiliza para asignar automaticamente el id del usuario
    private static int counter = 0;

    private final int id;
    private  String name;
    private  String lastName;
    private  String email;
    private  String password;
    private  boolean state;
    private  String rol;
    private  int salary;

    public Employe() {
        counter++;
        this.id = counter;
    }
    public Employe(String name, String lastName, String email, String password, Boolean state, String rol, int salary) {
        counter++;
        this.id = counter;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
        this.rol = rol;
        this.salary = salary;
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employe createEmploye(Employe Employe){


        System.out.println("Ingrese el nombre del empleado");
        String name = sc.nextLine();
        Employe.name = name;

        System.out.println("Ingrese el apellido del huesped");
        String lastName = sc.nextLine();
        Employe.lastName = lastName;

        System.out.println("Ingrese el email del huesped");
        String email = sc.nextLine();
        Employe.email = email;


        System.out.println("Ingrese la contraseña");
        String password = sc.nextLine();
        Employe.password = password;


        System.out.println("Ingrese el estado del huesped");
        boolean state = sc.nextBoolean();
        Employe.state = state;

        System.out.println("Ingrese el lugar de origen del huesped");
        String rol = sc.nextLine();
        Employe.rol = rol;


        System.out.println("Ingrese el tipo de huesped");
        int salary = sc.nextInt();
        Employe.salary = salary;
        sc.nextLine();

        return Employe;
    }
    public void getEmployeById(int id , Employe employe){


        if(this.id == id){
            System.out.println("Id:" + employe.id + "\n" +
                    "Nombre: " + employe.name + "\n" +
                    "Apellido: " + employe.lastName + "\n" +
                    "Email: " + employe.email + "\n" +
                    "Origen: "  + employe.rol + "\n" +
                    "Salario: " + employe.salary + "\n");


        }else{
            System.out.println("Valide el id del empleado que esta consultando");
        }

    }

}
