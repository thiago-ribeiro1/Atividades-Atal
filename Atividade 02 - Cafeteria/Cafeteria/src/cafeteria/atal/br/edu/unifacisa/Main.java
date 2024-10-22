package cafeteria.atal.br.edu.unifacisa;

public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();


        // Adicionando pedidos
        Pedido pedido1 = new Pedido("Ingrid", false, "Café e Croissant");
        Pedido pedido2 = new Pedido("Matheus", false, "Café Expresso");
        Pedido pedido3 = new Pedido("Maria", true, "Café Preto");
        Pedido pedido4 = new Pedido("Diego", false, "Coca Cola");
        Pedido pedido5 = new Pedido("José", true, "Folhado de Frango");


        // Adicionando pedidos à cafeteria
        cafeteria.adicionarPedido(pedido1);
        cafeteria.adicionarPedido(pedido2);
        cafeteria.adicionarPedido(pedido3);
        cafeteria.adicionarPedido(pedido4);
        cafeteria.adicionarPedido(pedido5);


        // Visualizando pedidos
        System.out.println("\nPedidos na fila:");
        cafeteria.visualizarPedidos();

        // Cancelar pedido
        System.out.println("\nRemover pedido de Diego");
        cafeteria.removerPedido(pedido4);

        // Atualizando a prioridade do pedido
        System.out.println("\nAtualizar prioridade do pedido de Matheus");
        cafeteria.atualizarPrioridade(pedido2);

        // Processando pedidos
        while (!cafeteria.filaPedidos.isEmpty()) {
            System.out.println("\nProcessando o próximo pedido: " + cafeteria.processarProximoPedido());
            System.out.println("\nPedidos na fila:");
            cafeteria.visualizarPedidos();
        }
    }
}
