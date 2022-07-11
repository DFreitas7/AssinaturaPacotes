package tsi.assinaturapacotes;

import java.util.HashSet;

public class AssinaturaBuilder {
    private Float valorBase;
    private final HashSet<Pacote> pacotes;
    
    public AssinaturaBuilder(Float valorBase) {
        this.valorBase = valorBase;
        pacotes = new HashSet<>();
    }
    
    public void adicionarPacote(Pacote pacote) {
        if (pacotes.contains(pacote)) {
            System.out.println("Este pacote já foi adicionado");
            return;
        }
        
        pacotes.add(pacote);
        System.out.println("Pacote adicionado: " + pacote);
    }
    
    public void removerPacote(Pacote pacote) {
        if (!pacotes.contains(pacote)) {
            System.out.println("Este pacote ainda não foi adicionado");
            return;
        }
        
        pacotes.remove(pacote);
        System.out.println("Pacote removido: " + pacote);
    }
    
    public void reset() {
        pacotes.clear();
    }
    
    public Assinatura build() {
        Float valorAssinatura = valorBase; 
        for (Pacote pacote : pacotes) {
            valorAssinatura += pacote.getValor();
        }
        
        return new Assinatura(pacotes, valorAssinatura);
    };
}
