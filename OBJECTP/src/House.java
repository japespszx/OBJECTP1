import java.util.ArrayList;

/**
 * Created by John Paul San Pedro on 2/11/2015.
 */
public class House {
    private ArrayList<Tenant> tenant;

    public House() {
        tenant = new ArrayList<Tenant>();
    }

    public void addTenant(Tenant x) {
        this.tenant.add(x);
    }

    public void displayAllTenants() {
        for (Tenant x : tenant) {
            System.out.println(x.getName());
        }
    }
}
