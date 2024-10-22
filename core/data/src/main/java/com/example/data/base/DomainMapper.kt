package com.example.data.base

// FIXME: update function name and  
interface DomainMapper<T, DomainModel> {
    fun mapToDomainModel(model: T): DomainModel
}

interface DataMapper<T, DomainModel> {
    fun mapToDataModel(domainModel: DomainModel): T
}