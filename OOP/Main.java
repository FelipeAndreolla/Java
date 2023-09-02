package OOP;

public class Main {
    public static void main(String[] args)
    {
        Cao cachorro = new Cao();
        cachorro.nome = "Bob";        
        cachorro.Anda();
        System.out.println(cachorro.nome);

        Cao dog = new Cao("Luizinho", 15);
        dog.DadosCao();
    }
}
