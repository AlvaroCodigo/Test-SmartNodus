# Test-SmartNodus
Test SmartNodus


P _ Analice el siguiente algoritmo y escriba ¿Cuál es él o los errores que tiene? *

R _ El Pseudocódigo En si se ve como un ejercicio simple con muchos supuestos que se tienen que tener en cuenta, así como la palabra clave que dice "Mientras"
lo que indica que es un ciclo da a entender que se tiene que repetir hasta que se cumpla cierta condición, por lo que le agregaría un iterador de incremento y 
también asegurarme del ingreso correcto de los números en la división.



P - ¿Que es la traza de un algoritmo? *

R - La trazabilidad en el algoritmo se utiliza para poder darle seguimiento a las instrucciones que computa en el programa en desarrollo web la trazabilidad
se complementa con la clásica técnica de ver los retornos de las variables y objetos en mensajes de consola



p - Cree un algoritmo que despliegue en pantalla las tablas de multiplicar desde 0 a 12. *

R - El supuesto que entendí es que la pantalla muestre un numero finito de resultados por lo tanto el usuario debe ingresar si o si cuantas tablas quiere 
visualizar, de los contrario se formaría un bucle infinito comprometiendo la integridad y el rendimiento del programa. Se utiliza un doble bucle for para poder
trabajar con los indices de las tablas que se mostrarán y el otro también con los valores del mismo calculo pedido en el ejercicio.

````
 static public void tables (){
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese hasta que tabla desea ver: ");
    int inputNumber ;
    inputNumber = input.nextInt();
        for (int i = 0 ; i<= inputNumber ; i++ ) {
        System.out.println("Tabla " + i);
            for (int ii = 0 ; ii <=12; ii ++)
            {
                System.out.println(i + " * " + ii + " = " + i*ii);
            }
        }
    }
````
    
P - Cree un algoritmo que despliegue en pantalla la siguiente serie 0,1,1,2,3,5,8,13,…

R - En base al mismo supuesto de la pregunta pasada se le pide al usuario un numero finito de posibilidades en su 
    calculo en el caso del ejercicio entregado tomo como supuesto que los primeros valores son 0 y 1, para irlos sumando en función 
    De la fórmula para realizar el ejercicio  n = n-1 + n-2.
    
    
```` 
static public void fibo (){
      Scanner input = new Scanner(System.in);
        int w = 0;
        int x = 1;
        int y,v;
        System.out.print("Cantidad de numeros: ");
        v = input.nextInt();
        
        for (int i = 0; i < v ; i++){
            System.out.print(w);
            y = w+x;
            w = x;
            x = y;
        }  
    }
````
