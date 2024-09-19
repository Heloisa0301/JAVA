package org.example;

public class Main {
    public static void main(String[] args) {
       Peixe peixe = new Peixe("peixe", "Nemo");
       Gaviao gaviao = new Gaviao("Gaviao", "Fiel");
       Cavalo cavalo = new Cavalo("Cavalo", "Pe de Pano");
       Pato pato = new Pato("Pato", "Pato");

       peixe.nadar();
       gaviao.voar();
       cavalo.andar();

       pato.nadar();
       pato.voar();
       pato.andar();
    }
}