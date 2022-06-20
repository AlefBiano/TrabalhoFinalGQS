/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Imposto;

/**
 *
 * @author biano
 */
public class Impostos {
    private ArrayList<Imposto> impostos;
	private static Imposto instance;

	private Impostos() {
		impostos = new ArrayList<>();
		impostos.add( new Imposto( "ICMS", 7.00 ) );
                impostos.add( new Imposto( "ISS", 2.00 ) );
	}

	public static Imposto getInstance() {
		if( instance == null ) {
			instance = new Imposto();
		}
		return instance;
	}

	public List<Imposto> getImpostos() {
		return Collections.unmodifiableList( impostos );
	}
    
}
