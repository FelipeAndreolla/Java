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


        Cao2 brother = new Cao2();
        brother.setIdade(20);

        if(brother.VerificarIdade()){
            System.out.println("Ele é idoso");
        } else {
            System.out.println("É novo.");
        }

    }
}
