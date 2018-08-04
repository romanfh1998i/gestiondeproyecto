package restaurante

class Restaurante {
    String nombre;
    String telefono
    String descripcion

    static hasMany = [empleado: Empleado]

    static constraints = {
        telefono unique: true
        descripcion max: "250"
    }
}
