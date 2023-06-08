package com.kodlamaio.inventoryservice.business.abstracts;

import com.kodlamaio.commonpackage.utils.dto.CarClientResponse;
import com.kodlamaio.commonpackage.utils.dto.ClientResponse;
import com.kodlamaio.inventoryservice.business.dto.requests.create.Car.CreateCarRequest;
import com.kodlamaio.inventoryservice.business.dto.requests.update.Car.UpdateCarRequest;
import com.kodlamaio.inventoryservice.business.dto.responses.create.Car.CreateCarResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.Car.GetAllCarsResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.Car.GetCarResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.update.Car.UpdateCarResponse;
import com.kodlamaio.inventoryservice.entities.enums.State;

import java.util.List;
import java.util.UUID;

public interface CarService {
    List<GetAllCarsResponse> getAll();

    GetCarResponse getById(UUID id);

    CreateCarResponse add(CreateCarRequest request);

    UpdateCarResponse update(UUID id, UpdateCarRequest request);

    void delete(UUID id);

    ClientResponse checkIfCarAvailable(UUID id);

    void changeStateByCarId(State state, UUID id);

    CarClientResponse getByIdForInvoice(UUID id);
}

