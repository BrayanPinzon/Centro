package modelado;

import modelado.Animal;

public class Perro extends Animal {

    private int nivel;

    public Perro() {
        this.nivel = 0;
    }

    public Perro(String nombre, String raza, String color, int edad, int nivel) {
        super(nombre, raza, color, edad);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getDato(){
        return "Nombre : "+nombre+
                "\nRaza : "+raza+
                "\nColor : "+color+
                "\nEdad: "+edad+
                "\nToxo:"+nivel;
    }

}
