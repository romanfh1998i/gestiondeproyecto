package restaurante

class Cuenta {
    Date fecha
    BigDecimal precioTotal
    String estadoCuenta

    static hasMany = [orden: Orden, factura: Factura]
    static belongsTo = [cliente: Cliente]
    static constraints = {
    }
}
