### Atencao

Ao utilizar a anotacao 

### @ExtendWith(MockitoExtension.class)

em cima da classe de teste, por exemplo:

@ExtendWith(MockitoExtension.class)</br>
class CalculadoraTest {

Nao sera necessario o uso do codigo abaixo, dentro do init:</br>

MockitoAnnotations.openMocks(this);
