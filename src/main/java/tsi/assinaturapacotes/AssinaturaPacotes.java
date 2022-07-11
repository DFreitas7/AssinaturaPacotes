package tsi.assinaturapacotes;

import java.util.Scanner;

public class AssinaturaPacotes {

    public static void main(String[] args) {
        Pacote[] pacotes = {
            new Pacote("Assitir vídeos em vários dispositivos", 19.99f),
            new Pacote("Frete grátis em produtos", 9.99f),
            new Pacote("Caixa surpresa com produtos relacionados a filmes e séries", 29.99f),
            new Pacote("Cartão de crédito Platinum", 49.99f),
            new Pacote("Compra com Cash Back", 19.99f)
        };
        
        System.out.println("Bem vindo ao serviço de Venda de Assinaturas");
        System.out.println("A Assinatura Base custa R$ 9,99 e te permite Assistir vídeos num único dispositivo");
        
        Integer comando;

        Scanner scanner = new Scanner(System.in);
        AssinaturaBuilder assinaturaBuilder = new AssinaturaBuilder(9.99f);
        do {
            System.out.println("Digite 1 para adicionar, 2 para remover um pacote, 3 para reiniciar ou 0 para finalizar");
            comando = Integer.parseInt(scanner.nextLine());
            
            switch (comando) {
                case 1:
                    System.out.println("Digite o numero de um pacote para adicionar");
                    for(Integer numeroPacote = 1; numeroPacote <= pacotes.length; numeroPacote++) {
                        System.out.println(numeroPacote.toString() + ": " + pacotes[numeroPacote-1]);
                    }
                    
                    comando = Integer.parseInt(scanner.nextLine());

                    if (comando >= 1  && comando <= pacotes.length + 1) {
                        assinaturaBuilder.adicionarPacote(pacotes[comando-1]);
                    } else {
                        System.out.println("Numero inválido");
                    }
                    break;
                case 2:
                    System.out.println("Digite o numero de um pacote para remover");
                    for(Integer numeroPacote = 1; numeroPacote <= pacotes.length; numeroPacote++) {
                        System.out.println(numeroPacote.toString() + ": " + pacotes[numeroPacote-1]);
                    }
                    
                    comando = Integer.parseInt(scanner.nextLine());

                    if (comando >= 1 && comando <= pacotes.length + 1) {
                        assinaturaBuilder.removerPacote(pacotes[comando-1]);
                    } else {
                        System.out.println("Numero inválido");
                    }
                    break;
                default:
                    System.out.println("Finalizando assinatura");
                    break;
            }
        } while(comando != 0);
        
        System.out.println(assinaturaBuilder.build());
    }
}
