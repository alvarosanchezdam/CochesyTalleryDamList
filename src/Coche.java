/**
 * Created by DAM on 6/10/16.
 */
public class Coche {

    private String Matricula;
    private String Marca;
    private String Modelo;
    private double precio;

    public Coche(String matricula, String marca, String modelo, double precio) {
        Matricula = matricula;
        Marca = marca;
        Modelo = modelo;
        this.precio = precio;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
