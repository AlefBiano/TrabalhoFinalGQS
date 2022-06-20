/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author biano
 */
public class Desconto {
        private String desconto;
	private double percentual;

	public Desconto( String desconto, double percentual ) {
		this.desconto = desconto;
		this.percentual = percentual;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto( String desconto ) {
		this.desconto = desconto;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual( double percentual ) {
		this.percentual = percentual;
	}
    
}
