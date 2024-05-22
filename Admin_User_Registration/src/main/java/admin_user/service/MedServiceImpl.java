package admin_user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin_user.model.Meddetail;
import admin_user.repositories.MedUserRepository;



@Service
public class  MedServiceImpl implements MedicineService {
    @Autowired
    private MedUserRepository userRepository;

    @Override
    public List<Meddetail> getAllMedicines() {
        return (List<Meddetail>) userRepository.findAll();
    }
}
