import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value= Parameterized.class)
public class pruebaJuego {

	@Parameters
	public static Iterable <Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{"TIJERAS","TIJERAS", 0},{"TIJERAS","PAPEL", 1},{"TIJERAS","PIEDRA", 2},{"TIJERAS","LAGARTO", 1},{"TIJERAS","SPOCK", 2},
			{"PAPEL","TIJERAS", 2},{"PAPEL","PAPEL", 0},{"PAPEL","PIEDRA", 1},{"PAPEL","LAGARTO", 2},{"PAPEL","SPOCK", 1},
			{"PIEDRA","TIJERAS", 1},{"PIEDRA","PAPEL", 2},{"PIEDRA","PIEDRA", 0},{"PIEDRA","LAGARTO", 1},{"PIEDRA","SPOCK", 2},
			{"LAGARTO","TIJERAS", 2},{"LAGARTO","PAPEL", 1},{"LAGARTO","PIEDRA", 2},{"LAGARTO","LAGARTO", 0},{"LAGARTO","SPOCK", 1},
			{"SPOCK","TIJERAS", 1},{"SPOCK","PAPEL", 2},{"SPOCK","PIEDRA", 1},{"SPOCK","LAGARTO", 2},{"SPOCK","SPOCK", 0},
		});
	}
	private String validMoves;
	private String validMovesIA;
	public int resultado;
	
	public void juegoTest(String validMoves, String validMovesIA, int resultado) {
		this.validMoves = validMoves;
		this.validMovesIA = validMovesIA;
		this.resultado = resultado;
	}
	@Test
	public void testCheckWinner() {
		int result = MoveWords.checkWinner(validMoves, validMovesIA);
		assertEquals(resultado, result);
	}
}
