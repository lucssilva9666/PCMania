package pcmania;

public class Computador {
    //Atributos
    public String marca;
    public float preco;
    public SistemaOperacional so; //-> Composição
    public HardwareBasico[] hb; //-> Composição 
    public MemoriaUSB usb; //-> Agregação
    //Construtores 
    public Computador() {
        //Declaração dos Objetos
        so = new SistemaOperacional();
        hb = new HardwareBasico[3];
        //For para declarar cada um dos Campos do Array hb[]
        for (int i = 0; i < hb.length; i++) {
            hb[i] = new HardwareBasico();
        }
    }

    //Metodos
    public void mostraPCConfigs() {
        System.out.println("Marca: " +marca);
        System.out.println("Preco: R$" + preco);
        System.out.print("Hardware: ");
        
        for (int i = 0; i < hb.length; i++) {
            System.out.print(" \n -> " + hb[i].nome + " " + hb[i].capacidade);
        }
        System.out.println("");
        System.out.println("Sistema Operacional: " + so.nome + " (" + so.tipo + " bits)");
        System.out.println("Acompanhamentos: " + usb.nome + " " + usb.capacidade + "Gb");
        System.out.println("___________________________________________");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        usb = musb;
    }
}
