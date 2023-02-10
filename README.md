# Triangle_Automation

### Instruções de Execução

- Recomendável executar a automação no **_IntelliJ Idea_**.

1. Clone o projeto
<pre>
https://github.com/crisleyprestes/Triangle_Automation.git
</pre>
2. Importe o projeto para a IDE e execute a classe **_TriangleTest.java_** que está em **_/src/br.com.linhares.crisley/tests_**.

#### Notas:
- A automação é executada no **_Chrome_**, mas pode ser executada no **_Firefox_** também, para isso, é necessário alterar a variável **_BROWSER_** dentro da classe
**_Properties.java_**.
<pre>BROWSER = Browsers.CHROME</pre>
- A execução da automação gera screenshots de cada caso de teste, esses arquivos ficam salvos em **_/target/screenshot_**. Este diretório porém não é commitado no
repositório.
