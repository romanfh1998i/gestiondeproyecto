package restaurante

class Orden {

    Date fechaOrden
    String descripcion
    String precioTotalOrden
    String estado
    Mesero mesero
    Cliente cliente
    Mesa mesa
    static hasMany = [platillo: Platillo, bebida:Bebida]
    static belongsTo = [orden:Orden]
//    static hasOne = [mesa: Mesa, cliente: Cliente, mesero:Mesero]

    static constraints = {
    }
}
