package com.kodlamaio.inventoryservice.business.abstracts;

import com.kodlamaio.inventoryservice.business.dto.requests.create.Model.CreateModelRequest;
import com.kodlamaio.inventoryservice.business.dto.requests.update.Model.UpdateModelRequest;
import com.kodlamaio.inventoryservice.business.dto.responses.create.Model.CreateModelResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.Model.GetAllModelsResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.Model.GetModelResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.update.Model.UpdateModelResponse;

import java.util.List;
import java.util.UUID;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    GetModelResponse getById(UUID id);
    CreateModelResponse add(CreateModelRequest request);
    UpdateModelResponse update(UUID id, UpdateModelRequest request);
    void delete(UUID id);
}
