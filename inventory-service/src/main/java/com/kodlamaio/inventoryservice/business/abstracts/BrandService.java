package com.kodlamaio.inventoryservice.business.abstracts;

import com.kodlamaio.inventoryservice.business.dto.requests.create.Brand.CreateBrandRequest;
import com.kodlamaio.inventoryservice.business.dto.requests.update.Brand.UpdateBrandRequest;
import com.kodlamaio.inventoryservice.business.dto.responses.create.Brand.CreateBrandResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.Brand.GetAllBrandsResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.get.Brand.GetBrandResponse;
import com.kodlamaio.inventoryservice.business.dto.responses.update.Brand.UpdateBrandResponse;

import java.util.List;
import java.util.UUID;

public interface  BrandService {
    List<GetAllBrandsResponse> getAll();
    GetBrandResponse getById(UUID id);
    CreateBrandResponse add(CreateBrandRequest request);
    UpdateBrandResponse update(UUID id, UpdateBrandRequest request);
    void delete(UUID id);
}
