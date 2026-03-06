package application.domain;

import java.util.Scanner;

public class Services {

    Scanner sc = new Scanner(System.in);

    private static int counter = 0;

   private final int idService;
   private String serviceName;
   private int price;
   private String state;

   public Services(){
       counter++;
         this.idService = counter;
   }
   public Services (String serviceName, int price, String state){
       counter++;
       this.idService = counter;
       this.serviceName = serviceName;
       this.price = price;
       this.state = state;
   }

    public int getIdService() {
        return idService;
    }
   //set id no existe ya que el id se asigna automaticamente

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Services createSercice(Services services){


        System.out.println("Ingrese el nombre del servicio");
        String serviceName = sc.nextLine();
        services.serviceName = serviceName;

        System.out.println("Ingrese el apellido del huesped");
        int price = sc.nextInt();
        services.price = price;

        System.out.println("Ingrese el email del huesped");
        String state = sc.nextLine();
        services.state = state;


        return services;
    }
    public void getServiceById(int id , Services services){


        if(this.idService == id){
            System.out.println("Id:" + services.idService + "\n" +
                    "Nombre del sercicio: " + services.serviceName + "\n" +
                    "precio del servicio: " + services.price + "\n" +
                    "Estado del servicio: " + services.state + "\n");


        }else{
            System.out.println("Valide el id del huesped que esta consultando");
        }
        }
}
