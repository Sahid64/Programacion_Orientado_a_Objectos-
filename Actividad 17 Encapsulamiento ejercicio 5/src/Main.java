import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profesor profesor = null;
        Estudiante estudiante = null;
        Curso curso = null;
        Departamento departamento = null;
        Universidad universidad = null;

        boolean continuar = true;
        while (continuar){
            System.out.println("==== Sistema de Gestion Universidad ====");
            System.out.println("1. Crear Profesor");
            System.out.println("2. Crear Estudiante");
            System.out.println("3. Crear Curso");
            System.out.println("4. Crear Departamento");
            System.out.println("5. Crear Universidad");
            System.out.println("6. Mostrar Profesor");
            System.out.println("7. Mostrar Estudiante");
            System.out.println("8. Mostrar Curso");
            System.out.println("9. Mostrar Departamento");
            System.out.println("10. Mostrar Universidad");
            System.out.println("11. Modificar Profesor");
            System.out.println("12. Modificar Estudiante");
            System.out.println("13. Modificar Curso");
            System.out.println("14. Modificar Departamento");
            System.out.println("15. Modificar Universidad");
            System.out.println("16. Salir");
            System.out.println("Seleccione una opcion: ");
            int opcion = sc.nextInt();
            if (opcion==1){
                System.out.println("Ingresa ID del Profesor: ");
                int idProfesor = sc.nextInt();
                System.out.println("Ingresa el Nombre: ");
                String nombreProfesor = sc.next();
                System.out.println("Ingresa la edad: ");
                int edadProfesor = sc.nextInt();
                System.out.println("Ingresa la materia: ");
                String materia = sc.next();
                profesor = new Profesor(idProfesor,nombreProfesor,edadProfesor,materia);
                System.out.println("Profesor creado exitosamente");
            } else if (opcion==2){
                System.out.println("Ingresa ID del Estudiante: ");
                int idEstudiante = sc.nextInt();
                System.out.println("Ingresa el Nombre: ");
                String nombreEstudiante = sc.next();
                System.out.println("Ingresa la edad: ");
                int edadEstudiante = sc.nextInt();
                System.out.println("Ingresa el promedio: ");
                double promedio = sc.nextDouble();
                estudiante = new Estudiante(idEstudiante,nombreEstudiante,edadEstudiante,promedio);
                System.out.println("Estudiante creado exitosamente");
            } else if (opcion ==3){
                System.out.println("Ingresa ID del curso: ");
                int idCurso = sc.nextInt();
                System.out.println("Ingresa el nombre del curso: ");
                String nombreCurso = sc.next();
                if (profesor==null){
                    System.out.println("No hay profesor asignado aun. Crea un profesor.");
                }
                System.out.println("Ingresa la cantidad de estudiantes en el curso: ");
                int cantidadEstudiantes = sc.nextInt();
                Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];
                for (int i=0;i<cantidadEstudiantes;i++){
                    System.out.println("Ingresa ID del estudiante"+(i+1)+":");
                    int idEst = sc.nextInt();
                    if (estudiante != null && estudiante.getIdEstudiante() == idEst){
                        estudiantes[i] = estudiante;
                    } else {
                        System.out.println("Estudiante no encontrado. Crea un estudiante");
                    }
                }
                curso = new Curso(idCurso,nombreCurso,profesor,estudiantes);
                System.out.println("Curso creado");
            } else if (opcion==4) {
                System.out.println("Ingresa ID del departamento: ");
                int idDepartamento = sc.nextInt();
                System.out.println("Ingresa el nombre del departamento: ");
                String nombreDepartamento = sc.next();
                if (curso==null){
                    System.out.println("No vay cursos asignados");
                }
                Curso[] cursos = {
                        curso
                };
                departamento = new Departamento(idDepartamento,nombreDepartamento,cursos);
                System.out.println("Departamento creado");
            } else if (opcion==5) {
                System.out.println("Ingresa ID de la Universidad: ");
                int idUniversidad = sc.nextInt();
                System.out.println("Ingresa el nombre del departamento: ");
                String nombreUniversidad = sc.next();
                if (curso==null){
                    System.out.println("No vay cursos asignados");
                }
                Departamento[] departamentos = {
                        departamento
                };
                universidad = new Universidad(idUniversidad,nombreUniversidad,departamentos);
                System.out.println("Departamento creado");
            }
            if (opcion==6){
                if (profesor!=null){
                    profesor.mostrarProfesor();
                } else {
                    System.out.println("No hay Profesor creado");
                }
            }
            if (opcion==7){
                if (estudiante!=null){
                    estudiante.mostrarEstudiante();
                } else {
                    System.out.println("No hay Estudiante creado");
                }
            }
            if (opcion==8){
                if (curso!=null){
                    curso.mostrarCurso();
                } else {
                    System.out.println("No hay Creado creado");
                }
            }
            if (opcion==9){
                if (departamento!=null){
                    departamento.mostrarDepartamento();
                } else {
                    System.out.println("No hay Departamento creado");
                }
            }
            if (opcion==10){
                if (universidad!=null){
                    universidad.mostrarUniversidad();
                } else {
                    System.out.println("No hay Universidad creado");
                }
            }
            if (opcion==11){
                if (profesor!= null){
                    System.out.println("Ingresa nuevo nombre del profesor: ");
                    profesor.setNombre(sc.next());
                    System.out.println("Ingresa la nueva edad del profesor: ");
                    profesor.setEdad(sc.nextInt());
                    System.out.println("Ingresa la nueva materia del profesor: ");
                    profesor.setMateria(sc.next());
                    System.out.println("Profesor modificado");
                } else {
                    System.out.println("No hay Profesor creado");
                }
            } else if (opcion==12) {
                if (estudiante!= null){
                    System.out.println("Ingresa nuevo nombre del estudiante: ");
                    estudiante.setNombre(sc.next());
                    System.out.println("Ingresa la nueva edad del estudiante: ");
                    estudiante.setEdad(sc.nextInt());
                    System.out.println("Ingresa la nuevo promedio del estudiante: ");
                    estudiante.setPromedio(sc.nextDouble());
                    System.out.println("Estudiante modificado");
                } else {
                    System.out.println("No hay estudiante creado");
                }
            } else if (opcion==13) {
                if (curso!= null){
                    System.out.println("Ingresa nuevo nombre del Curso: ");
                    curso.setNombre(sc.next());
                    System.out.println("Curso modificado");
                } else {
                    System.out.println("No hay Curso creado");
                }
            } else if (opcion==14) {
                if (departamento!= null){
                    System.out.println("Ingresa nuevo nombre del departamento: ");
                    departamento.setNombre(sc.next());
                    System.out.println("Departamento modificado");
                } else {
                    System.out.println("No hay Departamento creado");
                }
            } else if (opcion==15) {
                if (universidad!= null){
                    System.out.println("Ingresa nuevo nombre del universida: ");
                    universidad.setNombre(sc.next());
                    System.out.println("Universidad modificado");
                } else {
                    System.out.println("No hay Universidad creado");
                }
            } else if (opcion==16) {
                System.out.println("Saliendo del sistema...");
                continuar = false;
            } else {
                System.out.println("Opcion invalida. Intentalo nuevamente");
            }
        }
    }
}