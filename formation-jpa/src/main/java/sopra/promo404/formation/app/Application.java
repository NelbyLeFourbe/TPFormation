package sopra.promo404.formation.app;



import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpformation");

	

	
	private Application() {

	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
		
	}
}