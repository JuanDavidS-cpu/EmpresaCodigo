package uniquindio.edu.co;

public enum CategoriaEmpleado {
    JUNIOR (0.05f),
    SEMI_SENIOR(0.10f),
    SENIOR(0.15f);
    private float bonus;
    CategoriaEmpleado(float bonus) { this.bonus = bonus; }
    public float getBonus() { return bonus; }
    }
