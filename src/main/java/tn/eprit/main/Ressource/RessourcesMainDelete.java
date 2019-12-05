package tn.eprit.main.Ressource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import service.RessourceServiceRemote;

public class RessourcesMainDelete {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String RessourceJNDI = "Crm-ear/Crm-ejb/RessourceService!service.RessourceServiceRemote";
		Context context = new InitialContext();
		
		RessourceServiceRemote ressourceService = (RessourceServiceRemote) context.lookup(RessourceJNDI);
		
		ressourceService.removeRessource(4);
		System.out.println("Ressource Removed");
	}

}
