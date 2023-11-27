import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private Set<Departement> departements;


    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }



    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dept : departements) {
            if (dept.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement dept : departements) {
            System.out.println(dept);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);
    }
}