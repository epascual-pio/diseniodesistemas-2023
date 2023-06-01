class ImpresoraSingleton():

    __instancia = None

    def __init__(selft):
        pass

    def __new__(cls):
        if ImpresoraSingleton.__instancia is None:
            ImpresoraSingleton.__instancia= object.__new__(cls)

        return ImpresoraSingleton.__instancia

    def imprimirTrabajo(self,mensaje):
        print(mensaje)