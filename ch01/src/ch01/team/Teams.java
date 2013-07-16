package ch01.team;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class Teams {
	private TeamsUtility utils;
	public Teams() {
		utils = new TeamsUtility();
		utils.make_test_teams();
	}
	
	@WebMethod
	public Team getTeam(String name) { return utils.getTeam(name); }
	
	@WebMethod
	public List<Team> getTeams() { return utils.getTeams(); }
}