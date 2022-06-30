package dharani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dharani.repo.interface1;


@RestController
public class controller {
@Autowired
private interface1 obj;

@GetMapping("/bsort")
public int[]  bsort(@RequestBody int[] array) {
	obj.bubblesort(array);
	return array;
}


}
