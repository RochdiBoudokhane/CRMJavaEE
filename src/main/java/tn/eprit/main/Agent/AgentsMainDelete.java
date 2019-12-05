package tn.eprit.main.Agent;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import service.AgentServiceRemote;

public class AgentsMainDelete {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String AgentJNDI = "Crm-ear/Crm-ejb/AgentService!service.AgentServiceRemote";
		Context context = new InitialContext();
		
		AgentServiceRemote agentService = (AgentServiceRemote) context.lookup(AgentJNDI);
		
		agentService.removeAgent(4);
		System.out.println("Agent Removed");
	}

}
