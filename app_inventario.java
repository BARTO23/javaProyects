import javax.swing.JOptionPane;

public class app_inventario {

  static cls_productos[] productos  = new cls_productos[100];
  static int int_posicionesP = 0;

  public static void main(String[] args){
    fnt_menuP(true);
  }

  private static void fnt_registrar(String cod, String nom, String desc, int sto, float valor, float ga){
    productos[int_posicionesP] = new cls_productos(cod, nom, desc, sto, valor, ga);
    int_posicionesP +=1;
    JOptionPane.showMessageDialog(null, "Producto registrado", "Registrar",
    JOptionPane.INFORMATION_MESSAGE);
  }

  private static void fnt_selector(int opcion){
    if (opcion == 1){
      
    }
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
      fnt_selector(m);
    }
  }
}
