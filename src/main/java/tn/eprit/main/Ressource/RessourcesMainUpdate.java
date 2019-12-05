package tn.eprit.main.Ressource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import service.AgentServiceRemote;

public class RessourcesMainUpdate {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String AgentJNDI = "Crm-ear/Crm-ejb/AgentService!service.AgentServiceRemote";
		Context context = new InitialContext();
		
		AgentServiceRemote agentService = (AgentServiceRemote) context.lookup(AgentJNDI);
	}

}
