package cr.ac.ucr.parchis.controller;
import cr.ac.ucr.parchis.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Clase que controla la comunicación entre la vista y el modelo.
public class ParchisController implements ActionListener{
    //Referencias
    private GUIInicio guiPrincipal;
    private GUICreditos guiCreditos;
    private GUIInstrucciones guiInstruc;
    private GUIHistoria guiHistoria;
    private PanelButtons panelButtons;


    public ParchisController() {
        //Se crean las instancias de los objetos y se visualiza la pantalla de inicio
        this.guiPrincipal = new GUIInicio();
        this.guiPrincipal.setVisible(true);
        this.guiCreditos = new GUICreditos();
        this.guiInstruc = new GUIInstrucciones();
        this.guiHistoria = new GUIHistoria();
        this.panelButtons=this.guiPrincipal.getPanelButtons();
        //Se llama el metodo de escuchar de los botones
        this.panelButtons.setListener(this);
        this.guiCreditos.setListener(this);
        this.guiInstruc.setListener(this);
        this.guiHistoria.setListener(this);

        

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Se ejecutan las acciones de cada boton segun el actionCommand
        switch(e.getActionCommand()){
        
            case "Jugar":
                break;
                
            case "Instrucciones":
                guiPrincipal.setVisible(false);
                guiInstruc.setVisible(true);
                break;
                
            case "Atras Instruc":
                guiInstruc.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
                
            case "Creditos":
                guiPrincipal.setVisible(false);
                guiCreditos.setVisible(true);
                break;
                
            case "Atras Creditos":
                guiCreditos.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
                
            case "Historia":
                guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                break;
                
            case "Atras Historia":
                guiHistoria.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
                
            case "Salir":
                System.exit(0);
                break;
           
        
        }
    }
}
