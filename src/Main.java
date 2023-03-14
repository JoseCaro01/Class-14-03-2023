import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Acceder a la constante de un enum mediante NombreEnum.NOMBRE_CONSTANTE
        Customer customer = new Customer("Jose", Status.INACTIVE);

        //Acceder al juego\ Comparacion enums
        if (customer.getStatus2().equals(Status.BANNED)) {
            throw new IllegalArgumentException();
        }


        /* Array int[] , Listas List<Integer> */
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.addAll(List.of(customer, customer, customer));

        System.out.println(customers.size());
        for (Customer customer1 :
                customers) {
            System.out.println(customer1.getName());
        }

        /* Definir HashMap */
        HashMap<String, Customer> hashMap = new HashMap<>();
        /* Introducir un elemento al HashMap */
        hashMap.put(customer.getName(), customer);
        /* Introducir varios elementos al HashMap*/
        hashMap.putAll(Map.of(customer.getName(), customer));
        /* Acceder a un elemento del HashMap (Si no existe devuelve NULL) */
        System.out.println(hashMap.get("Jo"));
        System.out.println(hashMap.size());

        /* Recorrer claves de un HashMap*/
        for (String clave : hashMap.keySet()) {
            /* Añadir elemento si esta ausente la clave */
            hashMap.putIfAbsent(customer.getName(), customer);
            /* Comprobar si una clave esta ausente */
            System.out.println(    hashMap.containsKey(customer.getName()));
            /* Comprobar si un valor esta ausente */
            System.out.println( hashMap.containsValue(customer));
            /* Eliminar un elemento del HashMap*/
            hashMap.remove("Jose");
            //   hashMap.replace() | hashMap.isEmpty() | hashMap.clear();


        }
        /* Recorrer Valores de un HashMap */
        for (Customer valor : hashMap.values()) {
            System.out.println(valor);
        }
        /* Recorrer clave y valores de un HashMap*/
        hashMap.forEach((s, customer1) -> {
            System.out.println(s + " " + customer1.getName());
        });


    }

}