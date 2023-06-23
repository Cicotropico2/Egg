
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iofefe
 */
public class Simulador {

    /**
     * Además, crearemos una clase Simulador que va a tener los métodos para
     * manejar los alumnos y sus votaciones. Estos métodos serán llamados desde
     * el main.
     */
    /**
     * La clase Simulador debe tener un método que genere un listado de alumnos
     * manera aleatoria y lo retorne. Las combinaciones de nombre y apellido
     * deben ser generadas de manera aleatoria. Nota: usar listas de tipo String
     * para generar los nombres y los apellidos.
     */
    public Simulador() {
    }

    public ArrayList generarNombreyApellido() {
        String[] nombres = {"Oliver", "Emma", "Noah", "Sophia", "Liam", "Ava", "William", "Isabella", "James", "Mia", "Benjamin", "Charlotte", "Lucas", "Amelia", "Henry", "Harper", "Alexander", "Evelyn", "Michael", "Abigail", "Daniel", "Emily", "Matthew", "Elizabeth", "Jackson", "Sofia", "Logan", "Avery", "David", "Ella", "Joseph", "Scarlett", "Samuel", "Grace", "Owen", "Chloe", "Sebastian", "Victoria", "Gabriel", "Riley"};
        String[] apellidos = {"Rodríguez", "González", "López", "Pérez", "García", "Martínez", "Hernández", "Gómez", "Fernández", "Sánchez", "Romero", "Torres", "Ramírez", "Flores", "Alvarez", "Vargas", "Ruiz", "Cruz", "Mendoza", "Ortega", "Castro", "Silva", "Reyes", "Morales", "Delgado", "Rojas", "Navarro", "Jiménez", "Moreno", "Ramos", "Carrasco", "Soto", "Guerrero", "Gutiérrez", "Herrera", "Medina", "Aguilar", "Palacios", "Cabrera", "Campos", "Pereira"};
        ArrayList<String> nombreFormados = new ArrayList();
        String nombreCompletos;
        for (int i = 0; i < 40; i++) {
            nombreCompletos = nombres[(int) (Math.random() * 40)] + " " + apellidos[(int) (Math.random() * 40)];
            nombreFormados.add(nombreCompletos);
        }
        return nombreFormados;
    }

    /**
     * Ahora hacer un generador de combinaciones de DNI posibles, deben estar
     * dentro de un rango real de números de documentos. Y agregar a los alumnos
     * su DNI. Este método debe retornar la lista de dnis.
     */
    public ArrayList generarDNI() {
        ArrayList<String> dni = new ArrayList();
        boolean bandera;
        for (int i = 0; i < 40; i++) {
            do {
                bandera = false;
                long DNI = (long) (Math.random() * 35000000) + 10000000;
                String DNISTRING = Long.toString(DNI);
                if (!dni.contains(DNISTRING)) {
                    dni.add(DNISTRING);
                    bandera = true;
                }
            } while (!bandera);
        }
        return dni;
    }

    /**
     * Ahora tendremos un método que, usando las dos listas generadas, cree una
     * cantidad de objetos Alumno, elegidos por el usuario, y le asigne los
     * nombres y los dnis de las dos listas a cada objeto Alumno. No puede haber
     * dos alumnos con el mismo dni, pero si con el mismo nombre.
     */
    public ArrayList crearAlumno() {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<String> nombre = this.generarNombreyApellido();
        ArrayList<String> DNI = this.generarDNI();
        ArrayList<Integer> DNIPosiciones = new ArrayList();
        System.out.println("Elija la cantidad de alumnos para ser generados: ");
        int cantidad = entrada.nextInt();
        boolean bandera;
        for (int i = 0; i < cantidad; i++) {
            do {
                bandera = false;
                int DNIposicion = (int) (Math.random() * 40);
                System.out.println(DNIposicion);
                if (!DNIPosiciones.contains(DNIposicion)) {
                    DNIPosiciones.add((DNIposicion));
                    alumnos.add(new Alumno(nombre.get(DNIposicion), DNI.get(DNIposicion), 0));
                      /// i
                    bandera = true;
                }
            } while (!bandera);
        }
        this.imprimirLista(alumnos, cantidad);
        return alumnos;
    }

    /**
     * mostrar los alumnos
     */
    public void imprimirLista(ArrayList<Alumno> alumnos, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(alumnos.get(i));
            System.out.println(i);
        }
    }

    /**
     * Crearemos un método votación en la clase Simulador que, recibe el listado
     * de alumnos y para cada alumno genera tres votos de manera aleatoria. En
     * este método debemos guardar a el alumno que vota, a los alumnos a los que
     * votó y sumarle uno a la cantidad de votos a cada alumno que reciba un
     * voto, que es un atributo de la clase Alumno. Tener en cuenta que un
     * alumno no puede votarse a sí mismo o votar más de una vez al mismo
     * alumno. Utilizar un hashset para resolver esto.
     */
    public ArrayList Votos(ArrayList<Alumno> alumnos) {
        ArrayList<Voto> votos = new ArrayList();
        /**
         *
         */
        ArrayList<Alumno> votados = new ArrayList();
        /// Alumno alumnoVotador, ArrayList<Alumno> alumnosVotados)
        boolean bandera;
        for (int i = 0; i < alumnos.size(); i++) {
            votados.clear();
            for (int j = 0; j < 3; j++) {
                do {
                    // 2
                    bandera = false;
                    int random = (int) (Math.random() * alumnos.size());
                    /// i(1),
                    if (!alumnos.get(i).equals(alumnos.get(random))) {
                        /**
                         * 0   20, perez
                         * 
                         */
                        for (Alumno votado : votados) {

                            /**
                             * No votar 2 veces a lamisma persona
                             */
                            if (votado.equals(alumnos.get(random))) {
                                bandera = true;
                            }
                        }
                    } else {
                        bandera = true;
                    }
                    if (!bandera) {
                        votados.add(alumnos.get(random));
                        alumnos.get(random).setCantidadVotos(alumnos.get(random).getCantidadVotos() + 1);
                    }
                } while (bandera);
            }
            votos.add(new Voto(alumnos.get(i), votados));
        }
        return votos;
    }

    /**
     * Se debe crear un método que muestre a cada Alumno con su cantidad de
     * votos y cuales fueron sus 3 votos.
     */
    public void mostrarVotos(ArrayList<Voto> votos) {
        for (Voto voto : votos) {
            System.out.println(voto.getAlumnoVotador().getNombre());
            System.out.println(voto.getAlumnoVotador().getCantidadVotos());
            for (Alumno AlumnosVotados : voto.getAlumnosVotados()) {
                System.out.println(AlumnosVotados.getNombre());
                System.out.println("Todos putos");
            }
        }
    }
    /**
     * Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se
     * deben crear 5 facilitadores suplentes con los 5 segundos alumnos más
     * votados. A continuación, mostrar los 5 facilitadores y los 5
     * facilitadores suplentes.
     */
    public void facilitadores(ArrayList<Alumno> alumnos ){
        Collections.sort(alumnos, Comparador.ordenarPorVotos);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(alumnos.get(i));
        }
    }
    
}
