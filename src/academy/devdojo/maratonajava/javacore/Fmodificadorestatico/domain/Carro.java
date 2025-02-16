package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 250;


    public Carro(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void imprime(){

        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Speed Limit : " + Carro.speedLimit);
        System.out.println("-------------------------");
    }


    public static void setSpeedLimit(double speedLimit){
        Carro.speedLimit = speedLimit;
    }

    public static double getSpeedLimit() {
        return speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
