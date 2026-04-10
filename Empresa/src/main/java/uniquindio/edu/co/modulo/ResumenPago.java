package uniquindio.edu.co.modulo;

public record ResumenPago {
    private String documento;
    private String nombre;
    private String tipoEmpleado;
    private float salarioBruto;
    private float descuentos;
    private float salarioNeto;

    public ResumenPago(String documento, String nombre, String tipoEmpleado,
                       float salarioBruto, float descuentos, float salarioNeto) {
        this.documento = documento;
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
        this.salarioBruto = salarioBruto;
        this.descuentos = descuentos;
        this.salarioNeto = salarioNeto;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public float getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(float descuentos) {
        this.descuentos = descuentos;
    }

    public float getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(float salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "ResumenPago{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoEmpleado='" + tipoEmpleado + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", descuentos=" + descuentos +
                ", salarioNeto=" + salarioNeto +
                '}';
    }
}
