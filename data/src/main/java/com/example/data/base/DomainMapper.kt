package com.example.data.base

interface DomainMapper<T, DomainModel> {
    fun mapToDomainModel(model: T): DomainModel
}

interface DataMapper<T, DomainModel> {
    fun mapToDataModel(domainModel: DomainModel): T
}