package com.examples.examples.resources;

import com.examples.examples.DTO.ArrayDTO;
import com.examples.examples.services.IterationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/iteration")
public class IterationsController {

    @Autowired
    private IterationsService iterationService;

    public IterationsController(IterationsService iterationService) {
        this.iterationService = iterationService;
    }

    /**
     *
     * @return Only to check that this controller works.
     */
    @GetMapping("/array")
    public ResponseEntity<String> checkArray() {
        return new ResponseEntity<>("Multidimensional array ->", HttpStatus.OK);
    }

    /**
     *
     * @param array ArrayDTO type
     * @return ResponseEntity of ArrayDTO
     */
    @PostMapping(path ="/array", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ArrayDTO> multidimensionalArray(@RequestBody @Valid ArrayDTO array) {
        ArrayDTO response = new ArrayDTO();
        response.setIntArray(iterationService.sortedNumberArray(array.getIntArray()));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
