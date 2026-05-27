package exemplo_carro;

public class Carro{
    public int portas;
    public int velocidade;

    public void acelerar(int valor) {
        velocidade += valor;
    }

    static void main(){
        System.out.println("Estamos na classe Carro!");
    }
}