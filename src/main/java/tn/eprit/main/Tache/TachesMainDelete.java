package tn.eprit.main.Tache;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import service.TacheServiceRemote;

public class TachesMainDelete {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String TacheJNDI ="Crm-ear/Crm-ejb/TacheService!service.TacheServiceRemote";
		Context context = new InitialContext();
		
		TacheServiceRemote tacheService = (TacheServiceRemote) context.lookup(TacheJNDI);
		
		tacheService.removeTache(4);
		System.out.println("Tache Removed");
	}

}
