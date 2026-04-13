package uniquindio.edu.co;

public abstract class Empleado {
    private String nombre;
    private String documento;
    private int edad;
    private float salarioBase;
    private float descuentoSalud;
    private float descuentoPension;
    private CategoriaEmpleado categoria;


    public Empleado(String nombre, String documento, int edad, float salarioBase, float descuentoSalud, float descuentoPension,
                    CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
        this.categoria = categoria;

    }
    public abstract float calcularSalarioBruto();

    public float calcularBonificacionCategoria (){
        if (categoria == CategoriaEmpleado.JUNIOR) {
           return salarioBase * 0.05f;
        }
        if (categoria == CategoriaEmpleado.SEMI_SENIOR) {
            return salarioBase * 0.10f;
        }
        if (categoria == CategoriaEmpleado.SENIOR) {
            return salarioBase * 0.15f;
        }else{
            return 0;
        }
    }


    public float calcularDescuento (float descuentoSalud,float descuentoPension){
        return (calcularSalarioBruto() * descuentoSalud /100) + (calcularSalarioBruto()* descuentoPension/100);
    }

    public float calcularSalarioNeto (float salarioBase){
        return salarioBase - calcularSalarioBruto();
    }

    public void mostrarInformacion (String documento, String nombre, float salarioBase){
        System.out.println ("Documento: " + documento + "/n" + "Nombre: " + nombre + "/n" + "Edad: " + edad + "SalarioBase: " + salarioBase + "/n" + "CategoriaEmpleado: " + categoria + "/n"
                + "SalarioBruto: " + calcularSalarioBruto() + "/n" + "SalarioNeto: " + calcularSalarioNeto(salarioBase));
    }

    public ResumenPago generarNuevoResumenPago(){
        return new ResumenPago (documento,nombre,this.getClass().getSimpleName(),calcularSalarioBruto(),calcularDescuento(descuentoSalud,descuentoPension),calcularSalarioNeto(salarioBase));
    }
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(float descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(float descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", edad=" + edad +
                ", salarioBase=" + salarioBase +
                ", descuentoSalud=" + descuentoSalud +
                ", descuentoPension=" + descuentoPension +
                '}';
    }
}
