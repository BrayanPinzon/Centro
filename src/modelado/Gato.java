/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

public class Gato extends Animal {

    private String toxo;

    public Gato(String par) {
        this.toxo = null;
    }

    public Gato(String nombre, String raza, String color, int edad, String toxo) {
        super(nombre, raza, color, edad);
        this.toxo = toxo;
    }

    public String getToxo() {
        return toxo;
    }

    public void setToxo(String toxo) {
        this.toxo = toxo;
    }
    public String getDato(){
        return "Nombre : "+nombre+
                "\nRaza : "+raza+
                "\nColor : "+color+
                "\nEdad: "+edad+
                "\nToxo:"+toxo;
    }

}
