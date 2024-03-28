package pcmania;

import java.util.Scanner;

public class PcMania {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Declaração das Variaveis
        int op; 
        int cont; 
        int comprar;
        boolean saida;

        //Declaração dos objetos
        Computador[] pc = new Computador[3];
        Computador[] novaCompra = new Computador[100];
        MemoriaUSB m1 = new MemoriaUSB();
        MemoriaUSB m2 = new MemoriaUSB();
        MemoriaUSB m3 = new MemoriaUSB();
        Cliente c1 = new Cliente();

        //For para declarar cada um dos Campos do Array pc[]
        for (int i = 0; i < pc.length; i++) {
            pc[i] = new Computador();
        }

        //Dados do CLIENTE
        c1.nome = "Lucas";
        c1.cpf = 1877153124;

        //Dados das Memorias
        m1.nome = "Pen-drive";
        m1.capacidade = 16;
        m2.nome = "Pen-drive";
        m2.capacidade = 32;
        m3.nome = "HD Externo";
        m3.capacidade = 1000;

        //Dados do PRIMEIRO Computador
        pc[0].marca = "Positivo";
        pc[0].preco = 3300f;
        pc[0].hb[0].nome = "Pentium Core i3 (2200 Mhz)";
        pc[0].hb[0].capacidade = 1200f;
        pc[0].hb[1].nome = "Memoria RAM";
        pc[0].hb[1].capacidade = 8f;
        pc[0].hb[2].nome = "HD";
        pc[0].hb[2].capacidade = 500f;
        pc[0].so.nome = "Linux Ubuntu";
        pc[0].so.tipo = 32;
        pc[0].usb = m1;

        //Dados do SEGUNDO Computador
        pc[1].marca = "Acer";
        pc[1].preco = 8800f;
        pc[1].hb[0].nome = "Pentium Core i5";
        pc[1].hb[0].capacidade = 3370f;
        pc[1].hb[1].nome = "Memoria RAM";
        pc[1].hb[1].capacidade = 16f;
        pc[1].hb[2].nome = "HD";
        pc[1].hb[2].capacidade = 1000f;
        pc[1].so.nome = "Windows 8";
        pc[1].so.tipo = 64;
        pc[1].usb = m2;

        //Dados do TERCEIRO Computador
        pc[2].marca = "Vaio";
        pc[2].preco = 4800f;
        pc[2].hb[0].nome = "Pentium Core i7";
        pc[2].hb[0].capacidade = 4500f;        
        pc[2].hb[1].nome = "Memoria RAM";
        pc[2].hb[1].capacidade = 32f;
        pc[2].hb[2].nome = "HD";
        pc[2].hb[2].capacidade = 2000f;
        pc[2].so.nome = "Windows 10";
        pc[2].so.tipo = 64;
        pc[2].usb = m3;

        //Menu de opções
        System.out.println("_____MENU_______");
        System.out.println("Digite 1 para ver a PRIMEIRA Promocao");
        System.out.println("Digite 2 para ver a SEGUNDA Promocao");
        System.out.println("Digite 3 para ver a TERCEIRA Promocao");
        System.out.println("Digite 0 para FINALIZAR a compra");
        System.out.println("______________");

        //Atribuições de Valores 
        System.out.print("Entre com o que deseja: ");
        op = teclado.nextInt(); //Entrada do operador
        saida = true; //Variavel para manter o WHILE
        cont = 0; //Variavel para colocar cada computador comprado em uma parte diferente do array 'novaCompra'

        //Validação de ENTRADA
        while (op != 0 && op != 1 && op != 2 && op != 3) {
            System.out.println("----------------MENU----------------");
            System.out.println("Digite 1 para ver a PRIMEIRA Promocao");
            System.out.println("Digite 2 para ver a SEGUNDA Promocao");
            System.out.println("Digite 3 para ver a TERCEIRA Promocao");
            System.out.println("Digite 0 para FINALIZAR a compra");
            System.out.println("-------------------------------------");
            System.out.print("Entre com o que deseja: ");
            op = teclado.nextInt();
        }

        while (saida) {
            switch (op) {
                case 1:
                    System.out.println("Dados da PRIMEIRA Promocao: ");
                    pc[0].mostraPCConfigs();
                    System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                    comprar = teclado.nextInt();
                    //Validação de ENTRADA
                    while (comprar != 1 && comprar != 0) {
                        System.out.println("");
                        System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                        comprar = teclado.nextInt();
                    }
                    while (comprar == 1) {
                        novaCompra[cont] = pc[0];
                        System.out.println("Deseja comprar mais um desse produto?"
                                + " (1 - comprar, 0 -  sair)");
                        comprar = teclado.nextInt();

                        //Validação de ENTRADA
                        while (comprar != 1 && comprar != 0) {
                            System.out.println("");
                            System.out.println("Deseja comprar mais um desse produto?"
                                    + " (1 - comprar, 0 -  sair)");
                            comprar = teclado.nextInt();
                        }
                        cont++;
                    }
                    break;

                case 2: //Caso seja 2 os dados da PRIMEIRA promoção serão mostrados 
                    System.out.println("Dados da PRIMEIRA Promocao: ");
                    pc[1].mostraPCConfigs();
                    System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                    comprar = teclado.nextInt();
                    //Validação de ENTRADA
                    while (comprar != 1 && comprar != 0) {
                        System.out.println("");
                        System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                        comprar = teclado.nextInt();
                    }
                    while (comprar == 1) {
                        novaCompra[cont] = pc[1];
                        System.out.println("Deseja comprar mais um desse produto?"
                                + " (1 - comprar, 0 -  sair)");
                        comprar = teclado.nextInt();
                        //FLAG
                        while (comprar != 1 && comprar != 0) {
                            System.out.println("");
                            System.out.println("Deseja comprar mais?"
                                    + " (1 - comprar, 0 -  sair)");
                            comprar = teclado.nextInt();
                        }
                        cont++;
                    }
                    break;

                case 3: //Caso seja 2 os dados da PRIMEIRA promoção serão mostrados 
                    System.out.println("Primeira Promocao: ");
                    pc[2].mostraPCConfigs();

                    System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                    comprar = teclado.nextInt();

                    //Validação de ENTRADA
                    while (comprar != 1 && comprar != 0) {
                        System.out.println("");
                        System.out.println("Deseja realizar a compra? (1 - comprar, 0 -  sair)");
                        comprar = teclado.nextInt();
                    }

                    while (comprar == 1) {

                        novaCompra[cont] = pc[2];
                        System.out.println("Deseja comprar mais um desse produto?"
                                + " (1 - comprar, 0 -  sair)");
                        comprar = teclado.nextInt();

                        //Validação de ENTRADA
                        while (comprar != 1 && comprar != 0) {
                            System.out.println("");
                            System.out.println("Deseja comprar mais um desse produto?"
                                    + " (1 - comprar, 0 -  sair)");
                            comprar = teclado.nextInt();
                        }
                        cont++;
                    }

                    break;

                case 0:

                    saida = false;

                    break;

                default:

                    System.out.println("Entrada nao valida!");
            }
            if (saida) {
                System.out.println("_____MENU_______");
                System.out.println("Digite 1 para ver a PRIMEIRA Promocao");
                System.out.println("Digite 2 para ver a SEGUNDA Promocao");
                System.out.println("Digite 3 para ver a TERCEIRA Promocao");
                System.out.println("Digite 0 para FINALIZAR a compra");
                System.out.println("______________");

                //Atribuições de Valores 
                System.out.print("Entre com o que deseja: ");
                op = teclado.nextInt(); //Entrada do operador

                //Validação de ENTRADA
                while (op != 0 && op != 1 && op != 2 && op != 3) {
                    System.out.println("");
                    System.out.println("_____MENU_______");
                    System.out.println("Digite 1 para ver a PRIMEIRA Promocao");
                    System.out.println("Digite 2 para ver a SEGUNDA Promocao");
                    System.out.println("Digite 3 para ver a TERCEIRA Promocao");
                    System.out.println("Digite 0 para FINALIZAR a compra");
                    System.out.println("______________");
                    System.out.print("Entre com o que deseja: ");
                    op = teclado.nextInt();
                }
                System.out.println("");
            }
        }

        //Mostrar configurações dos computadores comprados
        System.out.println("Computadores COMPRADOS:");
        for (int i = 0; i < novaCompra.length; i++) {
            if (novaCompra[i] != null) {
                novaCompra[i].mostraPCConfigs();
            }
        }
        // Atribuição de compras
        c1.pc = novaCompra;
        
        //Saida de Dados
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("Valor TOTAL da Compra: R$" + c1.calculaTotalCompra());
        System.out.println("--------------------------------");
        System.out.println("");

    }

}