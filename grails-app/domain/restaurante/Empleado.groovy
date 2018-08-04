package restaurante

class Empleado {

    String nombre
    Date fechaVinculacion
    String horaIngreso
    String horaSalida
    String tipo

    static belongsTo = [restaurante: Restaurante]
    static constraints = {
        nombre min: "2"
    }
}
