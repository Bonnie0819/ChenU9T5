import java.util.*;
public class Vet {

    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal animal) {
        if(clients.indexOf(animal) == -1) {
            System.out.println("Welcome to " + name + "'s Office, " + animal.getName() + " !");
            clients.add(animal);
        } else {
            System.out.println(animal.getName() + " is  already a client of " + name + " !");
        }
    }

}
