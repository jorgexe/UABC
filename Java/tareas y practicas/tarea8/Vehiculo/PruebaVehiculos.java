package tarea8.Vehiculo;

public class PruebaVehiculos {
    public static void main(String[] args) {
        // Crear objetos de cada clase concreta
        Avion avion = new Avion("Boeing 747", 2000, 40000);
        Helicoptero helicoptero = new Helicoptero("Apache", 2010, 10000);
        Automovil automovil = new Automovil("Toyota Camry", 2022, 200);
        Motocicleta motocicleta = new Motocicleta("Honda CBR", 2021, 250);
        Lancha lancha = new Lancha("Speedboat 2000", 2015, 10);
        Yate yate = new Yate("Luxury Yacht", 2018, 30);
        Drone drone = new Drone("DJI Phantom", 2019, 1000);
        Bicicleta bicicleta = new Bicicleta("Mountain Bike", 2020, 30);

        // Mostrar información de los vehículos
        System.out.println("Información del Avión:");
        System.out.println(avion.toString());

        System.out.println("\nInformación del Helicóptero:");
        System.out.println(helicoptero.toString());

        System.out.println("\nInformación del Automóvil:");
        System.out.println(automovil.toString());

        System.out.println("\nInformación de la Motocicleta:");
        System.out.println(motocicleta.toString());

        System.out.println("\nInformación de la Lancha:");
        System.out.println(lancha.toString());

        System.out.println("\nInformación del Yate:");
        System.out.println(yate.toString());

        System.out.println("\nInformación del Drone:");
        System.out.println(drone.toString());

        System.out.println("\nInformación de la Bicicleta:");
        System.out.println(bicicleta.toString());
    }
}
