

class Cliente {

    static int quantidade;

    private Conta() contas = new Conta[2];

    String nomeCompleto;
    String nomeSegTitular;
    String profissao;
    String email;
    int telefone;
    int dinheiroInicial;
}

public Cliente(String nomeCompleto, String nomeSegTitular, String profissao, String email, int telefone, int dinheiroInicial){
    this.nomeCompleto = nomeCompleto;
    this.nomeSegTitular = nomeSegTitular;
    this.profissao = profissao;
    this.email = email;
    this.telefone = telefone;
    this.dinheiroInicial = dinheiroInicial;
    quantidade++;
}

public Cliente(String nomeCompleto, String nomeSegTitular, int telefone){
    this(nomeCompleto, telefone Integer.parceint( .telefone));
}

void addCliente(Conta conta){
    contas[quantidade++] = conta;
}
void addCliente(String conta){
    addCliente(new Conta(Double.parceDouble(valor)));
}