package uniquindio.edu.co;

public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float salarioBase, float descuentoSalud,
                            float descuentoPension, CategoriaEmpleado categoriaEmpleado, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, salarioBase, descuentoSalud, descuentoPension, categoriaEmpleado);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

    public float calcularSalarioBruto(int diasTrabajados, float valorDia) {
        float salario = (diasTrabajados * valorDia);
        return salario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }
}