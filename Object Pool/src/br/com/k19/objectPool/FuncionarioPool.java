package br.com.k19.objectPool;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioPool implements Pool<Funcionario> {
	private List<Funcionario> funcionarios;
	
	public FuncionarioPool() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("Marcelo Martins"));
		this.funcionarios.add(new Funcionario("Rafael Cosentino"));
		this.funcionarios.add(new Funcionario("Jonas Hirata"));
	}
	

	@Override
	public Funcionario acquire() {
		if(this.funcionarios.size() > 0) {
			return this.funcionarios.remove(0);
		}else {
			return null;
		}
	}

	@Override
	public void release(Funcionario funcionario) {
		this.funcionarios.add(funcionario);

	}

}
