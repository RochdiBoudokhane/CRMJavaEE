package tn.eprit.main.PointOfSale;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.PointOfSale;
import service.PointOfSaleServiceRemote;

public class PointOfSaleMainAdd {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String PointOfSaleJNDI = "Crm-ear/Crm-ejb/PointOfSaleService!service.PointOfSaleServiceRemote";
		Context context = new InitialContext();
		
		PointOfSaleServiceRemote saleService = (PointOfSaleServiceRemote) context.lookup(PointOfSaleJNDI);
		
		PointOfSale p1 = new PointOfSale(0, "Monastir", "Carte", 31500590, "Vente");
		PointOfSale p2 = new PointOfSale(0, "Tunis", "Telephone", 31500590, "Vente");
		PointOfSale p3 = new PointOfSale(0, "Sousse", "Fix", 31500590, "Vente");
		PointOfSale p4 = new PointOfSale(0, "Mahdia", "ligne", 31500590, "Vente");
		
		int idP1 = saleService.AddPointOfSale(p1);
		int idP2 = saleService.AddPointOfSale(p2);
		int idP3 = saleService.AddPointOfSale(p3);
		int idP4 = saleService.AddPointOfSale(p4);
		System.out.println("Point of Sale Added");
		
	}

}
