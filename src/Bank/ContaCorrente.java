package Bank;
import java.util.ArrayList;


public class ContaCorrente extends Conta {
    ArrayList<ContaCorrente> contasC = new ArrayList();
    
    private int tipoConta;

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
    
}
