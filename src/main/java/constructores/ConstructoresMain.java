package constructores;

public class ConstructoresMain {

    public static void main(String args[]) {

        ConstructorDefault obj1 = new ConstructorDefault();

        ConstructorDefaultSobreescrito obj2 = new ConstructorDefaultSobreescrito();
        obj2.nombre = "jamilett";

        System.out.println("nombre = " + obj2.nombre);

        ConstructorDefaultSobreescritoConArgumentos obj3 = new ConstructorDefaultSobreescritoConArgumentos("ilse");
        System.out.println("nombre = " + obj3.nombreClase);

        ConstructorFinal obj4 = new ConstructorFinal();
        obj4.nombreClase = "andres";
        System.out.println("nombre = " + obj4.nombreClase);

        ConstructorFinal obj5 = new ConstructorFinal("andres");
        System.out.println("nombre = " + obj5.nombreClase);

        ConstructorFinal obj6 = new ConstructorFinal("jesus");
        System.out.println("nombre = " + obj6.nombreClase);

    }

}
