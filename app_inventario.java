import java.net.URI;

import javax.swing.DesktopManager;
import javax.swing.JOptionPane;

public class app_inventario {

  static cls_productos[] productos  = new cls_productos[100];
  static int int_posicionesP = 0;

  public static void main(String[] args){
    fnt_menuP(true);
  }
  private static void fnt_menuP(boolean men){
    while(men == true) {
      int m = Integer.parseInt(JOptionPane.showInputDialog(null, 
      "MENU PRINCIPAL\n" + 
      "1. Registrar producto\n " +
      "2. Consultar producto\n " +
      "3. Acutalizar producto\n " +
      "4. Registro de compras\n " +
      "5. Reportes\n " +
      "6. Salir\n "));
    }
  }
}
