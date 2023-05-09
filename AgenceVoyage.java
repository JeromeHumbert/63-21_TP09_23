import java.util.ArrayList;


public class AgenceVoyage  {
    private ArrayList<Voyage> voyagesReserves;

    public AgenceVoyage() {
        voyagesReserves = new ArrayList<>();
    }

    public void chargerDonnees(String path){
        // A développer
    }



    public static void main(String[] args) {
        AgenceVoyage aV = new AgenceVoyage();
        String localDir = System.getProperty("user.dir");
        if(System.getProperty("os.name").contains("Windows")){
            aV.chargerDonnees(localDir + "\\src\\LstVoyage.csv");
            aV.chargerDonnees(localDir + "\\src\\LstVoyage2.csv");
        }else{
            aV.chargerDonnees(localDir + "/src/LstVoyage.csv");
            aV.chargerDonnees(localDir + "/src/LstVoyage2.csv");
        }
        // A développer
    }
}
