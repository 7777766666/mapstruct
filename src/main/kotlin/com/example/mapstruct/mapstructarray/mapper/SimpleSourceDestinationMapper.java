package com.example.mapstruct.mapstructarray.mapper;

import com.example.mapstruct.mapstructarray.madel.A;
import com.example.mapstruct.mapstructarray.madel.B;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationMapper {
    A sourceToDestination(A source);
    B destinationToSource(B destination);
}