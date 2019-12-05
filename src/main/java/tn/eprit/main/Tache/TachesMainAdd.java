package tn.eprit.main.Tache;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.Tache;
import java.util.Date;
import service.TacheServiceRemote;


public class TachesMainAdd {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String TacheJNDI = "Crm-ear/Crm-ejb/TacheService!service.TacheServiceRemote";
		Context context = new InitialContext();
		
		TacheServiceRemote tacheService = (TacheServiceRemote) context.lookup(TacheJNDI);
		
		Tache t1 = new Tache(0, new Date(01,03,2010), new Date(01,03,2011), "depannage");
		Tache t2 = new Tache(0, new Date(02,04,2010), new Date(02,04,2011), "vente de ligne");
		Tache t3 = new Tache(0, new Date(03,05,2010), new Date(03,05,2011), "Service Clients");
		Tache t4 = new Tache(0, new Date(04,06,2010), new Date(04,06,2011), "Service après vente");
		
		int idTache1 = tacheService.AddTache(t1);
		int idTache2 = tacheService.AddTache(t2);
		int idTache3 = tacheService.AddTache(t3);
		int idTache4 = tacheService.AddTache(t4);
		System.out.println("Tache Added");

	}

}
