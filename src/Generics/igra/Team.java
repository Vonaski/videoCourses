package Generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> part = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }
    public void addNewPart(T p) {
        part.add(p);
        System.out.println("V comandu " + name + " bil dobavlen noviy uchastnik po imeni " + p.getName());
    }
    public void playWith( Team<T> team) {
        String winnerNAme;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerNAme = this.name;
        } else {
            winnerNAme = team.name;
        }
        System.out.println("Win team " + winnerNAme);
    }
}
