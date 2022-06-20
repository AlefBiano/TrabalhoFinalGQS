/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
/**
 *
 * @author biano
 */
public class Clientes {
    private final List<Cliente> listCliente;
	private static Clientes instance;

	private Clientes() {
		listCliente = new ArrayList<>();
		listCliente.add( new Cliente( "Anderson da Silva" ) );
		listCliente.add( new Cliente( "Felipe Martins" ) );
		listCliente.add( new Cliente( "João Gabriel" ) );
		listCliente.add( new Cliente( "Marcos Paulo" ) );
		listCliente.add( new Cliente( "André Menezes" ) );
                listCliente.add( new Cliente( "Rafael Costa" ) );
                listCliente.add( new Cliente( "Lucas Santana" ) );
                listCliente.add( new Cliente( "Matheus Borges" ) );
                listCliente.add( new Cliente( "Helder Jesus" ) );
                listCliente.add( new Cliente( "Fabiano Lima" ) );
        }

	public static Clientes getInstance() {
		if( instance == null ) {
			instance = new Clientes();
		}
		return instance;
	}

}
