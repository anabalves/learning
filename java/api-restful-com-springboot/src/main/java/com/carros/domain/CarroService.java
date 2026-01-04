package com.carros.domain;

import com.carros.domain.dto.CarroDTO;
import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<CarroDTO> getCarros() {
        return carroRepository.findAll().stream().map(CarroDTO::create).collect(Collectors.toList());
    }

    public Optional<CarroDTO> getCarroById(Long id) {
        return carroRepository.findById(id).map(CarroDTO::create);
    }

    public List<CarroDTO> getCarrosByTipo(String tipo) {
        return carroRepository.findByTipo(tipo).stream().map(CarroDTO::create).collect(Collectors.toList());
    }

    public CarroDTO insertCarro(Carro carro) {
        Assert.isNull(carro.getId(), "Não foi possível inserir o registro");

        return CarroDTO.create(carroRepository.save(carro));
    }

    public CarroDTO updateCarro(Long id, Carro carro) {
        Assert.notNull(id, "Não foi possível atualizar o registro");

        Optional<Carro> c = carroRepository.findById(id);
        if (c.isPresent()) {
            Carro carroUpdated = c.get();

            carroUpdated.setNome(carro.getNome());
            carroUpdated.setDescricao(carro.getDescricao());
            carroUpdated.setUrlFoto(carro.getUrlFoto());
            carroUpdated.setUrlVideo(carro.getUrlVideo());
            carroUpdated.setLatitude(carro.getLatitude());
            carroUpdated.setLongitude(carro.getLongitude());
            carroUpdated.setTipo(carro.getTipo());
            System.out.println("Carro id " + carroUpdated.getId());

            carroRepository.save(carroUpdated);

            return CarroDTO.create(carroUpdated);
        } else {
            return null;
        }
    }

    public boolean deleteCarro(Long id) {
        Optional<Carro> carro = carroRepository.findById(id);
        if (carro.isPresent()) {
            carroRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
