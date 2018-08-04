package restaurante

class Cliente {
//    Long id
    String nombre

    static hasMany = [cuenta: Cuenta]
    static hasOne = [mesa: Mesa]
    static belongsTo = [factura:Factura]
    static constraints = {
    }
}
