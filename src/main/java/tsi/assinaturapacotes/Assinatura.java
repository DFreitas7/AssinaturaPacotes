package tsi.assinaturapacotes;

import java.util.HashSet;

public class Assinatura {
    private final Pacote[] pacotes;
    private final Float valor;

    public Assinatura(HashSet<Pacote> pacotes, Float valor) {
        this.pacotes = new Pacote[pacotes.size()];
        pacotes.toArray(this.pacotes);
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder stringPacotes = new StringBuilder("\t pacotes: {\n");
        
        for(Pacote pacote : pacotes) {
            stringPacotes.append("\t\t ");
            stringPacotes.append(pacote.toString());
            stringPacotes.append("\n");
        }
        
            stringPacotes.append("\t}\n");
        if (pacotes.length > 0) {
            return "Assinatura com pacotes: { \n" +
                "\t valor: " + valor + ",\n" +
                stringPacotes.toString()
                +"}";
        }
        
        return "Assinatura base: { \n" +
                "\t valor: " + valor + "\n}";
    }
}
