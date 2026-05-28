package start;

import controller.ControllerImplementation;
import controller.IController;
import view.DataStorageSelection;
import view.Login;

/**
 * This class contains the main method, the entry point to the application.
 * @author Francesc Perez
 * @version 1.1.0
 */
public class Start {
    private static IController activeController;
    
    public static void main(String[] args) {
        Login loginWindow = new Login();
        loginWindow.setLocationRelativeTo(null);
        loginWindow.setVisible(true);
    }
    public static IController getController() {
        return activeController;
    }
}