package restaurante

class BootStrap {

    def init = { servletContext ->
        Cliente cliente=new Cliente(nombre: "John").save()
    }
    def destroy = {
    }
}
