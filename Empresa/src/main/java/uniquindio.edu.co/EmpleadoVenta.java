package uniquindio.edu.co;


public class EmpleadoVenta extends Empleado {
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVenta(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension, float totalVentas, float porcentajeComision) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension);
        this.totalVentas = 0;
        this.porcentajeComision = 0;
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
        return "EmpleadoVentas{" +
                "totalVentas=" + totalVentas +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }


}
