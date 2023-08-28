package form.formbackend.controller;

import form.formbackend.entity.Form;
import form.formbackend.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FormController {
    private FormService formService;

    @Autowired
    public FormController(FormService formService) {
        this.formService = formService;
    }

    @GetMapping("/get")
    public List<Form> getAllForm() {
        return formService.findAll();
    }
    @GetMapping("/get/{theId}")
    public Form getFormById(@PathVariable Long theId) {
        return formService.findById(theId);
    }

    @PostMapping("/create")
    public Form createForm(@RequestBody Form form) {
        return formService.addForm(form);
    }

    @DeleteMapping("/delete/{theId}")
    public String deleteFormById(@PathVariable Long theId) {
        formService.delete(theId);
        return "delete successfully";
    }
}
