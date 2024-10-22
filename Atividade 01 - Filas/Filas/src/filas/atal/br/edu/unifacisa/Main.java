package filas.atal.br.edu.unifacisa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Filas<String> fila = new Filas<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("╔═════════════════════════════════════════╗");
            System.out.println("║               MENU DE OPÇÕES            ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1. Adicionar com offer                  ║");
            System.out.println("║ 2. Adicionar com add                    ║");
            System.out.println("║ 3. Exibir o primeiro elemento com peek  ║");
            System.out.println("║ 4. Remover com remove                   ║");
            System.out.println("║ 5. Remover com poll                     ║");
            System.out.println("║ 6. Listar                               ║");
            System.out.println("║ 7. Sair                                 ║");
            System.out.println("╚═════════════════════════════════════════╝");;
            System.out.println("╔═════════════════════════════════════════╗");
            System.out.println("║   Digite sua opção:                     ║");
            System.out.println("╚═════════════════════════════════════════╝");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Adicionar elemento com offer: ");
                    String adicionarOffer = sc.nextLine();
                    fila.offer(adicionarOffer);
                    break;

                case 2:
                    System.out.print("Adicionar elemento com add: ");
                    String adicionar = sc.nextLine();
                    try {
                        fila.add(adicionar);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    String peekElemento = fila.peek();
                    if (peekElemento != null) {
                        System.out.println("Primeiro elemento da fila: " + peekElemento);
                    } else {
                        System.out.println("Fila vazia");
                    }
                    break;

                case 4:
                    try {
                        String remover = fila.remove();
                        System.out.println("Elemento removido: " + remover);
                    } catch (Exception e) {
                        System.out.println("Fila vazia");
                    }
                    break;

                case 5:
                    String removerComPoll = fila.poll();
                    if (removerComPoll != null) {
                        System.out.println("Elemento removido com poll: " + removerComPoll);
                    } else {
                        System.out.println("Fila vazia");
                    }
                    break;

                case 6:
                    fila.exibirFila();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}
