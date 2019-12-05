package tn.eprit.main.Agent;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.PointOfProspection;
import model.PointOfSale;
import model.Tache;
import service.AgentServiceRemote;

public class AgentsMainAffecterTacheAAgent {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String AgentJNDI = "Crm-ear/Crm-ejb/AgentService!service.AgentServiceRemote";
		Context context = new InitialContext();
		
		AgentServiceRemote agentService = (AgentServiceRemote) context.lookup(AgentJNDI);
		
		Tache t = new Tache(1);
		PointOfProspection pop = new PointOfProspection(2);
		PointOfSale pos = new PointOfSale(1);
//		Object to = new Object();
//		to = t;
//		System.out.println(t.equals(to));
		
		agentService.AffecterTacheAAgent(t, 3);
		System.out.println("Mission Affected");

	}

}
