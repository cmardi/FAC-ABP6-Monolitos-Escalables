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
