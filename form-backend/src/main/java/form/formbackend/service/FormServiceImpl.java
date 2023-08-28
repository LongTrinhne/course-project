package form.formbackend.service;

import form.formbackend.entity.Form;
import form.formbackend.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormServiceImpl implements FormService {
    private FormRepository formRepository;

    @Autowired
    public FormServiceImpl(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @Override
    public List<Form> findAll() {
        return formRepository.findAll();
    }

    @Override
    public Form findById(Long theId) {
        return formRepository.findById(theId).orElseThrow(()->
                new RuntimeException("Can not find the form"));
    }

    @Override
    public Form save(Form form) {
        return formRepository.save(form);
    }

    @Override
    public Form addForm(Form form) {
        Form tmpForm = new Form();
        tmpForm.setId(0);
        tmpForm.setMaSinhVien(form.getMaSinhVien());
        tmpForm.setHoTen(form.getHoTen());
        tmpForm.setEmail(form.getEmail());
        tmpForm.setGioiTinh(form.getGioiTinh());
        tmpForm.setSoThich(form.getSoThich());
        tmpForm.setQuocTich(form.getQuocTich());
        tmpForm.setBosung(form.getBosung());
        return formRepository.save(tmpForm);
    }

    @Override
    public void delete(Long theId) {
        Form tmpForm = findById(theId);
        formRepository.delete(tmpForm);
    }
}
