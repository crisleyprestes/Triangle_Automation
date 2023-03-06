# Triangle_Automation

### Descrição

- Projeto de automação da aplicação [Triângulo](https://www.vanilton.net/triangulo/), utilizada em desafio técnico.

### Setup do projeto

- Para executar o projeto são necessárias as seguintes dependências:

  - [Selenium WebDriver Java v3.11.0](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.11.0)
  - [JUnit v4.12](https://mvnrepository.com/artifact/junit/junit/4.12)
  - [Apache Commons-io v2.11.0](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)
  - [Maven Surefire Plugin v3.0.0-M5](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin/3.0.0-M5)
  - [WebDriver Manager v5.3.2](https://github.com/bonigarcia/webdrivermanager)
  - [Java v8u361](https://www.oracle.com/br/java/technologies/javase/javase8u211-later-archive-downloads.html)
  - [Google Chrome v110.0.5481.178](https://www.google.com/intl/pt-BR/chrome/)
  - [IntelliJ Idea IDE](https://www.jetbrains.com/idea/download/#section=windows) 
  - [Git v2.39.1](https://git-scm.com/downloads)

### Importando o projeto

- Clone o projeto:
<pre>
git clone https://github.com/crisleyprestes/Triangle_Automation.git
</pre>

- Na IDE, importe o projeto e execute a classe **_TriangleTest.java_** em **_/src/br.com.linhares.crisley/tests_**.

- Os cenários de testes estão especificados no arquivo [**_Triangle.feature_**](https://github.com/crisleyprestes/Triangle_Automation/blob/master/src/resources/TestCases/Triangle.feature).

#### Notas:
- A automação é executada no **_Chrome_**, mas pode ser executada no **_Firefox_** também. Para isto, altere a variável **_BROWSER_** na classe
**_Properties.java_**.
<pre>
...
    public static Browsers BROWSER = Browsers.CHROME;
...
</pre>

- A automação gera screenshots de execução em cada caso de teste, os arquivos são salvos em **_/target/screenshot_**. 
- Este diretório não é commitado no repositório.

- Não foi possível reproduzir a mensagem de erro quando a condição de existência de um triângulo não é obedecida. Segundo a regra **_Lembre-se que os lados só formam um triângulo se o comprimento de um lado for sempre menor do que a soma dos outros dois_**, independente dos valores inseridos, ela sempre será válida.
