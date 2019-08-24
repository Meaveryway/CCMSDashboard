package CCMSDashBoard.Utilities.Constants;

import CCMSDashBoard.Model.Accident;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by Meave Dregonhive on 18/04/2018.
 */
public class Objects
{



    //public static ArrayList<Accident> Accidents = new ArrayList<>(); //Liste des accidents en cours
    public static ObservableList<Accident> Accidents;
    public static Accident FocusedAccident;

    /*
        validation.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Facture.fxml"));
        FicheController controller = new FicheController();

        JFXDialog facture = new JFXDialog(notif, loader.load(), JFXDialog.DialogTransition.CENTER); //La fiche est mise dans une boite de dialogue, qui est affiché sur notre StackPane
        facture.setOverlayClose(true); //pas de fermeture de la boite si on clique ailleurs
        notif.setDisable(false); //Affichage du StackPane
        facture.show();           //Affichage de la boite
        facture.setOnDialogClosed(new EventHandler<JFXDialogEvent>() {
            @Override
            public void handle(JFXDialogEvent event) {
                notif.setDisable(true);
            }
        });
    }catch (IOException exep)
    {
        System.out.println("fiche ERROR: " + exep);
        exep.printStackTrace();
    }
});









rech.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_PRESSED, event -> {
                String res = barreRecherche.getText();
                try {
                    Themes.produitFiche = Connect.recherche("NOM_COMMERCIAL", res, ConnectionManager.getConnection() ); //Recherche dans la BDD

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Fiche.fxml"));
                    FicheController controller = new FicheController();
                    loader.setController(controller);
                    ScrollPane pane = new ScrollPane(); //On a chargé une fiche (remplie avec les donneé du medicament resultat de recherche) dans un Pane

                    pane.setContent(loader.load());
                    pane.setMaxWidth(600);
                    pane.setMaxHeight(500);
                    pane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); //enleve la barre de defilement horizontale (setVbar pour la verticale)
                    pane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

                    JFXDialog fiche = new JFXDialog(notif, pane, JFXDialog.DialogTransition.CENTER); //La fiche est mise dans une boite de dialogue, qui est affiché sur notre StackPane
                    fiche.setOnDialogClosed(new EventHandler<JFXDialogEvent>() {
                                                @Override
                                                public void handle(JFXDialogEvent event) {
                                                    notif.setDisable(true);
                                                }
                                            });
                    Themes.NOTIF = notif;
                    notif.setDisable(false);
                    fiche.show();           //Affichage de la boite
                }catch (IOException exep)
                {
                    System.out.println("fiche ERROR: " + exep);
                    exep.printStackTrace();
                }
            });



            */


}
