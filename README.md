## Ciclo TDD – Fase RED

- Proyecto creado en VS Code con Maven y JDK 17.
- Dependencias configuradas: JUnit 5 y plugin JaCoCo en 'pom.xml'.
- Se creó la clase de pruebas 'src/test/java/com/ejemplo/tdd/CalculadoraTest.java' con los casos:
  - 'sumar_debeRetornar5_para2y3()'
  - 'restar_debeRetornar1_para4y3()'
  - 'multiplicar_debeRetornar12_para3y4()'
  - 'dividir_debeRetornar2_para10y5()'
- Al ejecutar las pruebas desde VS Code (Testing → Run All Tests) o 'mvn test' en la terminal integrada, falla la compilación con error 'cannot find symbol: class Calculadora'.
- Se registra el commit:
  - **Mensaje**: 'RED: pruebas JUnit para Calculadora (sumar, restar, multiplicar, dividir) — fallan por falta de implementación'
  - **Motivo**: No existe la clase 'Calculadora' ni sus métodos. Fase RED confirmada.

## Ciclo TDD – Fase GREEN
- Implementación mínima para pasar pruebas
- Tras la fase RED, se implementó la clase Calculadora con los métodos necesarios para que las pruebas unitarias pasen exitosamente.
- Se creó la clase Calculadora en src/main/java/com/abp6/tdd/Calculadora.java.
- Se implementaron los siguientes métodos:
•	int sumar(int a, int b)
•	int restar(int a, int b)
•	int multiplicar(int a, int b)
•	int dividir(int a, int b)
- Resultado de pruebas:
- Al ejecutar las pruebas desde VS Code (Testing → Run All Tests) o 'mvn test' en la terminal integrada, las pruebas ahora pasan correctamente:
•	[INFO] calculadora-tdd .................................... SUCCESS [  4.882 s]
•	[INFO] ABP6-MONOLITOS-ESCALABLES .......................... SUCCESS [  0.022 s]
•	[INFO] BUILD SUCCESS
•	[INFO] Total time:  5.089 s
La implementación fue mínima y directa, cumpliendo con los requisitos de cada prueba sin aplicar validaciones ni refactorizaciones adicionales.

## Ciclo TDD – Fase REFACTOR
- Objetivo de la Refactorización: Mejorar el diseño del código sin alterar su funcionalidad, garantizando que todas las pruebas continúen pasando.
- Validación previa: Tras confirmar que todas las pruebas pasaron en la fase GREEN, se realizaron mejoras estructurales al código de la clase Calculadora.
- Refactorizaciones aplicadas:
•	Renombrado de variables y métodos: Se renombraron variables y métodos para mayor claridad y comprensión del código.
•	Eliminación de código duplicado: Se eliminó el código duplicado en los métodos aritméticos, promoviendo la reutilización y simplificación del código.
•	Aplicación de principios SOLID: Se aplicaron principios SOLID donde fue pertinente para mejorar la mantenibilidad y escalabilidad del código:
	Responsabilidad Única: Cada clase y método ahora tiene una única responsabilidad.
	Abierto/Cerrado: Las clases son abiertas para extensión pero cerradas para modificación.
•	Separación de lógica en métodos auxiliares: Se separó la lógica en métodos auxiliares para facilitar pruebas futuras y mejorar la legibilidad.
•	Uso de patrones de diseño: Se consideraron patrones de diseño (como el patrón Estrategia o el patrón Comando) para resolver problemas recurrentes y mejorar la estructura del código.
- Interpretación de los resultados:
•	Cobertura de línea: Porcentaje de líneas de código ejecutadas durante las pruebas. Se busca un mínimo del 80% para asegurar una buena cobertura.
•	Cobertura de rama: Porcentaje de ramas (condiciones) ejecutadas. Se recomienda una cobertura de al menos el 70% para detectar errores lógicos.
•	Cobertura de método: Porcentaje de métodos que han sido llamados. Se debe aspirar a que el 100% de los métodos críticos sean cubiertos por pruebas.
•	Análisis de complejidad ciclomática: Se realizó un análisis de la complejidad ciclomática para identificar métodos que podrían ser difíciles de probar o mantener.
•	Revisión de código: Se implementó una revisión de código entre pares para asegurar que las refactorizaciones no introdujeran nuevos errores y que se mantuviera la calidad del código.
•	Documentación y seguimiento: Se documentaron los cambios realizados y se establecieron métricas para el seguimiento de la calidad del código en futuras iteraciones.
- Consideraciones finales
•	La fase de refactorización es crucial para mantener la salud del código a largo plazo. Un código limpio y bien estructurado no solo facilita el mantenimiento, sino que también mejora la colaboración en equipo y la adaptabilidad a cambios futuros.

