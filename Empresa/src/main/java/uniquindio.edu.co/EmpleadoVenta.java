package uniquindio.edu.co;


public class EmpleadoVenta extends Empleado {
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVenta(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension,
                         CategoriaEmpleado categoria,float totalVentas, float porcentajeComision) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoria);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }

    public float calcularSalarioBruto(){
        float comision = (totalVentas * porcentajeComision /100);

        return calcularBonificacionCategoria() + comision;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String toString() {
        return "EmpleadoVenta{" +
                "totalVentas=" + totalVentas +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }
}
