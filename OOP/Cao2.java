package OOP;

public class Cao2 {
    private int idade;

    public void setIdade(int i){
        idade = i;
    }

    public int getIdade(){
        return idade;
    }

    public boolean VerificarIdade(){
        if(idade > 10){
            return true;
        } else {
            return false;
        }
    }
}
