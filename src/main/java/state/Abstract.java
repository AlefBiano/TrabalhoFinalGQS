/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;


/**
 *
 * @author biano
 */
public class Abstract {
    private static final String erro = "O estado é inválido";

	public Abstract criar() throws Exception {
		throw new Exception( erro );
        }
        
        public Abstract incluirItem() throws Exception {
		throw new Exception( erro );
        }
        
        public Abstract concluir() throws Exception {
		throw new Exception( erro );
	}

	public Abstract cancelar() throws Exception {
		throw new Exception( erro );
	}

	public Abstract pagar() throws Exception {
		throw new Exception( erro );
	}

	public Abstract preparar() throws Exception {
		throw new Exception( erro );
	}

	public Abstract sairEntrega() throws Exception {
		throw new Exception( erro );
	}

	public Abstract entregar() throws Exception {
		throw new Exception( erro );
	}

	public Abstract avaliar() throws Exception {
		throw new Exception( erro );
	}
        
        public Abstract reembolsar() throws Exception {
		throw new Exception( erro );
	}
        
        public Abstract reporEstoque() throws Exception {
		throw new Exception( erro );
	}
}
