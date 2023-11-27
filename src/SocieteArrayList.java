import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getIdentifiant));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int compareNom = e1.getNom().compareTo(e2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }
                int compareDepartement = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }

}


