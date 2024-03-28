package pcmania;

public class Cliente {
    public String nome;
    public long cpf;
    //Composição
    public Computador[] pc; 
    //Construtor
    Cliente() {  
        //Declaração do objeto
        pc = new Computador[3];
        //For para declarar cada um dos Campos do Array pc[]
        for (int i = 0; i < pc.length; i++) {
            pc[i] = new Computador();
        }
    }
    //Metodos
    public float calculaTotalCompra() {
        //Declaração da variavel que ira receber o valor total
        float total = 0;
        // For para realizar a soma de todos os produtos comprados
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                total = total + pc[i].preco;
            }
        }
        return total;
    }
}
