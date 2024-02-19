package com.example.msmorenoalva.domain.ports.out;

import com.example.msmorenoalva.domain.aggregates.response.ResponseReniec;

public interface RestReniecOut {
    ResponseReniec getInfoReniec(String numDoc);
}
