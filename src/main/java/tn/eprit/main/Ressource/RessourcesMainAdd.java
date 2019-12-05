package tn.eprit.main.Ressource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.Ressource;
import service.RessourceServiceRemote;

public class RessourcesMainAdd {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String RessourceJNDI = "Crm-ear/Crm-ejb/RessourceService!service.RessourceServiceRemote";
		Context context = new InitialContext();
		
		RessourceServiceRemote ressourceService = (RessourceServiceRemote) context.lookup(RessourceJNDI);
		
		Ressource r1 = new Ressource(0, 0, "Materiel", "electronique");
		Ressource r2 = new Ressource(0, 1, "Materiel", "electronique");
		Ressource r3 = new Ressource(0, 1, "flyers", "publicite");
		Ressource r4 = new Ressource(0, 0, "flyers", "publicite");
		
		int idR1 = ressourceService.AddRessource(r1);
		int idR2 = ressourceService.AddRessource(r2);
		int idR3 = ressourceService.AddRessource(r3);
		int idR4 = ressourceService.AddRessource(r4);
		System.out.println("Ressource Added");
	}

}
