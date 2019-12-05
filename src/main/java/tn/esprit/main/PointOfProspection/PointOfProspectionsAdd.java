package tn.esprit.main.PointOfProspection;

import javax.naming.NamingException;

import model.PointOfProspection;
import service.PointOfProspectionServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;

public class PointOfProspectionsAdd {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String PointOfProspectionJNDI = "Crm-ear/Crm-ejb/PointOfProspectionService!service.PointOfProspectionServiceRemote";
		Context context = new InitialContext();
		
		PointOfProspectionServiceRemote prospectionService = (PointOfProspectionServiceRemote) context.lookup(PointOfProspectionJNDI);
		
		PointOfProspection p1 = new PointOfProspection(0, "Tunis", "Service", "Vente");
		PointOfProspection p2 = new PointOfProspection(0, "Sousse", "Service", "Vente");
		PointOfProspection p3 = new PointOfProspection(0, "Monastir", "Service", "Technicien");
		PointOfProspection p4 = new PointOfProspection(0, "Mahdia", "Service", "publicité");
		
		int idP1 = prospectionService.AddPointOfProspection(p1);
		int idP2 = prospectionService.AddPointOfProspection(p2);
		int idP3 = prospectionService.AddPointOfProspection(p3);
		int idP4 = prospectionService.AddPointOfProspection(p4);
		System.out.println("Point of Prospection");

	}

}
