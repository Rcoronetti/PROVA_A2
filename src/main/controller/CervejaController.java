package Cerveja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class CervejaController {

    @PostMapping("/cerveja")
	public Pessoa saveCerveja(@RequestBody Cerveja cerveja) {
		return cervejaService.saveCerveja(cerveja);
	}
	
	@GetMapping("/cerveja/{id}")
	public Cerveja getCerveja(@PathVariable("id") Long id) {
		return cervejaService.getCervejaById(id);
	}
    


