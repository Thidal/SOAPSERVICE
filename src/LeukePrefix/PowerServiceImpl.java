package LeukePrefix;

import org.junit.Test;

import javax.jws.WebService;
import java.math.BigInteger;

@WebService( endpointInterface= "LeukePrefix.WSInterface")
public class PowerServiceImpl implements WSInterface {
	//Initialiseren Factory object
	ObjectFactory factory = new ObjectFactory();

	//Error handling voorbereiding
	private Fault_Exception createFault(String fault, String faultExeption, short code) {
		LeukePrefix.Fault x = factory.createFault();
		x.setErrorCode(code);
		x.setMessage(fault);
		Fault_Exception fe = new Fault_Exception(faultExeption, x);
		return fe;

	}

	@Override
	public Response calculatePower(Request request) throws Fault_Exception {

		//initialiseren Response-object
		Response response = factory.createResponse();

		//De getallen mogen niet lager dan de nulwaarde zitten
		if (request.getGetal1() <= 0) {
			response.setResult("Getal 1 kan niet lager zijn dan of gelijk zijn aan 0");
		} else if (request.getGetal2() <= 0) {
			response.setResult("Getal 2 kan niet lager zijn dan of gelijk zijn aan 0");
		} else if (request.getGetal3() <= 0) {
			response.setResult("Getal 3 kan niet lager zijn dan of gelijk zijn aan 0");
		} else {

			//initialiseren van de request middel voor de berekening
			double getal1 = request.getGetal1();
			double getal2 = request.getGetal2();
			double getal3 = request.getGetal3();

			//Totaal word berekend, deze wordt gebruikt in de berekeing van de percentage
			double totaal = getal1 + getal2 + getal3;

			try {
				//De 3 getallen worden omberekend naar percentages
				double per1 = getal1 / totaal * 100;
				double per2 = getal2 / totaal * 100;
				double per3 = getal3 / totaal * 100;

				//De response-object wordt "gevuld" met de string zodat deze kan worden geladen door onder andere SoapUI
				response.setResult("Uw percentages zijn: getal1: " + per1 + "%, getal2: " + per2 + "%, getal3: " + per3 + "%.");
			} catch (RuntimeException e) {
				//Error handling
				throw createFault("Er ging iets mis", "Er iets fout gegaan met de berekening", (short) 1);
			}
		}
		//Returned de uiteindelijk volledige response
		return response;
	}
}

