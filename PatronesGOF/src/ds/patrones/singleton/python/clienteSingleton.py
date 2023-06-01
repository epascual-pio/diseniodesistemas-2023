#imports
from ImpresoraSingleton import ImpresoraSingleton


#funciones


#programa principal


def main():
    impresora = ImpresoraSingleton()
    impresora.imprimirTrabajo("Imprimiendo mensaje...")

    impresora2 = ImpresoraSingleton()
    impresora2.imprimirTrabajo("Imprimiendo mensaje 2...")

    impresora3 = ImpresoraSingleton()
    impresora2.imprimirTrabajo("Imprimiendo mensaje 3...")

    print(impresora)
    print(impresora2)
    print(impresora3)


if __name__ == "__main__":
    main()