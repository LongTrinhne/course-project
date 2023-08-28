package form.formbackend.service;

import form.formbackend.entity.Form;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FormService {
    List<Form> findAll();
    Form findById(Long theId);
    Form save(Form form);
    Form addForm(Form form);
    void delete(Long theId);
}
