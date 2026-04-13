package uniquindio.edu.co;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
public static void main(String []args ) {
    Empresa empresa = new Empresa("Oficina Ltda");
    int opcion = 0;

    while (opcion != 9) {
        String menu =
                "=== MENÚ Oficina ===\n" +
                        "1. Agregar empleado de planta\n" +
                        "2 Agregar empleado de ventas\n" +
                        "3. Agregar empleado temporal\n" +
                        "4. Mostrar todos los empleados\n" +
                        "5. Buscar empleado por documento\n" +
                        "6. Mostrar empleado con mayor salario neto\n" +
                        "7. Mostrar nómina total\n" +
                        "8. Mostrar resumen de pagos\n" +
                        "9. Salir\n\n" +
                        "Opción:";
        String input = JOptionPane.showInputDialog(menu);
        if (input == null) break;

        try {
            opcion = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            continue;
        }
        switch (opcion) {

            // CRUD EMPLEADO PLANTA
            case 1: {
                String sub = JOptionPane.showInputDialog(
                        "=== EMPLEADO PLANTA ===\n" +
                                "1. Crear\n" +
                                "2. Volver\n\nOpción:"
                );
                if (sub == null) break;

                int op = Integer.parseInt(sub);

                if (op = 1) {
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String documento = JOptionPane.showInputDialog("Documento:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    float salarioBase = Float.parseFloat(JOptionPane.showInputDialog("Salario base:"));
                    float descuentoSalud = Float.parseFloat(JOptionPane.showInputDialog("Descuento salud (%):"));
                    float descuentoPension = Float.parseFloat(JOptionPane.showInputDialog("Descuento pensión (%):"));

                    String categoriaStr = JOptionPane.showInputDialog("Categoría (JUNIOR, SEMI_SENIOR, SENIOR):");
                    CategoriaEmpleado categoria = CategoriaEmpleado.valueOf(categoriaStr);

                    String cargo = JOptionPane.showInputDialog("Cargo:");
                    int horasExtra = Integer.parseInt(JOptionPane.showInputDialog("Horas extra:"));
                    float valorHoraExtra = Float.parseFloat(JOptionPane.showInputDialog("Valor hora extra:"));
                    float auxilio = Float.parseFloat(JOptionPane.showInputDialog("Auxilio transporte:"));
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                }
            }
            break;


            // CRUD EMPLEADO VENTA
            case 2: {
                String sub = JOptionPane.showInputDialog(
                        "=== EMPLEADO VENTA ===\n" +
                                "1. Crear\n" +
                                "2. Volver\n\nOpción:"
                );
                if (sub == null) break;

                int op = Integer.parseInt(sub);

                if (op = 1) {
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String documento = JOptionPane.showInputDialog("Documento:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    float salarioBase = Float.parseFloat(JOptionPane.showInputDialog("Salario base:"));
                    float descuentoSalud = Float.parseFloat(JOptionPane.showInputDialog("Descuento salud (%):"));
                    float descuentoPension = Float.parseFloat(JOptionPane.showInputDialog("Descuento pensión (%):"));

                    String categoriaStr = JOptionPane.showInputDialog("Categoría (JUNIOR, SEMI_SENIOR, SENIOR):");
                    CategoriaEmpleado categoria = CategoriaEmpleado.valueOf(categoriaStr);

                    int totalVentas = Integer.parseInt(JOptionPane.showInputDialog("Total de ventas realizadas"));
                    float porcentajeComision = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje comisión (%)"));
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                }
            }
            break;
        }
    }
}


