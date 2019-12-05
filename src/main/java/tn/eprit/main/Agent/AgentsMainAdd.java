package tn.eprit.main.Agent;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.Agent;
import service.AgentServiceRemote;



public class AgentsMainAdd {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String AgentJNDI = "Crm-ear/Crm-ejb/AgentService!service.AgentServiceRemote";
		Context context = new InitialContext();
		
		AgentServiceRemote agentService = (AgentServiceRemote) context.lookup(AgentJNDI);
		
		Agent a1 = new Agent(0, "rochdi.boudokhane@esprit.tn", "Boudokhane", 53408230, "Rochdi", 0);
		Agent a2 = new Agent(0, "rochdi.boudokhane@esprit.tn", "Boudokhane", 53408230, "Rochdi", 1);
		Agent a3 = new Agent(0, "mohamed.boudokhane@esprit.tn", "Boudokhane", 52272125, "Mohamed", 0);
		Agent a4 = new Agent(0, "mohamed.boudokhane@esprit.tn", "Boudokhane", 52272125, "Mohamed", 0);

		int idRochdi1 = agentService.addAgent(a1);
		int idRochdi2 = agentService.addAgent(a2);
		int idMohamed1 = agentService.addAgent(a3);
		int idMohamed2 = agentService.addAgent(a4);
		System.out.println("Agent Added");
			
	}

}
